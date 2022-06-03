package ShellSort.teacher_code;

public class TeacherShellSort {

    /*
     * Classe do slide de shellsort com o codigo do professor para
     * comparacao com a saida do codigo feito pelo grupo.
     */

	public static void ShellSort(int[] array) {
		int h = 1;
		int n = array.length;

		while (h < n) {
			h = h * 3 + 1;
		}

		h = h / 3;
		int c, j;

		while (h > 0) {
			for (int i = h; i < n; i++) {
				c = array[i];
				j = i;
				while (j >= h && array[j - h] > c) {
					array[j] = array[j - h];
					j = j - h;
				}
				array[j] = c;
			}
			System.out.println("Array Divider: " + h);
			h = h / 2;
		}
	}

	public static void main(String[] args) {
		int[] array = {17, 25, 49, 12 , 18, 23, 45, 38, 53, 42, 27, 13, 11, 28, 10, 14};
		ShellSort(array);

	}

}
