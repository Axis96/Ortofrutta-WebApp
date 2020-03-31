package it.dstech.ortofrutta;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GestioneDB {
	
	private Connection connessione;


	public GestioneDB() throws  SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String password ="Pirandello1@";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/ortofrutta?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC&createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false";
		this.connessione = DriverManager.getConnection(url, username, password);
	}
	
	
	public void close() throws SQLException {
		this.connessione.close();
	}
	
	
	public  List<Prodotto> getListaProdotti() throws SQLException, ClassNotFoundException, InterruptedException {
		PreparedStatement getId = connessione.prepareStatement("select * from prodotti ;");
		ResultSet execute = getId.executeQuery();
		List< Prodotto> lista = new ArrayList<Prodotto>(); 
		while(execute.next()) {
			Prodotto prodotto = new Prodotto(execute.getInt(1), execute.getString(2),execute.getDouble(3),execute.getInt(4),execute.getString(5));
			lista.add(prodotto);
		}
		return lista;
	}
	
	
	public void rimuoviProdotto(int id) throws SQLException{
		String queryRimozioneeProdotto= "DELETE from prodotti where idProdotto= ? ";
		PreparedStatement prepareStatement = this.connessione.prepareStatement(queryRimozioneeProdotto);
		prepareStatement.setInt(1, id);
		prepareStatement.execute();
	}
	
	
	public void modificaProdotto(Prodotto p ) throws SQLException, ClassNotFoundException, InterruptedException  {
		String queryCreazioneProdotto= "UPDATE prodotti set  nome=?, prezzo=?, quantitaResidua=?, descrizione=? where id=? ;";
		PreparedStatement prepareStatement = connessione.prepareStatement(queryCreazioneProdotto);
		prepareStatement.setString(1, p.getNome());
		prepareStatement.setDouble(2, p.getPrezzo());
		prepareStatement.setInt(3, p.getQuantit‡Residua());
		prepareStatement.setString(4, p.getDescrizione());
		prepareStatement.setInt(5, p.getId());
		prepareStatement.execute();
	}
	
	

	
	public boolean aggiungiProdotto(Prodotto p ) throws SQLException, ClassNotFoundException, InterruptedException  {
		for (Prodotto prodotto : getListaProdotti()) {
			if(prodotto.getNome().equalsIgnoreCase(p.getNome()) && prodotto.getDescrizione().equalsIgnoreCase(p.getDescrizione())) {
				String queryUpdateProdotto= "UPDATE prodotti set quantitaResidua=? where nome=? and descrizione=? ;";
				PreparedStatement prepareStatement = connessione.prepareStatement(queryUpdateProdotto);
				prepareStatement.setInt(1, p.getQuantit‡Residua()+prodotto.getQuantit‡Residua());
				prepareStatement.setString(2, p.getNome());
				prepareStatement.setString(3, p.getDescrizione());
				prepareStatement.execute();
				return true;
				}
			}
			String queryCreazioneProdotto= "INSERT INTO prodotti ( nome, prezzo, quantitaResidua, descrizione ) VALUES ( ?, ?, ?, ?);";
			PreparedStatement prepareStatement = connessione.prepareStatement(queryCreazioneProdotto);
			prepareStatement.setString(1, p.getNome());
			prepareStatement.setDouble(2, p.getPrezzo());
			prepareStatement.setInt(3, p.getQuantit‡Residua());
			prepareStatement.setString(4, p.getDescrizione());
			prepareStatement.execute();
			return true;
	}
}

