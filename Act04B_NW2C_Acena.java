
package activity04b;


import java.util.Scanner;

public class Activity04B {

    static int num;

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter length of an array:");
            int j = Integer.parseInt(scan.next());
            int[] n = new int[j];
            System.out.println("Enter all of the "+ j +" elements:"); 
            for(int i = 0; i < n.length; i++){
            n[i] = scan.nextInt();
            }
            int option;
            System.out.println("Please Choose an option: "); 
            System.out.println("(1) Insert a value "); 
            System.out.println("(2) Delete a value "); 
            System.out.println("(3) Traverse array "); 
            System.out.println("(4) Exit ");
            System.out.println("Enter your number of choice: "); 
            option = scan.nextInt();
                   switch (option)
            {
            case 1:
            System.out.println("Enter location index: "); 
            int loc = scan.nextInt(); System.out.println("Enter a value to insert: "); 
            int val = scan.nextInt();

            for(int b = n.length-1; 
                    b>loc; b--){ n[b] = n [b-1];
            }
                    n[loc] = val;
            System.out.println("After inserting: "); 
                    for(int b:n){
            System.out.println(b);
            }
 
                break;

            case 2:
            System.out.println("Enter index location to delete: ");
                int del = scan.nextInt();
                for(int y = del; y<n.length-1; y++){ n[y] = n[y+1]; 
            System.out.println(n[y]);
            }
            break;

            case 3:
            System.out.println("Traverse array: "); 
                for(int a = 0; 
                        a<n.length; a++){
            System.out.println(n[a]);
            }
                
                break;

            case 4: System.out.println("Finish");

                break;

    }
    
}
}