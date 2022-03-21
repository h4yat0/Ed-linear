package TesteFilas;

import ed.linear.Fila;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila(12);
        Fila filaAux = new Fila(fila.capacidade());

        for (int i = 0; i < fila.capacidade(); i++) {
            System.out.printf("Digite o %d° número: ", i+1);
//            fila.adicionar(i);
            fila.adicionar(sc.nextInt());
        }

        System.out.println("Fila: " + fila);
        for (int i = 0; i < fila.capacidade(); i++) {
            int aux = fila.elemento(0);

            if (aux%2 != 0){
                filaAux.adicionar(aux);
            }
            fila.remover();
        }

        for (int i = 0; i < filaAux.comprimento(); i++) {
            fila.adicionar(filaAux.elemento(i));
        }
        System.out.println("Fila sem pares: " + fila);

    }
}
