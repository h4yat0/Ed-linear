package TesteFilas;


import ed.linear.FilaInt;

import java.util.Scanner;

public class filaEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt(12);

        for (int i = 0; i < fila.capacidade(); i++) {
            System.out.printf("Digite o %d° número: ", i+1);
            fila.adicionar(sc.nextInt());
        }

        System.out.println("Fila: " + fila);

        for (int i = 0; i < fila.capacidade(); i++) {
            if (fila.elemento(0)%2 != 0){
                int aux = fila.elemento(0);
                fila.remover();
                fila.adicionar(aux);
            } else if (fila.elemento(0)%2 == 0)
            fila.remover();
        }

        System.out.println("Fila sem pares: " + fila);

    }
}
