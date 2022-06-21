class MyHashSet {
    
    ArrayList<Integer> hashset;

    public MyHashSet() {
        hashset = new ArrayList<>();
    }
    
    public void add(int key) {
        if(hashset.contains(key)){
            return;
        }
        
        hashset.add(key);
        
    }
    
    public void remove(int key) {
        if(hashset.contains(key)){
            hashset.remove(new Integer(key));
        }
    }
    
    public boolean contains(int key) {
        if(hashset.contains(key)){
            return true;
        }
        
        return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */