import java.util.Random;

public class Main {

    static Random random = new Random();
    static Integer[] tablica;

    static Integer[] generateArray(int size){
        tablica = new Integer[size];
        for (int i = 0; i < size; i++) {
            tablica[i] = random.nextInt(1000000);
        }
        return tablica;
    }

    static void Print(Integer[] tab){
        for (Integer integer : tab) {
            System.out.print(integer + ", ");
        }
    }

    static void InsertionSort(Integer[] array)
    {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void MergeInsertSort(Integer[] array, int start, int stop, int InsertStart){
        if(array.length > InsertStart){
            if(start < stop){
                int m = (start + stop) / 2;
                MergeInsertSort(array, start, m, InsertStart);
                MergeInsertSort(array, m + 1, stop, InsertStart);
                Merge(array, start, m, stop);
            }
        }
        else {
            InsertionSort(array);
        }
    }
    public static void MergeSort(Integer[] array, int start, int stop){
        if(start < stop){
            int m = (start + stop) / 2;
            MergeSort(array, start, m);
            MergeSort(array, m + 1, stop);
            Merge(array, start, m, stop);
        }
    }

    public static void Merge(Integer[] array, int start, int mid, int stop){
        int n1 = mid - start + 1;
        int n2 = stop - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[start + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = array[mid + i + 1];
        }

        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2){
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            array[k] = L[i];
            ++i;
            ++k;
        }
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
    }

}