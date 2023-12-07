import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
public class AlgTest {

    long startTime;
    int numberEl = 10000;
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
    private List<Integer> readCSV(String pathCSV){
        List<Integer> csvData = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(pathCSV))) {
            while ((line = br.readLine()) != null) {
                String[] country = line.split("\n");
                for(String c:country){
                    csvData.add(Integer.parseInt(c));
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return csvData;
    }
    @Test
    public void testSpeed(){
        List<Integer> MIS_10 = readCSV("10IM.csv");
        List<Integer> MIS_30 = readCSV("30IM.csv");
        List<Integer> MIS_50 = readCSV("50IM.csv");
        List<Integer> MIS_70 = readCSV("70IM.csv");
        List<Integer> MS_200k = readCSV("10k_sorted_reverse.csv");
        double avrMS = 0.0;
        double avrMIS_10 = 0.0;
        double avrMIS_30 = 0.0;
        double avrMIS_50 = 0.0;
        double avrMIS_70 = 0.0;
        int MIS_10_l = 0;
        int MIS_30_l = 0;
        int MIS_50_l = 0;
        int MIS_70_l = 0;
        for (int i = 0; i < 100; i++) {
            if(MIS_10.get(i) < MS_200k.get(i)){
                MIS_10_l++;
//                System.out.println("Merge Insert Sort 10: " + MIS_10.get(i));
            }
//            else {
//            System.out.println("Merge Sort: " + MS_200k.get(i));
//            }
//            System.out.println("----------------------------------------------------------------------------------------");
            if(MIS_30.get(i) < MS_200k.get(i)){
                MIS_30_l++;
//                System.out.println("Merge Insert Sort 30: " + MIS_30.get(i));
            }
//            else {
//                System.out.println("Merge Sort: " + MS_200k.get(i));
//            }
//            System.out.println("----------------------------------------------------------------------------------------");
            if(MIS_50.get(i) < MS_200k.get(i)){
                MIS_50_l++;
//                System.out.println("Merge Insert Sort 50: " + MIS_50.get(i));
            }
//            else {
//                System.out.println("Merge Sort: " + MS_200k.get(i));
//            }
//            System.out.println("----------------------------------------------------------------------------------------");
            if(MIS_70.get(i) < MS_200k.get(i)){
                MIS_70_l++;
//                System.out.println("Merge Insert Sort 70: " + MIS_70.get(i));
            }
//            else {
//                System.out.println("Merge Sort: " + MS_200k.get(i));
//            }
//            System.out.println("----------------------------------------------------------------------------------------");
        }
        System.out.println("Liczba wyników prędkości: \nMIS10: " + MIS_10_l + "\nMIS30: " + MIS_30_l + "\nMIS50: " + MIS_50_l +
                "\nMIS70: " + MIS_70_l);
        for (int i = 0; i < 100; i++) {
            avrMS += MS_200k.get(i);
            avrMIS_10 += MIS_10.get(i);
            avrMIS_30 += MIS_30.get(i);
            avrMIS_50 += MIS_50.get(i);
            avrMIS_70 += MIS_70.get(i);
        }
        System.out.println("Average Merge Sort: " + avrMS/100 + "\nAverage Merge Insert Sort 10: " + avrMIS_10/100 + "\nAverage Merge Insert Sort 30: " + avrMIS_30/100 +
                "\nAverage Merge Insert Sort 50: " + avrMIS_50/100 + "\nAverage Merge Insert Sort 70: " + avrMIS_70/100);
    }
    @Test
    public void testMergeISortExecuteTime10(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(numberEl);
            startTime = System.currentTimeMillis();
            Main.MergeInsertSort(array, 0, array.length - 1, 10);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "10IM.csv");
    }
    @Test
    public void testMergeISortExecuteTime30(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(numberEl);
            startTime = System.currentTimeMillis();
            Main.MergeInsertSort(array, 0, array.length - 1, 30);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "30IM.csv");
    }
    @Test
    public void testMergeISortExecuteTime50(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(numberEl);
            startTime = System.currentTimeMillis();
            Main.MergeInsertSort(array, 0, array.length - 1, 50);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "50IM.csv");
    }
    @Test
    public void testMergeISortExecuteTime70(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(numberEl);
            startTime = System.currentTimeMillis();
            Main.MergeInsertSort(array, 0, array.length - 1, 70);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "70IM.csv");
    }

    @Test
    public void testMergeSortExecuteTime30(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(30);
            startTime = System.currentTimeMillis();
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
    public void testMergeSortExecuteTime50(){
        for (int i = 0; i < 100; i++) {
            startTime = System.currentTimeMillis();
            Integer[] array = Main.generateArray(50);
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "50.csv");
    }

    @Test
    public void testMergeSortExecuteTime10(){
        for (int i = 0; i < 100; i++) {
            startTime = System.currentTimeMillis();
            Integer[] array = Main.generateArray(10);
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "10.csv");
    }
    @Test
    public void testMergeSortExecuteTime70(){
        for (int i = 0; i < 100; i++) {
            startTime = System.currentTimeMillis();
            Integer[] array = Main.generateArray(70);
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "70.csv");
    }
    @Test
    public void testMergeSortExecuteTime10k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(10000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "10k.csv");
    }
    @Test
    public void testMergeSortExecuteTime20k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(20000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "20k.csv");
    }
    @Test
    public void testMergeSortExecuteTime30k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(30000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "30k.csv");
    }
    @Test
    public void testMergeSortExecuteTime40k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(40000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "40k.csv");
    }
    @Test
    public void testMergeSortExecuteTime50k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(50000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "50k.csv");
    }
    @Test
    public void testMergeSortExecuteTime60k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(60000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "60k.csv");
    }
    @Test
    public void testMergeSortExecuteTime70k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(70000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "70k.csv");
    }
    @Test
    public void testMergeSortExecuteTime80k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(80000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "80k.csv");
    }
    @Test
    public void testMergeSortExecuteTime90k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(90000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "90k.csv");
    }
    @Test
    public void testMergeSortExecuteTime100k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(100000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "100k.csv");
    }
    @Test
    public void testMergeSortExecuteTime110k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(110000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "110k.csv");
    }
    @Test
    public void testMergeSortExecuteTime120k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(120000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "120k.csv");
    }
    @Test
    public void testMergeSortExecuteTime130k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(130000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "130k.csv");
    }
    @Test
    public void testMergeSortExecuteTime140k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(140000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "140k.csv");
    }
    @Test
    public void testMergeSortExecuteTime150k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(150000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "150k.csv");
    }
    @Test
    public void testMergeSortExecuteTime160k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(160000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "160k.csv");
    }
    @Test
    public void testMergeSortExecuteTime170k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(170000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "170k.csv");
    }
    @Test
    public void testMergeSortExecuteTime180k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(180000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "180k.csv");
    }
    @Test
    public void testMergeSortExecuteTime190k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(190000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "190k.csv");
    }
    @Test
    public void testMergeSortExecuteTime200k(){
        for (int i = 0; i < 100; i++) {
            Integer[] array = Main.generateArray(200000);
            startTime = System.currentTimeMillis();
            Main.MergeSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            double executeTimeS = executeTime / 1000.0;
            speedData.add(executeTime);
            System.out.println("Czas wykonania algorytmu: " + executeTimeS + " s. Przy rozmiarze danych:  " + array.length);
            assertTrue("Czas wykonania algorytmu powinien być mniejszy niż 1 s", executeTimeS < 1);
        }
        writeDataToCSV(speedData, "200k.csv");
    }
}
