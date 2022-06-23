class Solution {
    public void wiggleSort(int[] arr) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : arr) priorityQueue.add(n);
        for (int i = 1; i < arr.length; i += 2) arr[i] = priorityQueue.poll();
        for (int i = 0; i < arr.length; i += 2) arr[i] = priorityQueue.poll();
    }
}