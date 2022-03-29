package TestePilhas;

import java.util.Scanner;

import ed.linear.Pilha;


public class pilhasEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();

        for (int i = 0; i < pilha.capacidade(); i++){
            System.out.printf("Insira o %d° inteiro da pilha: ", i+1);
            pilha.adicionar(sc.nextInt());
            System.out.println(pilha.elemento(i));
        }

        System.out.println("Pilha: " + pilha);

    }
}
