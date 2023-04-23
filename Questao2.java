import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args){
		String[] semana = new String[] {"Domingo", "Segunda-Feira", "Terca-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado"};
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um valor entre 1 e 7: ");
		int numeroDaSemana = s.nextInt();
		
		if(numeroDaSemana > 7 && numeroDaSemana < 1){
			System.out.println("Numero da semana inexistente!");
		} else {
			System.out.println(semana[numeroDaSemana-1]);
		}
		
	}
	
}