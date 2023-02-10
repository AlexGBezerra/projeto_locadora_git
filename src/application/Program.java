package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int kminicial, kmfinal, somakm, kmtotal, kmincluso, qdias;

		double diaria, somadiaria, precoKm;

		System.out.println("Digite o valor da diaria: ");
		diaria = sc.nextDouble();

		System.out.println("Digite quantidade de  dias: ");
		qdias = sc.nextInt();

		System.out.println("Digite km inicia: ");
		kminicial = sc.nextInt();

		System.out.println("Digite o km incluso: ");
		kmincluso = sc.nextInt();

		System.out.println("Digite km final: ");
		kmfinal = sc.nextInt();

		System.out.println("Digite o valor do km excedido: ");
		precoKm = sc.nextDouble();

		somakm = kmfinal - kminicial;

		somadiaria = qdias * diaria;

		kmtotal = kmincluso * qdias;

		if (somakm <= kmtotal) {

			somadiaria = qdias * diaria;

		} else if (somakm >= kmtotal) {

			somadiaria += (somakm - kmincluso * qdias) * precoKm;

		}

		System.out.printf("Valor total a pagar: R$ %.2f%n", somadiaria);

		sc.close();
	}
}