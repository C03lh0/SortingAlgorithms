package ShellSort.classes;

public class ConsoleMessages {
    public static void showArrayWithIndexArrayDivider(Integer[] array, int indexArrayDivider) {
        for (int i = 0; i < array.length; i++) {   
            System.out.print(array[i]+ " ");
        }
        System.out.println("| H :" + indexArrayDivider);
     }
     public static void showArrayWithoutIndexArrayDivider(Integer[] array) {
         for (int i = 0; i < array.length; i++) {   
             System.out.print(array[i]+ " ");
         }
        System.out.println();
 
     }
}
