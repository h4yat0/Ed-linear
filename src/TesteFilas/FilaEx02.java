package TesteFilas;

import java.util.Scanner;

import ed.linear.FilaInt;

public class FilaEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt positivos = new FilaInt();
        FilaInt negativos = new FilaInt();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d° número: ", i+1);
            int temp = sc.nextInt();

            if (temp == 0){
                break;
            }

            if (temp > 0){
                positivos.adicionar(temp);
                System.out.println("Valor inserido: " + positivos.elemento(positivos.comprimento()-1));
            } else {
                negativos.adicionar(temp);
                System.out.println("Valor inserido: " + negativos.elemento(negativos.comprimento()-1));
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

    }
}
