package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cod, sal_b = 0;
		String sexo;
		System.out.println("Qual o código por agora? (IMPORTANTE: digitar os códigos em ordem! se não forem digitados nela, ");
		System.out.println("-pode ocorrer algum erro)");
		cod = sc.nextDouble();
		double cont_f = 0;
		double cont_m = 0;
		int num_h = 0;
		while(cod != 100000) {
			System.out.println("Qual o seu sexo? (OBS = M - Masculino/F - Feminino)");
			sexo = sc.next();
			System.out.println("E qual o número de horas trabalhadas por você?");
			num_h = sc.nextInt();
			sal_b = num_h * 30;
			double sal_l = 0;
			if (sexo.equals("M")) {
				sal_l = sal_b - (sal_b * 10 / 100);
				cont_m = cont_m + 1;
			} if (sexo.equals("F")) {
				sal_l = sal_b - (sal_b * 5 / 100);
				cont_f = cont_f + 1;
			}
			System.out.println("O código de agora foi: " + cod);
			System.out.println("Seu salário bruto é de: " + sal_b);
			System.out.println("E o líquido de: " + sal_l);
			System.out.println("Qual o código agora?(Digite 100000 para terminar a ação).");
			cod = sc.nextDouble();
		} if  (cont_m == 0) {
		     System.out.println("nenhum professor do sexo masculino");
		} else {
			System.out.println("existem em média " + cont_m + " professores do sexo masculino");
		} if (cont_f == 0) {
			System.out.println("E nenhum professor do sexo feminino");
		} else {
			System.out.println("E existem em média " + cont_f + " professores do sexo feminino");
		}
	}

}
