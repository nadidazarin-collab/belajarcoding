import java.util.Scanner;
public class soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi pola: ");
        int tinggi = scanner.nextInt();

        for (int i = tinggi; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
    

