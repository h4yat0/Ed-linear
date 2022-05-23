package TestePilhasLigadas;

import ed.linear.nseq.Pilha;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha pilhaNseqInt =  new Pilha();

        char resposta;
        int i = 0;
        while(true) {

            if(!pilhaNseqInt.vazia()) {
                System.out.printf("Você já inseriu %d números %nDeseja continuar inserindo? ([N/n] para parar): ", i);
                resposta = sc.next().charAt(0);

                if (Character.toLowerCase(resposta) == 'n' ){
                    break;
                }
            }

            System.out.print("Digite um número inteiro: ");
            int valor = i;//sc.nextInt();
            pilhaNseqInt.adicionar(valor);

            System.out.printf("Elemento %d da pilha: %d %n", i, (int)pilhaNseqInt.elemento(i));

            i++;
        }

        System.out.println("Pilha de inteiros: " + pilhaNseqInt);

        for (int j = 0; j < pilhaNseqInt.comprimento(); j++) {
            int aux = (int) pilhaNseqInt.elemento(j);

            if (aux%2 == 0) {
                pilhaNseqInt.adicionar(aux);
                pilhaNseqInt.remover();
            } else {

            }
            System.out.println("Pilha de inteiros sem pares: " + pilhaNseqInt);
//            System.out.println(pilhaNseqInt.elemento(j));
        }
    }
}
