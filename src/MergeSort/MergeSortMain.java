package MergeSort;
public class MergeSortMain {

    public static void run() {
        
        int arrayInteger[] = {23, 17, 8, 15, 9, 12, 19, 7};

        System.out.print("Vetor Inicial   ");
        for(int i = 0; i < arrayInteger.length; i++){
            System.out.print(arrayInteger[i]+" ");
        }

        MergeSort.mergeSort(arrayInteger, 0, arrayInteger.length-1);

        System.out.print("\nVetor Final   ");
        for(int i = 0; i < arrayInteger.length; i++){
            System.out.print(arrayInteger[i]+" ");
        }
    }
    
}
