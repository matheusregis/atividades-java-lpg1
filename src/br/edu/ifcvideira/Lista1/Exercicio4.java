package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double circunferencia;
		double raio;
		double area;
		
		System.out.println("Qual o tamanho da Circunferência:");
		circunferencia = Double.parseDouble(in.nextLine());
		
		raio = circunferencia / (2 * Math.PI);
		
		System.out.println("O Raio do Círculo é: "+raio);
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A Área do Círculo é: "+area);
		
		in.close();
		
	}

}