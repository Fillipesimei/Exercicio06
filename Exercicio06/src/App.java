//Fillipe Símei Souza Ribeiro
//1261940446

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner fs = new Scanner(System.in);

        System.out.println("Digite o número:");
        int n = fs.nextInt();

        int multiplicador = 1;
        while (multiplicador <= 10) {
            System.out.println(n + " x " + multiplicador + " = " + (n * multiplicador));
            multiplicador++;
        }

        fs.close();
    }
}