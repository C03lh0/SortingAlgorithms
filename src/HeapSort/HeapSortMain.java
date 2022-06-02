package HeapSort;
import java.util.Arrays;

public class HeapSortMain {

    public static void run() {
        int vetorInicial[] = {12,9,13,25,18,10,22};
        int n = vetorInicial.length;
    
        System.out.println("Vetor Inicial: " + Arrays.toString(vetorInicial));
        HeapSort implementacao = new HeapSort();
        implementacao.sort(vetorInicial, n);
        System.out.println("Vetor Final: " + Arrays.toString(vetorInicial));

       }

    
}
