package HeapSort;

public class HeapSort {

    public void sort(int a[], int n){
         
        for(int i=n/2-1;i>=0; i -- ){
            heapsort(a, n, i);
         }
         
         
         int c=6;
         for(int j = n-1; j>0; j--){
             int aux = a[0];
             a[0]= a[j];
             a[j] = aux;
             heapsort(a, j, 0);
             for(int cont = 0; cont<=6; cont ++){
                 if(cont==0){
                    System.out.print("" + a[cont]);
                 }else if(cont==c){
                     c--;
                     System.out.print(" | " + a[cont]);
                 } else {
                    System.out.print(" ,"  + a[cont]);
                 }
                 
             }
             System.out.println();
            }
             
             
         }


    // vetor a + tamanho do vetor
    public void heapsort(int a[], int n, int i) {
        //n tamanho da arvore
            int pai = i;
            int filhoEsquerda = 2*i+1;
            int filhoDireita = 2*i+2;

            if(filhoEsquerda < n && a[filhoEsquerda] > a[pai] ){
                pai = filhoEsquerda;
            }

            if(filhoDireita < n && a[filhoDireita] > a[pai]){
                pai = filhoDireita;
            }

            if(pai != i){
                int aux = a[i];
                a[i] = a[pai];
                a[pai] = aux;

                heapsort(a, n, pai);
            }

    }
    
}
