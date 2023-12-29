class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list= new ArrayList<>();
        for(int i=left; i<=right; i++){
            int n=0;
            String s= String.valueOf(i);
            for(char ch:s.toCharArray()){
                if((ch-'0')!= 0){
                    if(i%(ch-'0')==0){
                        n++;
                    }
                }
                if (n==s.length()){
                    list.add(i);
                }
            }
        }
        return list;
    }
}