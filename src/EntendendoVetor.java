import java.util.Scanner;

public class EntendendoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = new int[50];
		int tamvetor;
		Scanner leitor = new Scanner(System.in);
		
		vetor[0] = 1977;
		System.out.println("Digite um valor");
		vetor[1] = leitor.nextInt();
		
//		System.out.println("Primeira posição" + vetor[0]);
//		System.out.println("Segunda posição" + vetor[1]);
		tamvetor = vetor.length;
		for(int i=0;i<tamvetor;i++) {
			System.out.println( (i+1) + "° posição " + vetor[i]);			
		}
	}

}
