package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pre, imposto, pre_custo, desconto, novo_pre = 0;
		String tipo, refrig;
		System.out.println("O produto precisa de refrigeração?(OBS: S - Sim e N - não)");
		refrig = sc.next();
		System.out.println("Qual o tipo do produto? (Digite A - Alimentação; L - Limpeza; Vestuário - V)");
		tipo = sc.next();
		System.out.println("E qual é o preço dele?");
		pre = sc.nextDouble();
		double valor_adic = 0;
		if (refrig == "N") {
			if (tipo == "A") {
				if (pre < 15) {
					valor_adic = 2;
				}else {
					valor_adic = 5;
				}
			}
			if (tipo == "L") {
				if (pre < 10) {
					valor_adic = 1.50;
				}else {
					valor_adic = 2.50;
				}
			}
			if (tipo == "V") {
				if (pre < 30) {
					valor_adic = 1.50;
				} else {
					valor_adic = 2.50;
				}
			}
		} else if (refrig == "S") {
			if (tipo == "A") {
				 valor_adic = 8;
			}
			if (tipo == "L") {
				valor_adic = 0;
			}
			if (tipo == "V") {
				valor_adic = 0;
			}
		
		}
		System.out.println("Seu valor adicional é de: " + valor_adic);
		if (pre < 25) {
			imposto = ((5*0.01) * pre);
		} else {
			imposto = ((8*0.01) * pre);
		}
		System.out.println("E seu imposto será de: " + imposto);
		pre_custo = pre + imposto;
		System.out.println("Seu preço agora é de: " + pre_custo);
		if (tipo!= "A" && refrig!= "S") {
			desconto = (3*0.01) * pre_custo;
		}else {
			desconto = 0;
		}
		System.out.println("Seu desconto é de: " + desconto);
		novo_pre = (pre_custo + valor_adic - desconto);
		System.out.println("\n Seu novo preço é: " + novo_pre);
		if (novo_pre <= 50) {
			System.out.println("Classificação do preço: BARATO");
		} else {
			System.out.println("Classificação do preço: CARO");
		}
	}

}