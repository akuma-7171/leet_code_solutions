class MyHashSet {
    
    ArrayList<Integer> hash;

    public MyHashSet() {
        hash = new ArrayList<>();
    }
    
    public void add(int key) {
        if(hash.contains(key)){
            return;
        }
        
        hash.add(key);
    }
    
    public void remove(int key) {
        if(hash.contains(key)){
            hash.remove(new Integer(key));
        }
    }
    
    public boolean contains(int key) {
        if(hash.contains(key)){
            return true;
        }
        
        else{
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */