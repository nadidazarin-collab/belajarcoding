
import java.util.Scanner;
public class soal7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = in.nextLine().toLowerCase();

        int jumlahVokal = 0;
        for (char c : kalimat.toCharArray()) {
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
                jumlahVokal++;
            }
        }

        System.out.println("Jumlah huruf vokal adalah: " + jumlahVokal);
    }
}
    

