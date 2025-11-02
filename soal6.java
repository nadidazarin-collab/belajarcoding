import java.util.Scanner;
public class soal6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka;

        while (true) {
            System.out.print("Masukkan angka antara 1 dan 100: ");
            angka = in.nextInt();

            if (angka >= 1 && angka <= 100) {
                System.out.println("Terima kasih! Angka yang Anda masukkan adalah " + angka + ".");
                break;
            } else {
                System.out.println("Input tidak valid. Coba lagi.");
            }
        }
        
    }
}
    

