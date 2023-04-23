import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args){
		String[] dias = {"Domingo", "Segunda-Feira", "Terca-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado"};
	int index = 0;
		
	while(index < dias.length){
		System.out.println(dias[index]);
		index += 1;	
	}

	index = 0;

	do {
		System.out.println(dias[index]);
		index += 1;	
	} while(index < dias.length);

	for(int i = 0; i < dias.length; i++){
		System.out.println(dias[i]);	
	}
	
	}
}