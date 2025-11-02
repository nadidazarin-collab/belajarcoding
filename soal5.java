
import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Buat tabel perkalian sampai: ");
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));
            }
        }
    }
}
    

