package SortingAlgorithmsMain;
import HeapSort.HeapSortMain;
import MergeSort.MergeSortMain;
import QuickSort.QuickSortMain;
import ShellSort.classes.ShellSortMain;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Start Merge Sort:\n");
        MergeSortMain.run();
        System.out.println("\n\nEnd!\n");
  
        System.out.println("Start Heap Sort:\n");
        HeapSortMain.run();
        System.out.println("\nEnd!\n");
  
        System.out.println("Start Shell Sort\n");
        ShellSortMain.run();
        System.out.println("\nEnd!\n");
  
        System.out.println("Start Quick Sort\n");
        QuickSortMain.run();
        System.out.println("\nEnd!\n");
    }
}
