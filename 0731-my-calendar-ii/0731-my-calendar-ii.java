class MyCalendarTwo {

    private List<int[]> doubleBookings;

    private List<int[]> bookings;

    public MyCalendarTwo() {
        
        doubleBookings = new ArrayList<>();
        bookings = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        
        for (int[] db : doubleBookings) {
            if (Math.max(start, db[0]) < Math.min(end, db[1])) {
               
                return false;
            }
        }

        for (int[] b : bookings) {
            int overlapStart = Math.max(start, b[0]);
            int overlapEnd = Math.min(end, b[1]);
            if (overlapStart < overlapEnd) {
                doubleBookings.add(new int[] {overlapStart, overlapEnd});
            }
        }

        bookings.add(new int[] {start, end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */