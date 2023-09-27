package KodNestSearchSort;
import java.util.Scanner;

public class KodNestSearchSortApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length :");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array Elements Before Sorting.....");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" | ");
		}
		System.out.println();
		
		KodNestSearchSort kss = new KodNestSearchSort();
		
		while(true) {
			System.out.println(" \n ");
			System.out.println("Enter Your Choice");
			System.out.println("Press 1 -----> Searching");
			System.out.println("Press 2 -----> Sorting");
			System.out.println("Press 3 -----> Finding Minimum/Maximum");
			System.out.println("Press Any/Other -----> TATA BYE BYE");
			int choice = scan.nextInt();
			switch(choice) {
			
			case 1: System.out.println("Linear Search --->1 or Binary Search --->2");
					int choice1 = scan.nextInt();
					System.out.println("Enter Key to Search :");
					int key = scan.nextInt();
					if(choice1 == 1) {
						int res = kss.linearSearch(arr, key);
						if(res>=0) {
							System.out.println("Key found at Index "+res);
						}else {
							System.out.println("key Not Found");
						}
					}else if(choice1 == 2) {
						int res = kss.binarySearch(arr, key);
						if(res>=0) {
							System.out.println("Key found at Index "+res);
						}else {
							System.out.println("key Not Found");
						}
					}else {
						System.out.println("Go to vasan Eye care....");
						return;
					}
				break;
				
			case 2: System.out.println("Press 1 ---> Bubble-Sort");
					System.out.println("Press 2 ---> Selection-Sort");
					System.out.println("Press 3 ---> Insertion-Sort");
					int choice2 = scan.nextInt();
					System.out.println("Enter 1 for Ascending-Sort or 2 for Decending-Sort");
					int choice3 = scan.nextInt();
					if(choice2 == 1) {
						if(choice3 == 1)
							kss.bubbleSortAscending(arr);
						else if(choice3 == 2)
							kss.bubbleSortDescending(arr);
						else
							System.out.println("Go to vasan Eye care....");
						
						System.out.println("Array Elements After Sorting.....");
						for(int i=0;i<arr.length;i++) {
							System.out.print(arr[i]+" | ");
						}
					}
					else if(choice2 == 2) {
						if(choice3 == 1)
							kss.selectionSortAscending(arr);
						else if(choice3 == 2)
							kss.selectionSortDescending(arr);
						else
							System.out.println("Go to vasan Eye care....");
						
						System.out.println("Array Elements After Sorting.....");
						for(int i=0;i<arr.length;i++) {
							System.out.print(arr[i]+" | ");
						}
					}
					else if(choice2==3) {
						if(choice3 == 1)
							kss.insertionSortAscending(arr);
						else if(choice3 == 2)
							kss.insertionSortDescending(arr);
						else
							System.out.println("Go to vasan Eye care....");
						
						System.out.println("Array Elements After Sorting.....");
						for(int i=0;i<arr.length;i++) {
							System.out.print(arr[i]+" | ");
						}
					}
					else {
						System.out.println("Go to vasan Eye care....");
						return;
					}
				break;
			
			case 3: System.out.println("Enter 1 for Maximum or 2 for Minimum");
					int choice4 = scan.nextInt();
					if(choice4==1) {
						int res = kss.findMax(arr);
						System.out.println("Maximum Element is "+res);
					}
					else if(choice4==2) {
						int res = kss.findMinimum(arr);
						System.out.println("Minimum Element is "+res);
					}else {
						System.out.println("Go to vasan Eye care....");
						return;
					}
				break;
			
			default: System.out.println("TATA BYE BYE");
					return;
			}
		}
	}
}
