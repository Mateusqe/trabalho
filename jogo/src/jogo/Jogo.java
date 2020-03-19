package jogo;
import java.util.Random;
import java.util.Scanner;
public class Jogo {
//prototipo
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner receber = new Scanner(System.in); 
		System.out.println("informe o quantidade de jogares :");
		int qt = receber.nextInt();	  // recebe a quantidade de jogadores
	
		Jogador joga [] = new Jogador[qt]; // instacia o jogador com vetor
		Dado lance = new Dado ();   // iinstacia o dado
		Random  random =  new Random ();  // instacia o random aletorio
		
		
		
		
			
			for(int i=0 ;i < joga.length; i ++) {     // for para o jogador colocar o nome
				joga[i] = new Jogador();  
				System.out.println("informe o nome do jogador numero "+ i );
				String nome = receber.next();    
				joga[i].setNome(nome);
		
			}
			for (int j= 1 ; j<=2; j++) {   // for para as 7  partidas do jogo
				
			for(int i=0 ;i <joga.length; i ++) {    // for para cada jogador lançar  o dado
				System.out.println(" Jogador numero " +i+" escolha um numero de 1 a 10  para lançar o primeiro dado :");  // lança o primeiro dado e rece na variavel
				int dado1 = receber.nextInt();    
				int numeroAleatorio1 =random.nextInt(dado1);  // gerando  o numero aleatorio e armazenando até o numero digitado
				
				System.out.println(" Jogador numero " +i+" escolha um numero de 1 a 10  para lançar o segundo  dado :");   // lança o segundo dado
				int dado2 = receber.nextInt(); 
				int numeroAleatorio2 =random.nextInt(dado2);  // gerando  o numero aleatorio e armazenando
	
				lance.setDado(numeroAleatorio1, numeroAleatorio2);   // seta eles na no metodo 
			
				 
				if(lance.getDado()==7) {    // condiçao de acerto
					int acerto = 1;
					joga[i].setNumero(acerto);     // adiciona na função de acerto do jogador
					i=-1;      // o jogador que pontua joga novamente praisso  o i volta para o mesmo valor de antes
					System.out.println("voçe acertou o numero jogue novamente !");
					
				}
				}
			}
		
		
		  		@SuppressWarnings("unused")
				int aux,aux2,  vetor[] = new int [qt];
		  		for(int i =0 ; i <qt; i++) {
		  				
		  			System.out.println("===================RANKING=========================");
		  		System.out.println("nome : " +joga[i].getNome()+"==Colocação : "+(i+1)+"====pontuação  "+joga[i].getPontuacao()+"============");
		  		
		  	}
		  	
	}
}
	
	


