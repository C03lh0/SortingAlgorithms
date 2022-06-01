package  MergeSort;

public class MergeSort {
    

    public static void mergeSort(int integerArray [], int startIndex, int finishIndex){
        
        // Se os index forem iguais, quer dizer que length = 1. Cheguei no caso base
        if(startIndex == finishIndex){
            return;
        } else{
            // Caso contrário, vamos dividir o array pela metade até que chegue em 1.
            // Calcula a metade do array.
            
            int halfIndex = (startIndex + finishIndex)/2;

            // Imprimindoa execução.
            ConsoleMessage(integerArray, startIndex, halfIndex, finishIndex);
            
            // Dividir todos do lado esquerdo.
            mergeSort(integerArray, startIndex, halfIndex);

            // Dividir todos lado direito.
            mergeSort(integerArray, halfIndex+1, finishIndex);

            // Unir lado esquerdo com o lado direito ordenando.
            merge(integerArray, startIndex, halfIndex, finishIndex);

        }
    }

    public static void merge(int[] arrayMain, int startIndex, int halfIndex, int finishIndex) {
        // Criando subarrays, esquerdo e direito
        int leftArray[] = new int[halfIndex - startIndex + 1];
        int rightArray[] = new int[finishIndex - halfIndex];
    
        // Passando os valores do array principal para os subarrays
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = arrayMain[startIndex + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = arrayMain[halfIndex + i + 1];
    
        // Index dos subarrays
        int leftIndex = 0;
        int rightIndex = 0;
    
        // Copiando dos subarrays leftArray e rightArray de volta para array, agora de forma ordenada
        for (int i = startIndex; i <= finishIndex; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arrayMain[i] = leftArray[leftIndex];
                   leftIndex++;
                } else {
                    arrayMain[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // Se todos os elementos de rightArray já foram copiados, devemos copiar o restante de leftArray
                arrayMain[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // Se todos os elementos de leftArray já foram copiados, devemos copiar o restante de rightArray
                arrayMain[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void ConsoleMessage(int[] array, int start, int half, int finish){
        
        System.out.println("");
        for(int i = start; i <= finish; i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("");

        for(int i = start; i <= finish; i++){
            
            System.out.print(array[i]+" ");
            if (i == half) {
                System.out.print("| ");
            }
        }
    }
}
