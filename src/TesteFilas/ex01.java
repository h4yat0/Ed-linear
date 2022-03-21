package TesteFilas;

import ed.linear.Fila;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();

        for (int i = 0; i < fila.capacidade(); i++){
            System.out.printf("Insira o %d° inteiro da fila: ", i+1);
            fila.adicionar(sc.nextInt());
        }

        System.out.println("Fila: " + fila);

    }
}
