class Solution {
public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
    int n = profits.length;

    List<int[]> pro = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        pro.add(new int[]{capital[i], profits[i]});
    }

    pro.sort((a, b) -> a[0] - b[0]);
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    int i = 0;

    while (k > 0) {
        while (i < n && pro.get(i)[0] <= w) {
          
            pq.offer(pro.get(i)[1]);
            i++;
        }

    
        if (pq.isEmpty()) {
            break;
        }

    
        w += pq.poll();
        k--;
    }

    return w;
}
}