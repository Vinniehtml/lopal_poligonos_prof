package br.com.engsenai.projeto_teste.ui;

import java.util.Scanner;

public class Menu {

	public void criarMenu() {
		System.out.println("------------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Triângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Retângulo");
		System.out.println("5 - Circunferência");
		System.out.println("16- Sair");
		System.out.println("------------------------");
		System.out.println("Escolha uma opção (1-6): ");
		
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		System.out.println("A opção selecionada foi " + opcao);
	
	}
}
