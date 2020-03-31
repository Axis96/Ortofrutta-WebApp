package it.dstech.ortofrutta;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Cliente implements Comparable<Cliente>, Serializable{

	private String username;
	private int età;
	List<Scontrino> listaScontrini = new ArrayList<Scontrino>();
	
	
	@Override
	public int compareTo(Cliente arg0) {
		return 0;
	}
	

	
}
