import java.util.Scanner;
public class soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata: ");
        String kata = scanner.nextLine();
        scanner.close();

        String terbalik = new StringBuilder(kata).reverse().toString();
        System.out.println(terbalik);
    }

    
}
