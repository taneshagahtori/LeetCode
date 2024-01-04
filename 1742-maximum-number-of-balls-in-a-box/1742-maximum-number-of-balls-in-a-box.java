class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map= new HashMap<>();
        int count=0;
        for(int i=lowLimit; i<=highLimit; i++){
            int sum=0;
            int temp=i;
            while(temp!=0){
                sum+=temp%10;
                temp=temp/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            if(map.get(sum)>count){
                count=map.get(sum);
            }
        }
        return count;
    }
}