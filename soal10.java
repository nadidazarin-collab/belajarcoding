import java.util.Scanner;
public class soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
       
        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
            case '/':
                if (angka2 != 0) {
                    System.out.println("Hasil: " + (angka1 / angka2));
                } else {
                    System.out.println("Error: Tidak bisa melakukan pembagian dengan nol.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
        }
    }

    
}
