
import java.io.FileInputStream;
import java.io.*;

public class UtillityBFT{

    //this will open the file and read the whole text one character at a time
    //then it will build the compression table and then close the file.

public static void BuildPopChararacterFreq(String filename, int [] ByteFrequencyTable){
    int x = 0;

    try {
        FileInputStream input = new FileInputStream(new File(filename)); //this will open the file

        while ((x = input.read()) != -1) {   //this reads each character from the text file
            ByteFrequencyTable[x]++;
        }
    }
    catch(Exception ex) {
        System.out.println("Error!");
    }
        }
    }





