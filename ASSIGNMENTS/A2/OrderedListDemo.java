import java.util.Scanner;
import java.io.*;

public class OrderedListDemo{
	public static void main(String[] args) throws IOException{ 
		
		// Create the three lists
		OrderedList<String> list1 = new OrderedList<String>();
		OrderedList<String> list2 = new OrderedList<String>();
		OrderedList<String> list3 = new OrderedList<String>();

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();
		
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
				
		while (inputFile.hasNext()) {
			list1.insert(inputFile.nextLine());
		}
		inputFile.close();
		
		System.out.print("Enter the second filename to read from: ");
		String filename2 = keyboard.nextLine();
		File file2 = new File(filename2);
		Scanner inputFile2 = new Scanner(file2);
				
		while (inputFile2.hasNext()) {
			list2.insert(inputFile2.nextLine());
		}
		inputFile2.close();

     
		System.out.println("The Ordered Lists contain the following entries: ");
		
		
		// Display list 1
		System.out.println("List 1:");
		list1.enumerate();


		// Display list 2
		System.out.println("List 2:");
		list2.enumerate();
     
		//Merge list 1 and list 2 together to create a new form of list, list 3.
		list3 = merge(list1,list2);

		// Display the list3.
		System.out.println("\nA merged verison of the two lists looks like this: ");
		list3.enumerate();
	}

	//merge class
	public static <T extends Comparable<T>> OrderedList<T> merge(OrderedList<T> list1, OrderedList<T> list2){
         int i = 0, j = 0;
         OrderedList<T> list3 = new OrderedList<T>();
         
         //comparing list 1 and list 2
         while (i<list1.size() && j<list2.size()){
        	 if (list1.get(i).compareTo(list2.get(j)) <=0){   //to see which alphabet comes first, if list1 alphabetic is greater than list2, then
                  list3.insert(list1.get(i)); //add to the end in list 3
                  i++;
             }
        	 
             else{ //if list2  alphabetic bigger  than list 1
            	 list3.insert(list2.get(j)); //add to  the end
                  j++;
             }
         }

         //if it reaches to the end of list 1, put all the left overs from list 2 in list 3.
         if (i == list1.size()){
             while (j != list2.size()) {
            	 list3.insert(list2.get(j));
                 j++;
             }
         }
         else {
             while (i!= list1.size()){
                  list3.insert(list1.get(i));
                  i++;
             }
        }
        return list3;
    }
} //end of class