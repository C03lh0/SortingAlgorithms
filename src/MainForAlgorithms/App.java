package MainForAlgorithms;
import HeapSort.HeapSortMain;
import MergeSort.MergeSortMain;

public class App {
    public static void main(String[] args) throws Exception {
      System.out.println("Start Merge Sort: \n");
      MergeSortMain.run();
      System.out.println("End!\n");
      System.out.println();
      System.out.println("Start Heap Sort: \n");
      HeapSortMain.run();
      System.out.println("End! \n");
      
    }
}
