import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2]; // Array untuk menampung data penonton
        int pilihan, baris, kolom;

        while (true) {
            // Menampilkan menu
            System.out.println("===== Menu =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            System.out.println();
            sc.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1: // Input data penonton
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();

                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine(); // membersihkan buffer

                            // Mengecek apakah baris dan kolom yang dimasukkan berada dalam batas array
                            if (baris > penonton.length || kolom > penonton[2].length) {
                                System.out.println("Nomor baris atau kolom tidak tersedia. Coba lagi.");
                            } else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                break;
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            System.out.println();
                            break;
                        }
                    }
                    break;

                case 2: // Tampilkan daftar penonton
                    System.out.println("===== Daftar Penonton =====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3: // Exit
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}
