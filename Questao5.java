import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.print("Digite um valor entre 1 e 7: ");
		int valorDeEntrada = s.nextInt();
		int x = valorDeEntrada, y = 0;
		do {
			if(x % 2 == 0){
				y = x / 2;
			} else {
				y = 3 * x + 1;		
			}
			if(y == 1){System.out.println(y);} else {System.out.print(y+"->");}
			
			x = y;
		} while(y != 1);	
		
	}
	
}