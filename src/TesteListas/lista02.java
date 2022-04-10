package TesteListas;

import ed.linear.Lista;

import java.util.Scanner;

public class lista02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista positivos = new Lista(10);
        Lista negativos = new Lista(10);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d° número real: ", i+1);

            double temp = sc.nextDouble();

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
