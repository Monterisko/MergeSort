import org.junit.Test;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
public class AlgTest {

    long startTime;
    List<Long> speedData = new ArrayList<>();
    private void writeDataToCSV(List<Long> speedData, String fileName){
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Long speed : speedData) {
                writer.append(speed.toString());
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMergeSortExecuteTime30(){
        for (int i = 0; i < 100; i++) {
            startTime = System.currentTimeMillis();
            int[] array = Main.generateArray(30);
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "30.csv");
    }
    @Test
    public void testMergeSortExecuteTime10k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(10000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "10k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime20k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(20000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "20k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime30k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(30000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            Main.MergeSort(Main.tablica, 0, Main.tablica.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "30k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime40k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(40000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "40k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime50k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(50000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "50k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime60k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(60000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "60k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime70k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(70000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "70k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime80k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(80000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "80k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime90k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(90000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "90k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime100k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(100000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "100k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime110k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(110000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "110k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime120k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(120000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "120k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime130k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(130000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "130k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime140k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(140000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "140k_sorted.csv");
    }@Test
    public void testMergeSortExecuteTime150k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(150000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "150k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime160k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(160000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "160k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime170k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(170000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "170k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime180k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(180000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "180k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime190k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(190000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "190k_sorted.csv");
    }
    @Test
    public void testMergeSortExecuteTime200k(){
        for (int i = 0; i < 100; i++) {
            int[] array = Main.generateArray(200000);
            Arrays.sort(array);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "200k_sorted.csv");
    }
}
