package TestePilhasLigadas;

public class pilhaLigada {
    static NodoLigado top = null;

    public static void add(Object value) {
        NodoLigado  temp = new NodoLigado();
        temp.dado = value;
        temp.prox = top;
        top = temp;
    }

    public static Object remove() {
        if(top != null) {
            NodoLigado aux = top;
            top = top.prox;
            aux.prox = null;
            return aux.dado;
        }
        return null;
    }

    public static boolean empty() {
        return top == null;
    }

    public static int lenght(NodoLigado nodo){
        int lenght = 0;
        while (nodo != null) {
            lenght += 1;
            nodo = nodo.prox;
        }
        return lenght;
    }
    public static Object element(NodoLigado nodo, int pos) {
        int length = lenght(nodo);
        int i = 0;
        Object aux = 0;
        if (!empty() && pos < length){
            while (nodo != null) {
                if(i == pos) {
                    aux = nodo.dado;
                }
                nodo = nodo.prox;
                i++;
            }
            return aux;

        } else {
            throw new RuntimeException("Posição inválida");
        }
    }
    public static String toString(NodoLigado nodo){
        String text = "[ ";

        while (nodo != null) {
            text = text + nodo.dado + " ";
            nodo = nodo.prox;
        }

        text = text + "]";

        return text;
    }

    public static void main(String[] args) {
        System.out.print("inicio    -->    ");
        System.out.println(toString(top) + " Comprimento atual: " + lenght(top));
        System.out.println("A lista está fazia: " + empty());
        //System.out.println("Elemento na posicao 0: " + (element(top, 0))); Resulta em erro como esperado
        add(5);
        System.out.println("Elemento na posicao 0: " + (element(top, 0)));
        System.out.print("parcial   -->    ");
        System.out.println(toString(top) + " Comprimento atual: " + lenght(top));
        add("ADS");
        add("SE");
        add("GTI");
        add(1234.5678);
        System.out.print("final     -->    ");
        System.out.println(toString(top) + " Comprimento atual: " + lenght(top));
        System.out.println("Elemento na posicao 3: " + (element(top, 3)));

        System.out.println(remove());
        System.out.print("pos-final -->    ");
        System.out.println(toString(top) + " Comprimento atual: " + lenght(top));
    }
}
