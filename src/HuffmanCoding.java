/**
 * Created by leealvis on 20/6/2017.
 */
public class HuffmanCoding {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        try {
            pq.add(3);
            pq.add(5);
            pq.add(6);
            pq.add(7);
            pq.add(8);
            pq.add(2);
        } catch (PriorityQueueException e) {
            e.getMessage();
        }

    }
}
