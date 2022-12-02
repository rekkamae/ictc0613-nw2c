
package act5_mylinkedlist_bernabe_nw2c;


import java.util.Scanner;
public class Act5_MyLinkedList_Bernabe_NW2C{
    public int Code, Age;
    public String FN, MN, SN, Tel, Gender;
    public Act5_MyLinkedList_Bernabe_NW2C next;
    public static Act5_MyLinkedList_Bernabe_NW2C firstNode;
    public static Act5_MyLinkedList_Bernabe_NW2C lastNode = null;
    
    public Act5_MyLinkedList_Bernabe_NW2C(String FName, String MName, String LName, int ACode, String TelNum, String gender, int age, Act5_MyLinkedList_Bernabe_NW2C next){
        this.FN = FName;
        this.MN = MName;
        this.SN = LName;
        this.Code = ACode;
        this.Tel = TelNum;
        this.Gender = gender;
        this.Age = age;
        this.next = next;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int membersNum;
        String FName, MName, LName, gender, TelNum;
        int ACode, age;
        
        System.out.print("How many members will be entered? ");
        membersNum = Integer.parseInt(input.nextLine());
        System.out.println();
          
        for(int i=0; i<membersNum; i++){
            System.out.println("Kindly give the information of member #" +(i+1) );
            
            System.out.print("Enter first name: ");
                FName = input.nextLine();
            System.out.print("Enter middle name: ");
                MName = input.nextLine();
            System.out.print("Enter last name: ");
                LName = input.nextLine();
            System.out.print("Enter area code: ");
                ACode = Integer.parseInt(input.nextLine());
            System.out.print("Enter telephone number: ");
                TelNum = input.nextLine();
            System.out.print("Enter gender: ");
                gender = input.nextLine();
            System.out.print("Enter age: ");
                age = Integer.parseInt(input.nextLine());
            System.out.println();
              
          Act5_MyLinkedList_Bernabe_NW2C n = new Act5_MyLinkedList_Bernabe_NW2C(FName, MName, LName, ACode, TelNum, gender, age,  null);
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
               
            Act5_MyLinkedList_Bernabe_NW2C n = firstNode;
            while(n != null) { 
                System.out.println("Welcome to the club " +n.FN + " " +n.MN+ " " +n.SN+ "!");
                System.out.println("Your area code and telephone number are (" +n.Code+ ") " +n.Tel);
                System.out.println("You are a " +n.Gender+ " member and your age is " +n.Age+ ".");
                System.out.println();
                
                n = n.next;
            }
        
         }
     }