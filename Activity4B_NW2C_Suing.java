

import java.util.Scanner;
import java.util.Arrays;

public class Activity4B {  
    public static int[] insertElement(int n, int [] arr){
       
Scanner Usr_input = new Scanner (System.in);
int i, x, pos;
        System.out.print("Value of the element to be inserted: ");
x = Usr_input.nextInt();
        System.out.print("Specific index at which element to be inserted: ");
pos = Usr_input.nextInt();
    
        int newr[] = new int[n + 1];

        for (i = 0; i < n + 1; i++) {
        if (i < pos - 1)
           newr[i] = arr[i];
        else if (i == pos - 1)
           newr[i] = x;
        else
           newr[i] = arr[i - 1];
}    
        return newr; 
    }    
  
    public static int [] findLocationDelete(int[] arr){
    int index;
    
    Scanner Usr_input = new Scanner (System.in);
             System.out.print("Input the specific index you wish to eliminate: ");
    index = Usr_input.nextInt();
       
            if (arr == null || index < 0
            || index >= arr.length) {
            return arr;
    }
        int[] anotherArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
        if (i == index) {
        continue;
    }
        anotherArr[k++] = arr[i];  }  
        return anotherArr;
    }
    
    public static void main (String args[]){
        Scanner usr_input = new Scanner (System.in);
        int n = 10;
        String choice;
         int array[]
            = { 22, 14, 30, 13, 15, 8, 29, 89, 97, 35};
  
        System.out.println("This is the inital array:\n"
                       + Arrays.toString(array));
     
        System.out.println();
        System.out.println("Type 'insert' if you like to input new element or 'delete' if you wish to eliminate an element:");
        choice = usr_input.nextLine();      
        
                switch (choice){
                case "insert":
        array = insertElement(n, array);
        int [] el = array;
                System.out.println(Arrays.toString(el));   

        boolean bl = false;
	for(int i = n; i<el.length; i++) {
                if(el[i] == 0) {
                bl = true;
}
	} if ( bl == false) {
		System.out.println("The array is already full!");
}
                break;
                case "delete":
                array = findLocationDelete(array);
         int [] elmts = array;
         
                System.out.println(Arrays.toString(elmts));
                
                boolean bln = false;
		for(int i = n; i<elmts.length; i++) {
		if(elmts[i] == 0) {
		bln = true;
}
	} if ( bln == false) {
		System.out.println("The array is already full!");
}
                break;
            }        
    }
    }

