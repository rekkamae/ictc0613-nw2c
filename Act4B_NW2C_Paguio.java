import java.util.Scanner;

public class Act4B_NW2C_Paguio {
	static Scanner scanner1 =  new Scanner(System.in);
	static Scanner scanner2 =  new Scanner(System.in);
    
    public void traverseSortedLinear(int list[], int count, int size) { 
        if (count > 0) {
            System.out.println("Items("+count+"/"+size+") :");
            for (int i=0; i<=count-1; i++) {
                System.out.print(list[i]+" ");
            }
            System.out.println();
        }else
            System.out.println("No elements found in the list.");
    }
    
    public int[] insertItem(int list[], int count) {
        int loc, arr;
        
        System.out.print("Enter value for element #"+(count+1)+": ");
        list[count] = scanner1.nextInt();           
        loc = findLocationInsert(list, list[count], count); 
        System.out.println("Added \""+list[count]+"\" in index ["+loc+"]");
        
        for (int i=count; i!=loc; i--) {
                if (count>0) {   
                    if (list[i] < list[i-1]) {
                        arr = list[i];
                        list[i] = list[i-1];
                        list[i-1] = arr;
                    }
                }
            }       
        return list;      
    }
    
    public int findLocationInsert(int list[], int element, int count) {
        if (count>0) {
            while (element < list[count-1] && count!=1) {
                count--;
            }
            return count;
        }else
            return count;                           
    }
    
    public int[] deleteItem(int list[], int count) { // Delete Item
        int item, position;
                       
        System.out.print("Enter the item to be deleted: ");
        item = scanner2.nextInt();
        position = findLocationDelete(list, item, count);
        if (position >= 0) {
            System.out.println("Deleted \""+item+"\" from index ["+position+"].");
            for (int i=position; i<count; i++) {
                list[i] = list[i+1];                   
            }
        }else 
            System.out.println("\""+item+"\" is not on the list.");
        
        return list; 
    }    
    
    public int findLocationDelete(int list[], int element ,int count) {      
        for (int i=0; i<count; i++) {
            if (list[i] == element)
                return i;                 
        } 
        return -1;
    }

    public static void main(String[] args) {
       int size, count=0, checker=1;
        
        System.out.print("Enter size of the Array: ");
        size = scanner1.nextInt();
        int arr[] = new int[size];           
        Act4B_NW2C_Paguio option = new Act4B_NW2C_Paguio();
        
        do {
            System.out.println("\nOPTIONS:\n[1] : Inset Value\n[2] : Delete Value\n[3] : Traverse Array\n[4] : Exit");
            System.out.print("Select: ");
            char select = scanner2.next().toUpperCase().charAt(0);
            System.out.println();

            switch (select){
                case '1':
                    System.out.println("*** INSERT ITEM ***");
                    if (count >= 0 && count < arr.length) {
                        arr = option.insertItem(arr, count);
                        count++;                        
                    }else
                        System.out.println("This array is full!");
                    break;
                case '2':
                    System.out.println("*** DELETE ITEM ***");   
                    if (count > 0 && count < arr.length) {
                        arr = option.deleteItem(arr, count);
                        count--;
                    }else
                        System.out.println("This array is empty!");    
                    break;
                case '3':
                        System.out.println("*** LIST ITEMS ***");
                        option.traverseSortedLinear(arr, count, size);
                    break;
                case '4':
                    System.out.println("Thankyou for using this program!");
                    checker = 0;
                    break;
                default: 
                    System.out.println("*** The number you've entered is incorrect ***"); 
                    break;
            }        
        }while (checker==1);

    }
    
}