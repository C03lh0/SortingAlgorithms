package ShellSort.classes;

public class ShellSort {
    
    public static void Sort(Integer[] array) {

        ConsoleMessages.showArrayWithoutIndexArrayDivider(array);

        int indexArrayDivider = 1, arrayLength = array.length;
        indexArrayDivider = maximumArrayDividerCalculate(indexArrayDivider, arrayLength);
        checkElementsSort(array, indexArrayDivider);

        ConsoleMessages.showArrayWithoutIndexArrayDivider(array);

    }

    private static int maximumArrayDividerCalculate(int indexArrayDivider, int arrayLength) {
        while (indexArrayDivider < arrayLength) {
            indexArrayDivider = 3 * indexArrayDivider + 1;
        }
        indexArrayDivider = indexArrayDivider / 3;

        return indexArrayDivider;
    }

    private static int checkElementsSort(Integer[] array, int indexArrayDivider) {
        if (indexArrayDivider == 0) {
            return indexArrayDivider;
        }
        for (int i = indexArrayDivider; i < array.length; i++) {
            int observedElement = array[i];
            int auxiliaryIndex = i;

            auxiliaryIndex = switchElementsIfNecessary(array, indexArrayDivider, observedElement, auxiliaryIndex);
            array[auxiliaryIndex] = observedElement;
        }

        ConsoleMessages.showArrayWithIndexArrayDivider(array, indexArrayDivider);

        indexArrayDivider = indexArrayDivider / 2;

        return checkElementsSort(array, indexArrayDivider);

    }

    private static int switchElementsIfNecessary(Integer[] array, int indexArrayDivider, int observedElement,
            int auxiliaryIndex) {

        if (auxiliaryIndex >= indexArrayDivider
                && array[auxiliaryIndex - indexArrayDivider] > observedElement) {

            array[auxiliaryIndex] = array[auxiliaryIndex - indexArrayDivider];
            auxiliaryIndex = auxiliaryIndex - indexArrayDivider;

        } else {

            return auxiliaryIndex;
        }

        return switchElementsIfNecessary(array, indexArrayDivider, observedElement, auxiliaryIndex);
    }
}
