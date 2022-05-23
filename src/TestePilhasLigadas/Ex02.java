package TestePilhasLigadas;

import ed.linear.nseq.Pilha;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha singular =  new Pilha();
        Pilha plural =  new Pilha();

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite uma palavra: ");
            String palavra = sc.nextLine();
            int comprimentoPalavra = palavra.length()-1;
            if (palavra.equals("<fim>")) {
                break;
            } else if(palavra.charAt(comprimentoPalavra) == 's') {
                plural.adicionar(palavra);
                System.out.printf("Palavra %d da pilha plural: %s %n", i-singular.comprimento(), plural.elemento(i-singular.comprimento()));
            } else {
                singular.adicionar(palavra);
                System.out.printf("Palavra %d da pilha singular: %s %n", i-plural.comprimento(), singular.elemento(i-plural.comprimento()));
            }
        }

        System.out.println("Pilha de palavras no singular: " + singular.toString());
        System.out.println("Pilha de palavras no plural: " + plural.toString());
    }
}
