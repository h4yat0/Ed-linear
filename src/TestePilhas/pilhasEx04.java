package TestePilhas;

import ed.linear.Pilha;

import java.util.Scanner;

public class pilhasEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha principal = new Pilha(15);
        Pilha multiplosDeTres = new Pilha(15);

        for (int i = 0; i < principal.capacidade(); i++){
            System.out.printf("Insira o %d° inteiro da pilha: ", i+1);
            int temp =sc.nextInt();
            System.out.println(temp);

            if (temp%3 == 0) {
                multiplosDeTres.adicionar(temp);
                if (temp%2 == 0){
                    multiplosDeTres.remover();
                }
            } else{
                principal.adicionar(temp);
                if (temp%2 == 0){
                    principal.remover();
                }
            }
        }
        System.out.println("Pilha: " + principal);
        System.out.println("Multiplos de 3: " + multiplosDeTres);

    }
}
