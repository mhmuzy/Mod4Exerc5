package Hitss.Treinamento.Apresentacao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		try {
			System.out.println("");
			System.out.println("     Hitss Treinamento");
			System.out.println("");
			System.out.println("Digite um número decimal.");
			System.out.println("");
			Scanner teclado = new Scanner(System.in);
		double d = teclado.nextDouble();
		System.out.println("");
		BigDecimal bd = new BigDecimal(d).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("O valor arredondado em 2 casa é : " + bd.doubleValue());
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
