
package act4b_nw2c_bernabe;
import java.util.Scanner;

public class Act4B_NW2C_Bernabe {
    
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Newline = System.lineSeparator();
        System.out.print("Enter length of an array: "); 
        int x  = Integer.parseInt(sc.next());
        int[]l = new int[x];
        
        System.out.println( Newline + "Enter all the " + x + " elements: ");
        for(int i=0; i<l.length;  i++){
            l[i] = sc.nextInt();

    }
     
        System.out.println( Newline + "Choose a number: \n" + 
                "1 - Insert a value \n" + 
                "2 - Delete a value \n" + 
                "3 - Traverse array \n" + 
                "4 - Exit" + Newline );
        
        int choice;
        System.out.print("Enter  a number: "); 
        choice = sc.nextInt();
        
        switch (choice)
        {
            case 1:
                System.out.print("Location of index: "); 
                int loc = sc.nextInt(); 

                System.out.print("Insert a value: "); 
                int val = sc.nextInt();

                for(int i=l.length-1; i>loc; i--){ 
                    l[i] = l [i-1];
                }
            
                l[loc] = val;
                System.out.println(Newline + "Result: "); 
                for(int r:l)
                {
                System.out.println(r);
                }
            break;
            
            case 2:
                System.out.print("Location of index: "); 
                int del = sc.nextInt();
                
                for(int d=del; d<l.length-1; d++){
                    l[d] = l[d+1];
                        
                System.out.println(l[d]);
                }
            break;

            case 3:
                System.out.print("Traverse array: "); 
                for(int t = 0; t<l.length;  t++){
                System.out.println(l[t]);
                }
            break;

            case 4: 
                System.out.println("End");
            break;

            }
            }
            }


    
}
