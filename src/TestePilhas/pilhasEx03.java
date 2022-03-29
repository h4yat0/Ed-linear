package TestePilhas;

import ed.linear.Pilha;

import java.util.Scanner;

public class pilhasEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();
        for (int i = 0; i < pilha.capacidade(); i++){
            System.out.printf("Insira o %d° inteiro da pilha: ", i+1);
            pilha.adicionar(sc.nextInt());
        }
        System.out.println("Pilha: " + pilha);

        System.out.print("Valores em ordem de entrada: ");
        for (int i = 0; i < pilha.comprimento(); i++) {
            System.out.print(pilha.elemento(i) + " ");

        }
    }
}
