import java.util.PriorityQueue;
public class UtilityPQ {
    //this builds a forest of trees that are then merged into one tree using the huffman encoding
    public static void BuildPriorityQ(int[] ByteFrequencyTable, PriorityQueue<TreeNOde> Source) {
        TreeNOde x, y;
        for (int i = 0; i < 256; i++) {  ///this adds the characters to the priority queue
            if (ByteFrequencyTable[i] > 0) {
                Source.add(new TreeNOde((char) i, ByteFrequencyTable[i]));
            }
        }
        while (Source.size() >= 2) {   //this groups the smallest of the elements into one node and continues until we get only one node left
            x = Source.peek();
            Source.remove();
            y = Source.peek();
            Source.remove();

            Source.add(new TreeNOde(x, y));
        }
    }
}
