package TestePilhas;

import ed.linear.Pilha;

import java.util.Scanner;

public class pilhasEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha positivos = new Pilha();
        Pilha negativos = new Pilha();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d° número: ", i+1);
            int temp = sc.nextInt();

            if (temp == 0){
                break;
            }

            if (temp > 0){
                positivos.adicionar(temp);
            } else {
                negativos.adicionar(temp);
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

    }
}
