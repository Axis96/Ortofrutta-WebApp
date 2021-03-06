package it.dstech.ortofrutta;

public class Prodotto {
	
	private int id;
	private String nome;
	private double prezzo;
	private int quantitÓResidua;
	private String descrizione;
	
	
	public Prodotto(String nome) {
		super();
		this.nome = nome;
	}
	

	
	
	public Prodotto() {
		super();
	}




	public Prodotto(String nome, double prezzo, int quantitÓResidua) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantitÓResidua = quantitÓResidua;
	}


	public Prodotto(String nome, double prezzo, int quantitÓResidua, String descrizione) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantitÓResidua = quantitÓResidua;
		this.descrizione = descrizione;
	}


	public Prodotto(int id, String nome, double prezzo, int quantitÓResidua, String descrizione) {
		super();
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantitÓResidua = quantitÓResidua;
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


	public int getQuantitÓResidua() {
		return quantitÓResidua;
	}


	public void setQuantitÓResidua(int quantitÓResidua) {
		this.quantitÓResidua = quantitÓResidua;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	@Override
	public String toString() {
		return  nome + ", prezzo=" + prezzo + ", QuantitÓ residua=" + quantitÓResidua
				+ ", Descrizione: " + descrizione ;
	}
}
	

