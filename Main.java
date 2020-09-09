//this is the compression tree
import java.util.PriorityQueue;
import java.io.File;
public class Main {

        private static int [] ByteFrequencyTable = new int[256];
        private static PriorityQueue<TreeNOde> Source = new PriorityQueue();
        private static String [] transT= new String[256]; //this is the table

        public static void main(String[] args){

            UtillityBFT.BuildPopChararacterFreq("text.txt"/*args[0]*/, ByteFrequencyTable); //this creates the frequency of the characters that occcur in the text file
            UtilityPQ.BuildPriorityQ(ByteFrequencyTable, Source); //this is the compression tree
            if(!Source.isEmpty()){  //this moves through the tree in order to get the encoding numbers
                UtilityBST.LNR(Source.remove(), transT);
                }
//this outputs the encryption
            System.out.println("\nSize before compression is: " + (new File("text.txt").length())*8 + " bits.");

            int sumBits = 0; //intializes the sum in bits to zero
            int counter = 0; // intializes the number of characters counter to zero

            for (int i = 0; i <256; i++){
                if(ByteFrequencyTable[i]!= 0){
                    sumBits += ByteFrequencyTable[i] * transT[i].length();
                    counter++;
                }
                }

                sumBits += UtilityBST.getBitCounter() + (counter*8); //this adds the bits of the size of the table

            System.out.println("Compressed Size: " + sumBits + " bits."); //this prints to the screen the total amount of the compressed table size and the code of the string table

        return;


            }

    }

