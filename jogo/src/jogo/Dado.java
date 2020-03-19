package jogo;

public class Dado {
	int lado1;
	int lado2;

public void setDado( int dado1, int dado2) {
		lado1=dado1;
		lado2=dado2;
	}

	public int getDado() {
	return lado1 + lado2 ;
}

}