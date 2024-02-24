class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(0, firstPerson));
        int shortest[] = new int[n];
        Arrays.fill(shortest, (int)(1e9));
        ArrayList<ArrayList<int[]>> arr = new ArrayList<>();
        for(int i = 0 ; i<n ; i++)arr.add(new ArrayList<>());

        for (int[] meeting : meetings) {
            arr.get(meeting[0]).add(new int[]{meeting[1], meeting[2]});
            arr.get(meeting[1]).add(new int[]{meeting[0], meeting[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{0, 0});
        pq.add(new int[]{firstPerson, 0});
        shortest[0] = 0;
        shortest[firstPerson] = 0;
        while (!pq.isEmpty()) {
            int[] s = pq.poll();
            for (int[] j : arr.get(s[0])) {
                if (j[1] >= s[1] && shortest[j[0]]>j[1]) {
                    pq.add(new int[]{j[0], j[1]});
                    hs.add(j[0]);
                    shortest[j[0]] = j[1];
                }
            }
        }
        return new ArrayList<>(hs);
    }
}