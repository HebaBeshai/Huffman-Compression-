public class UtilityBST{
    private static String code = new String();
    private static int bits = 0;  //this counts the number of bits

    public static int getBitCounter() {
        return bits;
    }
// this is the traversal of the compression tree in order based on previous code already written
// this will print the leaves only and the class variable code will move with the coding as the tree is moved through

    public static void LNR(TreeNOde node, String transT[]){
        if(node.LC != null) {    //if the node has a left child then add 0 and call the left child
            code = code + "0";
            LNR(node.LC, transT);
            code = code.substring(0, code.length() - 1);  //decrements the substring of the code by 1
        }
        if(node.LC == null && node.RC == null) {  //checks to see if its a leaf

            if (node.myCharacter == '\n') {                         //prints the output per character
                System.out.println("NL: " + code);
            } else if (node.myCharacter == ' ') {
                System.out.println("Space: " + code);
            } else {
                System.out.println(node.myCharacter + ": " + code);
            }
            transT[(int) node.myCharacter] = code;
            bits += code.length();
        }
        if(node.RC != null){  //this checks to see if the node has a right child and is it does, it adds one to the code
            code = code+"1";               //then it calls the right child
            LNR(node.RC, transT);
            code = code.substring(0, code.length()-1);

        }

    }


}