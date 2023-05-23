class RandomizedSet {
    
    private Map<Integer,Integer> map;
    private int[] array;
    private int idx;


    public RandomizedSet() {
        this.map=new HashMap<>();
        this.array=new int[200001];
        this.idx=0;
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,idx);
        array[idx++]=val;
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }

        int index=map.remove(val);

        if(index==idx-1){
            idx--;
        }else{
            array[index]=array[--idx];
            map.put(array[index],index);
        }
        return true;
    }
    
    public int getRandom() {
        return array[new Random().nextInt(idx)];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */