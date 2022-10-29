import java.util.Arrays;
import java.util.Scanner;
public class Act4B_NW2C_DAVID {

	public static void ArrayInsert(){
	     int arr, x;
	     Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Array length: ");
	        arr = sc.nextInt();
	        int array[] = new int[arr+1];
	        System.out.println("Enter values: ");
	        for(int i = 0; i < arr; i++)
	        {
	            array[i] = sc.nextInt();
	        }
	        System.out.print("Enter value to be inserted: ");
	        x = sc.nextInt();
	        array[arr] = x;
	        System.out.println("After inserting: ");
	        	for(int i = 0; i<arr; i++)
	        	{
	        		System.out.println(array[i]);
	        	}
	        sc.close();
	        System.out.print(array[arr]); 
	  }
	  
	  public static void ArrayDelete(){
	     
		  int arr, x, i = 0;
	      Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Array length: ");
	        arr = sc.nextInt();
	        int array[] = new int[arr];
	        System.out.println("Enter value: ");
	        for(i = 0; i < arr; i++)
	        {
	            array[i] = sc.nextInt();
	        }
	        System.out.print("Enter the index of the element that you want to delete: ");
	        x = sc.nextInt();
	        System.out.println("Element to be deleted: "+ x); 
	 
	        int[] copyArr = new int[array.length - 1]; 
	        System.arraycopy(array, 0, copyArr, 0, x); 
	        System.arraycopy(array, x + 1, copyArr, x, array.length - x - 1); 
	        sc.close();
	        System.out.println("After deleting an element: "+ Arrays.toString(copyArr));  
	  }
	  
	  public static void ArrayTraverse(){
		  int arr;
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Array length: ");
	        arr = sc.nextInt();
	        int array[] = new int[arr+1];
	        System.out.println("Enter value: ");
	        for(int i = 0; i < arr; i++)
	        {
	            array[i] = sc.nextInt();
	        }
	        System.out.print("Elements in the Array are:\n");
	        for(int i = 0; i < arr; i++)
	        {
	            System.out.print(array[i]+" ");
	        }
	        sc.close();
	  }
	  
	  public static void exit(){
	      System.out.println("Program Terminated");
	  }
	  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please choose an operation: ");
	    System.out.println("1. Insert Value");
	    System.out.println("2. Delete Value"); 
	    System.out.println("3. Traverse Array");
	    System.out.println("4. Exit Program");
	      
	      int Operations = sc.nextInt();
	      System.out.println();
	      switch(Operations){
	          case 1:
	              ArrayInsert();
	              break;
	          case 2:
	              ArrayDelete();
	              break;
	          case 3:
	              ArrayTraverse();
	              break;
	          case 4:
	              exit();
	              break;
	      }
	      System.out.println();
	      sc.close(); 
	 }
}

