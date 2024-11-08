import java.util.Scanner;

public class Tugas16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] NilaiSurvei = new int[10][6];
        double nilai;
        
        // Collect survey responses
        for (int i = 0; i < NilaiSurvei.length; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < NilaiSurvei[i].length; j++) {
                System.out.print("Masukkan nilai dari pertanyaan " + (j + 1) + ": ");
                nilai = scanner.nextDouble();
                NilaiSurvei[i][j] = (int) nilai;
            }
            System.out.println();
        }
        System.out.println();

        // Calculate and display average for each respondent
        for (int i = 0; i < NilaiSurvei.length; i++) {
            int sum = 0;
            for (int j = 0; j < NilaiSurvei[i].length; j++) {
                sum += NilaiSurvei[i][j];
            }
            double rata2 = (double) sum / NilaiSurvei[i].length;
            System.out.println("Rata rata dari responden " + (i + 1) + ": " + rata2);
        }
        System.out.println();

        // Calculate overall average
        int totalSum = 0;
        int totalElements = NilaiSurvei.length * NilaiSurvei[0].length;
        
        for (int i = 0; i < NilaiSurvei.length; i++) {
            for (int j = 0; j < NilaiSurvei[i].length; j++) {
                totalSum += NilaiSurvei[i][j];
            }
        }
        
        double rataNilai = (double) totalSum / totalElements;
        System.out.println("Rata rata keseluruhan: " + rataNilai);

        scanner.close();
    }
}
