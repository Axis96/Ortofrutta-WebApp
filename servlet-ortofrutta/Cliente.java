package it.dstech.ortofrutta;


import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente implements Comparable<Cliente>, Serializable{

	private String nome;
	private double spesaEffettuata;
	

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	public Cliente() {
		super();
	}
	
	public double getSpesaeffettuata() {
		return spesaEffettuata;
	}
	

	public void setSpesaEffettuata(double spesaeffettuata) {
		this.spesaEffettuata = spesaeffettuata;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int compareTo(Cliente o) {
		if (this.spesaEffettuata < o.getSpesaeffettuata())
			return -1;
		else if (this.spesaEffettuata > o.getSpesaeffettuata()) {
			return 1;
		} 
		return 0;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", spesaEffettuata=" + spesaEffettuata + "]";
	}
	
}
