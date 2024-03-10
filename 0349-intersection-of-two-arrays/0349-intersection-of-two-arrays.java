class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        ArrayList<Integer> arr1= new ArrayList<>();

        for(int i:nums1)
        set1.add(i);

        for(int j:nums2)
        set2.add(j);

        for(int i:set2) {
            if(!set1.add(i)) {
                arr1.add(i);
            }
        }
        int[] arr=new int[arr1.size()];
        int k=0;

        for(int i:arr1) {
            arr[k]=i;
            k++;
        }
        return arr;

        
    }
}