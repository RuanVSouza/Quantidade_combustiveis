package sistema_combustivel;

import java.util.Scanner;

public class Combustiveis_calculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		//numero 4 será usado para parar a função while, dando fim ao processo e imprimindo a quantidade de pessoas que abastaceram nos determinados tipos de combustiveis
		while(tipo != 4) {
			if(tipo == 1) {
					alcool += 1;
			
			}else if(tipo == 2) {
					gasolina += 1;
			
			}else if(tipo == 3) {
					diesel += 1;
			
			}
			
			tipo = sc.nextInt();
		
		}
		System.out.println("OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
