import java.util.Scanner;

public class SIAKAD16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        System.out.println();

        int[][] nilai = new int[jumlahMhs][jumlahMatkul];

        for(int i = 0; i < nilai.length; i++){
            System.out.println("Input nilai mahasiswa ke-"+(i+1));
            double totalPerSiswa = 0;  

            for(int j = 0; j < nilai[i].length; j++){
                System.out.print("Nilai mata kuliah "+ (j+1) + ": ");
                nilai[i][j] =sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: "+totalPerSiswa/jumlahMhs);
            System.out.println();
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for(int j = 0; j < jumlahMatkul; j++){
            double totalPerMatkul = 0;

            for(int i = 0; i < jumlahMhs; i++){
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah "+ (j+1) +": "+totalPerMatkul/jumlahMhs);
        }
    }
}

