package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nm1;
		double tm1;
		String nm2;
		double tm2;
		String nm3;
		double tm3;
		String nm4;
		double tm4;
		String nm5;
		double tm5;
		double tempMedia;
		int munTempInf=0;
		
		System.out.println("Digite o nome do Munic�pios 1");
		nm1 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura m�dia de "+nm1);
		tm1 = Double.parseDouble(in.nextLine());
		System.out.println("Digite o nome do Munic�pios 2");
		nm2 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura m�dia de "+nm1);
		tm2 = Double.parseDouble(in.nextLine());
		System.out.println("Digite o nome do Munic�pios 3");
		nm3 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura m�dia de "+nm1);
		tm3 = Double.parseDouble(in.nextLine());
		System.out.println("Digite o nome do Munic�pios 4");
		nm4 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura m�dia de "+nm1);
		tm4 = Double.parseDouble(in.nextLine());
		System.out.println("Digite o nome do Munic�pios 5");
		nm5 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura m�dia de "+nm1);
		tm5 = Double.parseDouble(in.nextLine());
		
		tempMedia = (tm1+tm2+tm3+tm4+tm5)/5;
		System.out.println("A temperatura m�dia entre os Munic�pios �: "+tempMedia);
		if (tm1<10) {
			munTempInf++;
		}
		if (tm2<10) {
			munTempInf++;
		}
		if (tm3<10) {
			munTempInf++;
		}
		if (tm4<10) {
			munTempInf++;
		}
		if (tm5<10) {
			munTempInf++;
		}
		System.out.println("O n�mero de munic�pios com temperatura inferior � 10� C �: "+munTempInf);
		
		System.out.println("O(s) munic�pio(s) com temperatura superior � 30� C: ");
		
		if (tm1>30) {
			System.out.println(nm1);
		}
		if (tm2>30) {
			System.out.println(nm2);
		}
		if (tm3>30) {
			System.out.println(nm3);
		}
		if (tm4>30) {
			System.out.println(nm4);
		}
		if (tm5>30) {
			System.out.println(nm5);
		}
		
		in.close();
	}
}
