/*
1845. Seat Reservation Manager
Difficulty: Medium

1845_Seat_Reservation_Manager.java
*/


class SeatManager {
  public SeatManager(int n) {}

  public int reserve() {
    if (minHeap.isEmpty())
      return ++num;
    return minHeap.poll();
  }

  public void unreserve(int seatNumber) {
    minHeap.offer(seatNumber);
  }

  private Queue<Integer> minHeap = new PriorityQueue<>();
  private int num = 0;
}
