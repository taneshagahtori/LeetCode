class Solution {
    int n;
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        n=quality.length;
        double[][] workers=new double[n][2];
        for(int i=0;i<n;i++){
            workers[i][0]=(double)wage[i]/quality[i];
            workers[i][1]=quality[i]*1.0;
        }
        Arrays.sort(workers,(a,b)->{return Double.compare(a[0],b[0]);});
        Double ans=Double.MAX_VALUE;
        int qualitySum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(double worker[]:workers){
            double ratio=worker[0];
            qualitySum+=(int)worker[1];
            pq.offer((int)worker[1]);
            if(pq.size()>k) {
                qualitySum-=pq.poll();
            }
            if(pq.size()==k)
            ans=Math.min(ans,qualitySum*ratio);
        }
        return ans;

    }
}