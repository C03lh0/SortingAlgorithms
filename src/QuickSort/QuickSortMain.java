package QuickSort;
public class QuickSortMain {

    public static void run(){
        int size, array[];
		
        size = 7;
		array = new int [size];

		array[0] = 26;
		array[1] = 33;
		array[2] = 35;
		array[3] = 29;
		array[4] = 12;
		array[5] = 22;
		array[6] = 19;
		
		System.out.print("Initial Array        ");
		QuickSort.arrayPrint(array);
		
		QuickSort.sort(array, 0, size - 1);
		
		System.out.print("Final Array          ");
		QuickSort.arrayPrint(array);
    }
	
}
