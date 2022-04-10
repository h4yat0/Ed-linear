package TesteFilas;

import ed.linear.FilaInt;

import java.util.Scanner;

public class filaEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();

        for (int i = 0; i < fila.capacidade(); i++){
            System.out.printf("Insira o %d° inteiro da fila: ", i+1);
            fila.adicionar(sc.nextInt());
            System.out.println("Valor inserido: " + fila.elemento(i));
        }

        System.out.println("Fila: " + fila);

    }
}
