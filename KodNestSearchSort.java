
public class KodNestSearchSort {
    int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + high / 2;

            if (arr[mid] == key) {
                return mid; 
            } else if (key < arr[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

    void bubbleSortAscending(int arr[]) {
    	int n=arr.length;
    	for(int i=0;i<=n-2;i++) {
			for(int j=0;j<=n-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
    }

    void bubbleSortDescending(int arr[]) {
    	int n = arr.length;
        for (int i=0;i<=n-2;i++) {
            for (int j=0;j<=n-2-i;j++) {
                if (arr[j] < arr[j+1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void selectionSortAscending(int arr[]) {
    	for(int i=0;i<=arr.length-2;i++) {
			int min = arr[i];
			int pos = i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			int ref=arr[i];
			arr[i] = arr[pos];
			arr[pos] = ref;
		}
    }

    void selectionSortDescending(int arr[]) {
    	for (int i=0;i<=arr.length-2;i++) {
    	    int max = arr[i];
    	    int pos = i;
    	    for (int j=i+1;j<=arr.length-1;j++) {
    	        if (arr[j] > max) { 
    	            max = arr[j];
    	            pos = j;
    	        }
    	    }
    	    int temp = arr[i];
    	    arr[i] = arr[pos];
    	    arr[pos] = temp;
    	}
    }

    void insertionSortAscending(int arr[]) {
        for (int i=1;i<arr.length;i++) {
            int item = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>item) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=item;
        }
    }

    void insertionSortDescending(int arr[]) {
        for (int i=1;i<arr.length;i++) {
            int item = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]<item) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
    }

    int findMinimum(int arr[]) {
        int min = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }

    int findMax(int arr[]) {
        int max = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}

