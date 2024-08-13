package controller;

public class MDCController {

	public MDCController() {
		super();
	}
	
	public int calcularMDC(int a, int b) {
		if(b == 0) {
			return a;
		}
		
		return calcularMDC(b, a % b);
	}
}
