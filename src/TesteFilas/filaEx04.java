package TesteFilas;



import ed.linear.FilaInt;

import java.util.Scanner;

public class filaEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        FilaInt filaComum = new FilaInt();
        FilaInt filaPrefe = new FilaInt();

        for (int h = 0; h < filaComum.capacidade(); h++) {
            do {
                System.out.print("""
                        
                        1) para emitir uma senha
                        2) para realizar uma chamda de atendimento
                                            
                        Digite sua escolha:""");
                choice = sc.nextInt();

            } while (choice != 1 && choice != 2);

            int i = 1;
            int j = 1;
            int emitir, chamar;

            if (choice == 1) {
                do {
                    System.out.print("""
                                
                                1) para emitir uma senha normal
                                2) para emitir uma senha preferêncial
                                                    
                                Digite sua escolha:""");

                    emitir = sc.nextInt();

                }while (emitir != 1 && emitir != 2);
                if (emitir == 1){
                    if (filaComum.cheia()){
                        System.out.println("Fila cheia, por favor realizar atendimentos pendentes.");
                    }else {
                        i++;
                        filaComum.adicionar(i);
                    }
                }
                if (emitir == 2){
                    if (filaPrefe.cheia()){
                        System.out.println("Fila cheia, por favor realizar atendimentos pendentes.");
                    }else {
                        j++;
                        filaPrefe.adicionar(j);
                    }
                }
            }

            if (choice == 2) {
                System.out.print("""
                            
                            1) para chamar uma senha normal
                            2) para chamar uma senha preferêncial
                                                
                            Digite sua escolha:""");
                chamar = sc.nextInt();
                if (chamar == 1){
                    if (filaComum.vazia()){
                        System.out.println("Nenhuma senha comum disponível: ");
                    }else{
                        filaComum.remover();
                    }
                }
                if (chamar == 2){
                    if (filaPrefe.vazia()){
                        System.out.println("Nenhuma senha preferêncial disponível: ");
                    }else {
                        filaPrefe.remover();
                    }
                }
            }
            System.out.println("Fila comum: " + filaComum);
            System.out.println("Fila preferêncial " + filaPrefe);
        }

    }

}
