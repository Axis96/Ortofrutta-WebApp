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

public class RimuoviProdotto extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			GestioneDB gestione = new GestioneDB();;
			req.setAttribute("lista", gestione.getListaProdotti());
			int idProdotto = Integer.parseInt(req.getParameter("idProdotto"));
			gestione.rimuoviProdotto(idProdotto);
			gestione.close();
		} catch (ClassNotFoundException | SQLException | InterruptedException e) {
			e.printStackTrace();
		}	
		req.getRequestDispatcher("RimuoviProdotto.jsp").forward(req, resp);
	}	

}
