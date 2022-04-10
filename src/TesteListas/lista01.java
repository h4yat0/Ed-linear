package TesteListas;

import ed.linear.Lista;

import java.util.Scanner;

public class lista01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista(10);

        for (int i = 0; i < lista.capacidade(); i++){
            System.out.print("Insira um nome: ");
            lista.adicionar(sc.nextLine());
        }

        System.out.println("Fila: " + lista);
    }
}
