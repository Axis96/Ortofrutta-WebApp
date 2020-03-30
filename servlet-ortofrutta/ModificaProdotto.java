package it.dstech.ortofrutta;
	
import java.io.IOException;	
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.protobuf.ByteString.Output;
import com.mysql.cj.protocol.OutputStreamWatcher;
import it.dstech.ortofrutta.*;


public class ModificaProdotto extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome=req.getParameter("nome");
		double prezzo= Double.parseDouble(req.getParameter("prezzo"));
		int quantità=Integer.parseInt(req.getParameter("quantita"));
		String descrizione=req.getParameter("descrizione");
		Prodotto nuovoProdotto = new Prodotto(nome, prezzo, quantità, descrizione);
		
		try {
			GestioneDB modify = new GestioneDB();
			modify.modificaProdotto(nuovoProdotto);
			modify.close();
		} catch (ClassNotFoundException | SQLException | InterruptedException e) {
			e.printStackTrace();
		}	
		
		req.getRequestDispatcher("ModificaProdotto.jsp").forward(req, resp);
	}			
}