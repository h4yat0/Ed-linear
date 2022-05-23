package TestePilhasLigadas;

public class Teste01 {
	static NodoLigado inicio = null;
	
	public static void main(String[] args) {
		System.out.println("inicio:");
		exibeLista(inicio);
		adicionaNoInicioDaLista(5);
		System.out.println("parcial:");
		exibeLista(inicio);
		adicionaNoInicioDaLista("ADS");
		adicionaNoInicioDaLista("SE");
		adicionaNoInicioDaLista("GTI");
		adicionaNoInicioDaLista(1234.5678);
		System.out.println("final:");
		exibeLista(inicio);
		
		System.out.println(removeDoInicioDaLista()); 
		System.out.println("pos-final:");
		exibeLista(inicio);
	}
	
	public static void adicionaNoInicioDaLista(Object valor) {
		NodoLigado novo = new NodoLigado();
		novo.dado = valor;
		novo.prox = inicio;
		inicio = novo;
	}
	
	public static Object removeDoInicioDaLista() {
		if (inicio != null) {
			NodoLigado aux = inicio;
			inicio = inicio.prox;
			aux.prox = null;
			return aux.dado;
		}
		return null;
	}

	
	public static void exibeLista(NodoLigado nodo) {
		while (nodo != null) {
			System.out.println(nodo.dado);
			nodo = nodo.prox;
		}
	}

}
