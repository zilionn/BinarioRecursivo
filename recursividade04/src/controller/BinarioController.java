package controller;

public class BinarioController {

	public BinarioController() {
		super();
	}

	public String binario(int n) {
        if (n <= 1) {
            return String.valueOf(n);
        }
        int quo = n / 2;
        int resto = n %2;
        return binario(quo) + String.valueOf(resto);
	}
}