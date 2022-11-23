import java.io.IOException;
import java.util.Scanner;
public class FinalNode {
    public int data; //hold an arbitrary integer
    public FinalNode next; //reference to the next node
    public static FinalNode firstNode; //a reference to the first Node
    public static FinalNode lastNode = null; //a reference to the last node
    
    public FinalNode(int d, FinalNode n) {
        data = d;
        next = n;
    }
    
    public static void main(String[] args) throws IOException {
        int numnodes, num;
        Scanner reader = new Scanner(System.in);
        System.out.print("How many nodes do you want to input?: ");
        numnodes = reader.nextInt();
        for(int i=0; i<numnodes; i++) {
            System.out.print("Enter node" + (i+1)+ ": ");
            num = reader.nextInt();
            FinalNode n = new FinalNode(num, null); //create node
            if(lastNode != null) //if it is not the first node
            {
                lastNode.next = n;
                lastNode = n;
            } else { //if n is the first node
                firstNode = n;
                lastNode = n;
            }
        }
        
        System.out.print("Here are the values of the list: ");
        FinalNode n = firstNode;
        while(n != null) { //loops forward displaying
            System.out.print(n.data+"\t");
            n=n.next; //move to the next node in the list
        }
        System.out.println();
    }
}
