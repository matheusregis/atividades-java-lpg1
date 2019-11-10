/*
 * 6 - Uma cooperativa de leite paga, a cada um de seus produtores cooperados, por
volume de leite entregue diariamente. Devido � grande quantidade de fraudes
como a adi��o de �gua no leite, por exemplo) e erros na leitura do volume dos
tarros de leite, a cooperativa come�ar� a pag�-los por massa. Para isso comprou
uma balan�a e um dens�metro e necessitar� de um programa para c�lculo. Na
balan�a ser�o jogados e misturados os conte�dos de todos os tarros de leite de
um determinado produtor. A balan�a informar� a massa e o dens�metro a
densidade. O programa receber�, via teclado, esses dois dados mais o pre�o por
kg de leite vigente naquele dia. Ap�s isto, o programa dever� apresentar na tela:
- Os valores digitados;
- O volume de leite calculado (volume = massa / densidade);
- O valor em Reais a ser pago a aquele cooperado; 
- Classificar o leite do cooperado dentro de uma das 3 faixas de densidade
existentes:
- Categoria I (abaixo de 1,14 kg/l);
- Categoria II (entre 1,14 e 1,20 kg/l);
- Categoria III (acima de 1,20 kg/l);

 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double massa;
		double densidade;
		double preco;
		double volume;
		System.out.println("Digite a massa do Leite");
		massa = Double.parseDouble(in.nextLine());
		System.out.println("Digite a densidade do Leite");
		densidade = Double.parseDouble(in.nextLine());
		System.out.println("Digite o valor di�rio do Leite");
		preco = Double.parseDouble(in.nextLine());
		volume = massa/densidade;
		System.out.println("Massa do Leite: "+massa);
		System.out.println("Densidade do Leite: "+densidade);
		System.out.println("Valor Di�rio do Leite:"+preco);
		System.out.println("Volume do Leite: "+volume);
		System.out.println("Valor Total pago ao cooperado: "+(preco*massa));
		if (densidade < 1.14) {
			System.out.println("Densidade: Categoria I");
		}else if ((densidade >= 1.14)&&(densidade <1.20)) {
			System.out.println("Densidade: Categoria II");
		}else {
			System.out.println("Densidade: Categoria III");
		}
		
		
		in.close();
	}
}
