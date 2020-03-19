package jogo;

public class Jogador {
	String nome  ;
	 int numero ; 
	 int pontuacao;

	

public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
public void setNumero( int numero){
		this.numero = numero;
	}
public int getNumero() {
	return numero;
	}
public void setpontuacao( int ponto) {
		pontuacao=ponto+1;

	}
	public int getPontuacao () {
	return pontuacao ;
}

	
	}