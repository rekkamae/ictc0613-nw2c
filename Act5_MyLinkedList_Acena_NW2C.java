
package act5_mylinkedlist_acena_nw2c;
import java.util.LinkedList;
import java.util.Scanner;
public class Act5_MyLinkedList_Acena_NW2C {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        LinkedList firstName = new LinkedList();
        LinkedList middleName = new LinkedList();
        LinkedList lastName = new LinkedList();
        LinkedList areaCode = new LinkedList();
        LinkedList telNum = new LinkedList();
        LinkedList gender = new LinkedList();
        LinkedList agePer = new LinkedList();
        
        System.out.print("How many members information will be entered?? ");
        int Mcount = sc.nextInt(); 
         sc.nextLine();
        
        for(int i = 0; i < Mcount;i++){
            int count = i; count++; 
            
          System.out.println();

          System.out.println("Kindly give the information of member " + count);
          System.out.print("Enter firstname: ");
          String Fname = sc.nextLine();
          System.out.print("Enter middle name: ");
          String Mname = sc.nextLine();
          System.out.print("Enter last name: ");
          String Lname = sc.nextLine();
          System.out.print("Enter area code: ");
          int Arecode = sc.nextInt();
          sc.nextLine();
          System.out.print("Enter telephone number: ");
          String Telnum = sc.nextLine();
          System.out.print("Enter gender: ");
          String Gen = sc.nextLine();
          System.out.print("Enter age: ");
          int Age = sc.nextInt();
          sc.nextLine();
          System.out.println();

            firstName.add(Fname); middleName.add(Mname); lastName.add(Lname);
            areaCode.add(Arecode); telNum.add(Telnum); gender.add(Gen); agePer.add(Age);
     
           
        } 
        for(int i = 0; i < Mcount;i++){

        System.out.println("Welcome to the Club " + firstName.get(i) +" " + middleName.get(i) + " "+ lastName.get(i)+ "!");
        System.out.println("Your Area Code and Telephone Number is " + "(" + telNum.get(i)+ ") " + areaCode.get(i)+"." );
        System.out.println("You are " + gender.get(i) + " member and your Age is " + agePer.get(i));
        System.out.println();
       
        }
      
       
    }
    
}
