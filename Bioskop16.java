public class Bioskop16 {
    public static void main(String[] args) {
        String Penonton[][] = new String[4][2];
        Penonton[0][0] = "Amin";
        Penonton[0][1] = "Bena";
        Penonton[1][0] = "Candra";
        Penonton[1][1] = "Dela";
        Penonton[2][0] = "Eka";
        Penonton[2][1] = "Farhan";
        Penonton[3][0] = "Gisel ";
        Penonton[3][1] = "hanna";
       

        System.out.printf("%s \t %s\n", Penonton[0][0], Penonton[0][1]);
        System.out.printf("%s \t %s\n", Penonton[1][0], Penonton[1][1]);
        System.out.printf("%s \t %s\n", Penonton[2][0], Penonton[2][1]);
        System.out.printf("%s \t %s\n", Penonton[3][0], Penonton[3][1]);

        System.out.println(Penonton.length);
        System.out.println(Penonton[0].length);
        System.out.println(Penonton[1].length);
        System.out.println(Penonton[2].length);
        System.out.println(Penonton[3].length);

        for (int i = 0; i < Penonton.length; i++) {
            System.out.println("Panjang baring ke- " + (i+1) + " : " + Penonton[i].length);
        }

        System.out.println(Penonton.length);
        for (String[] barisPenonton : Penonton) {
            System.out.println("Panjang baris : " + barisPenonton.length);
        }

        System.out.println("Penonton pada baris ke-3 : ");

        for (int i = 0; i < Penonton[2].length;i++) {
            System.out.println(Penonton[2][i]);
        }

        System.out.println("Penonton pada baris ke-3 : ");

        for (String i : Penonton[2]) {
            System.out.println(i);
        }

        for (int i = 0; i < Penonton.length; i++) {
            System.out.println("Penonton pada baris ke- " + (i + 1) + " : " + String.join(", ", Penonton[i]));
        }
    }
}