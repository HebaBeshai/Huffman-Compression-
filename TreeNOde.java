class TreeNOde implements Comparable<TreeNOde> {
    char myCharacter;
    int frequency;
    TreeNOde LC;  //this is the left child
    TreeNOde RC;  //this is the right child

    public TreeNOde(char theCharacter, int theFrquency) {  //this is the constructor for a leaf
        myCharacter = theCharacter;
        frequency = theFrquency;
    }

    public TreeNOde(TreeNOde X, TreeNOde Y) {  // this is the overload constructor
        LC = X;
        RC = Y;
        frequency = X.frequency + Y.frequency;
    }

    public int compare(TreeNOde X, TreeNOde Y) {
        return X.compareTo(Y);
    }

    public int compareTo(TreeNOde other) {  //this makes the order relation for each of the leaves in the overloaded PQ
        if (frequency > other.frequency) {
            return 1;
        } else if (frequency < other.frequency) {
            return -1;
        }
        return 0;
    }


}






















