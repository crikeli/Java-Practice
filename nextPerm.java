public class nextPerm {

    public static void main(String[] args) {
         nextPerm main = new nextPerm();
         int[] array = { 4, 5, 3, 2, 1 };
         // main.print(array);
         main.next_permutation(array);
         main.print(array);
    }

    public void print(int[] array) {
         for (int tmp : array) {
             System.out.print(" " + tmp);
         }
         System.out.println();
    }

    public void next_permutation(int[] array) {
         int i, j;
         // Find the largest index k such that a[k] < a[k + 1]. If no such index
         // exists, the permutation is the last permutation.
         for (i = array.length - 2; i >= 0; i--) {
             if (array[i] < array[i + 1])
          break;
         }
         if (i < 0) {
             return;
    }

         // Find the largest index l such that a[k] < a[l]. Since k + 1 is such
         // an index, l is well defined and satisfies k < l.
         for (j = array.length - 1; j > i; j--) {
             if (array[j] > array[i])
          break;
         }

         // Swap a[k] with a[l].
         swap(array, i++, j);

         // Reverse the sequence from a[k + 1] up to and including the final
         // element a[n].
         for (j = array.length - 1; j > i; i++, j--) {
             swap(array, i, j);
         }
            }

            public void swap(int[] array, int x, int y) {
         array[x] ^= array[y];
         array[y] ^= array[x];
         array[x] ^= array[y];
        }
}