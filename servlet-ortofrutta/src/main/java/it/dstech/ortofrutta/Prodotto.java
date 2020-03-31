package it.dstech.ortofrutta;

public class Prodotto {
	
	private int id;
	private String nome;
	private double prezzo;
	private int quantit‡Residua;
	private String descrizione;
	
	
	public Prodotto(String nome) {
		super();
		this.nome = nome;
	}
	

	
	
	public Prodotto() {
		super();
	}




	public Prodotto(String nome, double prezzo, int quantit‡Residua) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantit‡Residua = quantit‡Residua;
	}


	public Prodotto(String nome, double prezzo, int quantit‡Residua, String descrizione) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantit‡Residua = quantit‡Residua;
		this.descrizione = descrizione;
	}


	public Prodotto(int id, String nome, double prezzo, int quantit‡Residua, String descrizione) {
		super();
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantit‡Residua = quantit‡Residua;
		this.descrizione = descrizione;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public int getQuantit‡Residua() {
		return quantit‡Residua;
	}


	public void setQuantit‡Residua(int quantit‡Residua) {
		this.quantit‡Residua = quantit‡Residua;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	@Override
	public String toString() {
		return  nome + ", prezzo=" + prezzo + ", Quantit‡ residua=" + quantit‡Residua
				+ ", Descrizione: " + descrizione ;
	}
}
	

