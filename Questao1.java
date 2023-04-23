import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o valor de uma idade: ");
		int idade = s.nextInt();

		if(idade < 16){
			System.out.println("Nao pode votar!");
		} else if((idade >= 16 && idade <= 17) || idade > 65){
			System.out.println("Votar e facultativo!");	
		} else {
			System.out.println("Votar e obrigatorio!");		
		}
	}
	
}