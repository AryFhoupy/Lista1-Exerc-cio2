import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
             
        int numero = scan.nextInt();

        scan.close();

        System.out.println("O número informado foi: " + numero);
    }
}
