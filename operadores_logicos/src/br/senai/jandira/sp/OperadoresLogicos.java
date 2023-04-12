package br.senai.jandira.sp;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int x = 300;
		
		if (x % 2 == 1 && x > 100) {
			System.out.println("O valor é impar e maior do que 100.");
		} else {
			System.out.println("Esse valor eu não quero!!!");
		}

	}

}
