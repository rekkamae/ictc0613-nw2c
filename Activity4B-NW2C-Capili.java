package activity4b;

import java.util.Scanner;

public class Activity4B {
    static int num;
        public static void main(String[] args) { 
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter length of an array: ");
                int p = Integer.parseInt(scan.next());
                int[] o = new int[p];
                
                System.out.println("___________________________");
                
                System.out.println("Enter all the "+ p +" elements: ");
                        for(int u = 0; u < o.length; u++){
                        o[u] = scan.nextInt();
                }       
                System.out.println("___________________________");
                int choice;
                System.out.println("Please Choose :");
                System.out.println("(1) Insert a value ");
                System.out.println("(2) Delete a value ");
                System.out.println("(3) Traverse array ");
                System.out.println("(4) Exit ");
                System.out.println("___________________________");
                System.out.print("Enter your choice: ");
                choice = scan.nextInt();
                        switch (choice) 
                {
                            
                        case 1:
                System.out.print("Enter location index: ");
                int loc = scan.nextInt();
                System.out.print("Enter value to insert: ");
                int val = scan.nextInt();
                        for(int t = o.length-1; t>loc; t--){
                        o[t] = o [t-1];
                }
                        o[loc] = val;
                System.out.println("After inserting: ");
                        for(int a:o){
                System.out.println(a);
                }
                            break;
                            
                        case 2:
                System.out.println("Enter index location to delete: ");
                int dlts = scan.nextInt();
                        for(int r = dlts; r<o.length-1; r++){
                        o[r] = o[r+1];
                System.out.println(o[r]);
                }
                           break;
                           
                        case 3:
                System.out.println("Traverse array: ");
                        for(int e = 0; e<o.length; e++){
                System.out.println(o[e]);
                }
                            break;
                            
                        case 4:
                System.out.println("Finish");
                            break;
                }
        }
}

     
