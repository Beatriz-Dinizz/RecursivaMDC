package view;

import controller.MDCController;

public class Principal {

	public static void main(String[] args) {
		MDCController mdc = new MDCController();
		
		int a = 20;
		int b = 24;
		
		if(a > 0 && b > 0) {
			int resultado = mdc.calcularMDC(a, b);
			System.out.println("O MDC de " + a + " e " + b + " é: " + resultado);
		} else {
			System.out.println("Número inválido! Os números devem ser inteiros positivos.");
		}
	}
}
