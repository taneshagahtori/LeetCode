class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       if(hand.length % groupSize!=0){
           return false;
       }
       PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int val: hand){
            pq.add(val);
        }
        while(!pq.isEmpty()){
            int small=pq.poll();
            for (int i=1; i<groupSize; i++){
                if(pq.remove(small+i)){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}