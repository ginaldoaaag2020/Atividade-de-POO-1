import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args){
		double[] notas = new double[]{5.6, 7.8, 9.8, 2.4, 5.6, 7.9, 8.0, 9.0, 10.0, 5.6};
		double media = 0.0;
		int acimaDaMedia = 0;
		int abaixoDaMedia = 0;
	
		for(int i = 0; i < notas.length; i++){
			media += notas[i];		
		}

		for(int i = 0; i < notas.length; i++){
			if(notas[i] > (media/10)){
				acimaDaMedia += 1;
			} else {
				abaixoDaMedia += 1;			
			}	
		}

		System.out.println("Acima da media: "+acimaDaMedia);
		System.out.println("Abaixo da media: "+abaixoDaMedia);
	}
	
}