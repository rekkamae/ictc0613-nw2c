
package act5_mylinkedlist_camacho_nw2c;

import java.util.Scanner;
public class Act5_MyLinkedList_Camacho_NW2C {
    
    public static Act5_MyLinkedList_Camacho_NW2C firstNode;
    public static Act5_MyLinkedList_Camacho_NW2C lastNode = null;
    
    public String FirstN , MiddleN, LastN, TelNum, Gender;
    public int ACode, Age;
    public Act5_MyLinkedList_Camacho_NW2C next;
    
    
    public Act5_MyLinkedList_Camacho_NW2C
    (String fName, String mName, String lName, int aCode, String telNum, String gender, int age, Act5_MyLinkedList_Camacho_NW2C next){
        this.FirstN  =  fName;
        this.MiddleN =  mName;
        this.LastN   =  lName;
        this.ACode   =  aCode;
        this.TelNum  =  telNum;
        this.Gender  =  gender;
        this.Age     =  age;
        this.next    =  next;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int membersNum;
          String fName, mName, lName, gender, telNum;
          int aCode, age;
        
        System.out.print("How many members' information will be entered? ");
        membersNum = Integer.parseInt(input.nextLine());
        System.out.println();
          
        for(int i=0; i<membersNum; i++){
             System.out.println("Kindly give the information of member #" +(i+1) );
             System.out.print("Enter first name: ");
                fName = input.nextLine();
             System.out.print("Enter middle name: ");
                mName = input.nextLine();
             System.out.print("Enter last name: ");
                lName = input.nextLine();
             System.out.print("Enter area code: ");
                aCode = Integer.parseInt(input.nextLine());
             System.out.print("Enter telephone number: ");
                telNum = input.nextLine();
             System.out.print("Enter gender: ");
                gender = input.nextLine();
             System.out.print("Enter age: ");
                age = Integer.parseInt(input.nextLine());
             System.out.println();

               Act5_MyLinkedList_Camacho_NW2C n = new Act5_MyLinkedList_Camacho_NW2C
               (fName, mName, lName, aCode, telNum, gender, age,  null);
            if(lastNode != null)
                {
                lastNode.next = n;
                lastNode = n;
                }
            else
                {
                firstNode = n;
                lastNode = n;
                }
        }
               
            Act5_MyLinkedList_Camacho_NW2C n = firstNode;
            while(n != null) { 
                System.out.println("Welcome to the club " +n.FirstN + " " +n.MiddleN+ " " +n.LastN+ "!");
                System.out.println("Your area code and telephone number is (" +n.ACode+ ") " +n.TelNum);
                System.out.println("You are a " +n.Gender+ " member and your age is " +n.Age+ ".");
                System.out.println();
                
                n = n.next;
            }
    }   
}
