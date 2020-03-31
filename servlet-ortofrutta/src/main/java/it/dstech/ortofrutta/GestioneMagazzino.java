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


public class GestioneMagazzino extends HttpServlet {
		
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			int scelta=0;
			if(req.getParameter("scelta") != null) {
				scelta =Integer.parseInt(req.getParameter("scelta"));
			}
			
			try {
				GestioneDB gestione = new GestioneDB();
				req.setAttribute("lista", gestione.getListaProdotti());
				gestione.close();
			} catch (ClassNotFoundException | SQLException | InterruptedException e) {
				e.printStackTrace();
			}
		
			while(true) {
				switch (scelta) {
				case 1:
					req.getRequestDispatcher("AggiungiProdotto.jsp").forward(req, resp);
					break;
				case 2:
					req.getRequestDispatcher("RimuoviProdotto.jsp").forward(req, resp);
					break;
				case 3:
					req.getRequestDispatcher("ModificaProdotto.jsp").forward(req, resp);
					break;
				case 4:
					req.getRequestDispatcher("Stampa.jsp").forward(req, resp);
					break;
				default:
				break;
				}
			}	
	}
}
	
	