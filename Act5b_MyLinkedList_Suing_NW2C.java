
package act5_mylinkedlist._suing_nw2c;

import java.util.LinkedList;
import java.util.Scanner;
public class Act5_MyLinkedList_Suing_NW2C {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList firstname = new LinkedList();
        LinkedList middlename = new LinkedList();
        LinkedList lastname = new LinkedList();
        LinkedList areacode = new LinkedList();
        LinkedList telephonenum = new LinkedList();
        LinkedList gender = new LinkedList();
        LinkedList agePer = new LinkedList();
 
        System.out.print("How many members' information will be entered? ");
        int Mcount = scan.nextInt();
         scan.nextLine();
        for(int i = 0; i < Mcount;i++){
            int count = i;
            count++;
            
          System.out.println();
          System.out.println("Kindly give the information of member " + count);
          System.out.print("Enter first name: ");
          String frname = scan.nextLine();
          System.out.print("Enter middle name: ");
          String mdname = scan.nextLine();
          System.out.print("Enter last name: ");
          String lstname = scan.nextLine();
          System.out.print("Enter area code: ");
          int arcode = scan.nextInt();
          scan.nextLine();
          System.out.print("Enter telephone number: ");
          String telnum = scan.nextLine();
          System.out.print("Enter gender: ");
          String gend = scan.nextLine();
          System.out.print("Enter age: ");
          int age = scan.nextInt();
          scan.nextLine();
          System.out.println();

            firstname.add(frname);
            middlename.add(mdname);
            lastname.add(lstname);
            areacode.add(arcode);
            telephonenum.add(telnum);
            gender.add(gend);
            agePer.add(age);
        }
        for(int i = 0; i < Mcount;i++){
            
        System.out.println("Welcome to the club " + firstname.get(i) +" " + middlename.get(i) + " "+ lastname.get(i)+ "!");
        System.out.println("Your area code and telephone number is " + "(" + telephonenum.get(i)+ ") " + areacode.get(i)+"." );
        System.out.println("you are a " + gender.get(i) + " member and your age is " + agePer.get(i));
        System.out.println();
        }
    } 
}
