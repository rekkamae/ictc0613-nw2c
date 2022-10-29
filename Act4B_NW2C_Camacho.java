
package act4b_nw2c_camacho;

import java.util.Scanner;
public class Act4B_NW2C_Camacho {

    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input array size:");
         int x = Integer.parseInt(sc.next());
         int[] y = new int[x];
        System.out.println("");
        System.out.println("Input the "+ x +" elements of your choice:");
        
          for(int i = 0; i < y.length; i++){
          y[i] = sc.nextInt();
          }
          
        System.out.println("");
         int choice;
        System.out.println("Kindly pick an operation by its given number:");
        System.out.println("1 Insertion (add an element) ");
        System.out.println("2 Deletion (delete an element) ");
        System.out.println("3 Traverse (print all elements) ");
        System.out.println("4 Exit ");
        
        System.out.println("");
        System.out.println("Input your chosen number: ");
         choice = sc.nextInt();
         switch (choice)
        {
            case 1:
                System.out.println("");
                System.out.println("Input the index location: ");
                  int loc = sc.nextInt();
                System.out.println("Input the value to be inserted: ");
                  int val = sc.nextInt();
            
                for(int a = y.length-1; a>loc; a--){
                y[a] = y [a-1];
                }
                
                y[loc] = val;
                System.out.println("");
                System.out.println("After inserting: ");
                
                for(int a:y){
                System.out.println(a);
                }
            break;
            
            case 2:
                System.out.println("Input index location to be deleted: ");
                int dlts = sc.nextInt();
                
                for(int b = dlts; b<y.length-1; b++){
                y[b] = y[b+1];
                System.out.println(y[b]);
                }
            break;
            
            case 3:
                System.out.println("");
                System.out.println("Traverse array: ");
                
                for(int c = 0; c<y.length; c++){
                System.out.println(y[c]);
                }
            break;
            
            case 4:
                System.out.println("");
                System.out.println("End");
            break;
        
        }
    }
}
