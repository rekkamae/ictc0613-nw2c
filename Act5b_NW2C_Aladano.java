package activityDSA;
import java.util.Scanner;
import java.util.LinkedList;

public class Act5b_NW2C_Aladano {

	

	public class Main {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			LinkedList<Member> members = new LinkedList<>();
			
			System.out.print("How many members' information will be entered? ");
			int q = s.nextInt();
			
			for (int i = 0; i < q; i++) {
			    System.out.print("\nKindly give the information of member #" + (i+1) + "\nEnter firstname: ");
			    String firstName = s.next();
			    
			    System.out.print("Enter middle name: ");
			    String middleName = s.next();
			    
			    System.out.print("Enter last name: ");
			    String lastName = s.next();
			    
			    System.out.print("Enter area code: ");
			    String areaCode = s.next();
			    
			    System.out.print("Enter telephone number: ");
			    String telNum = s.next();
			    
			    System.out.print("Enter gender: ");
			    String gender = s.next();
			    
			    System.out.print("Enter age: ");
			    String age = s.next();
			    
			    members.add(new Member(firstName, middleName, lastName, areaCode, telNum, gender, age));
			    
			    System.out.println();
			}
			
			for (Member m : members) {
			    System.out.println("Welcome to the club " + m.getFname() + " " + m.getMname() + " " + m.getLname() + "!");
			    System.out.println("Your area code and telephone number is (" + m.getAreaCode() + ") " + m.getTel());
			    System.out.println("You are a " + m.getGender() + " and your age is " + m.getAge());
			    System.out.println();
			}
		}
	}

	class Member {
	    private String firstname;
	    private String middlename;
	    private String lastname;
	    private String areaCode;
	    private String telNum;
	    private String gender;
	    private String age;
	    
	    public Member(String firstname, String middlename, String lastname, String areaCode, String telNum, String gender, String age) {
	        this.firstname = firstname;
	        this.middlename = middlename;
	        this.lastname = lastname;
	        this.areaCode = areaCode;
	        this.telNum = telNum;
	        this.gender = gender;
	        this.age = age;
	    }
	    
	    public String getFname() {
	        return firstname;
	    }
	    
	    public String getLname() {
	        return lastname;
	    }
	    
	    public String getMname() {
	        return middlename;
	    }
	    
	    public String getAreaCode() {
	        return areaCode;
	    }
	    
	    public String getTel() {
	        return telNum;
	    }
	    
	    public String getGender() {
	        return gender;
	    }
	    
	    public String getAge() {
	        return age;
	    }

	}