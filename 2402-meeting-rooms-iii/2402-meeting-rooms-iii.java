class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> (a[1] == b[1]) ? a[0] - b[0] : a[1] - b[1]);
        PriorityQueue<Integer> freeroom = new PriorityQueue<>();

        for(int i = 0;i < n;i++){
            freeroom.offer(i);
        }

        int[] res = new int[n];

        for(int i = 0;i < meetings.length;i++){
            while(!pq.isEmpty() && pq.peek()[1] <= meetings[i][0]){
                freeroom.offer(pq.poll()[0]);
            }

            if(freeroom.isEmpty()){
                int[] room = pq.poll();
                res[room[0]]++;
                pq.offer(new int[]{room[0], room[1] + meetings[i][1] - meetings[i][0]});
            }
            else{
                int room = freeroom.poll();
                res[room]++;
                pq.offer(new int[]{room,meetings[i][1]});
            }
        }

        int mx = Integer.MIN_VALUE , ans = 0;

        for(int i = 0;i < n;i++){
            if(res[i] > mx){
                mx = res[i];
                ans = i;
            }
        }

        return ans;
    }
}