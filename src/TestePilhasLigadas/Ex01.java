package TestePilhasLigadas;

import ed.linear.nseq.Pilha;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha pilhaNseq =  new Pilha();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int valor = sc.nextInt();
            pilhaNseq.adicionar(valor);

            System.out.printf("Elemento %d da pilha: %d %n", i, pilhaNseq.elemento(i));
        }

        System.out.println("Pilha de inteiros: " + pilhaNseq.toString());
    }
}
