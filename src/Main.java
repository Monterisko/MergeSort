import java.util.Random;

public class Main {

    static Random random = new Random();
    static Integer[] tablica = generateArray(10000);

    static Integer[] generateArray(int size){
        tablica = new Integer[size];
        for (int i = 0; i < size; i++) {
            tablica[i] = random.nextInt(1000000);
        }
        return tablica;
    }

    public static void MergeSort(Integer[] tab, int start, int stop){
        if(start < stop){
            int m = (start + stop) / 2;
            MergeSort(tab, start, m);
            MergeSort(tab, m + 1, stop);
            Merge(tab, start, m, stop);
        }
    }

    public static void Merge(Integer[] tab, int start, int mid, int stop){
        int n1 = mid - start + 1;
        int n2 = stop - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = tab[start + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = tab[mid + i + 1];
        }

        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2){
            if(L[i] <= R[j]){
                tab[k] = L[i];
                i++;
            }
            else {
                tab[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            tab[k] = L[i];
            ++i;
            ++k;
        }
        while (j < n2) {
            tab[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ", ");
        }
        System.out.println("\n-----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ", ");
        }
    }

}