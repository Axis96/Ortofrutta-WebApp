package it.dstech.ortofrutta;

import java.io.IOException;	
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.protobuf.ByteString.Output;
import com.mysql.cj.protocol.OutputStreamWatcher;
import it.dstech.ortofrutta.*;
import java.util.Arrays;


public class AcquistaDalCarrello extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int s=0;
	
		 HashMap<String, String> mappaQuantità = new HashMap<String, String>(); 
		 
		 for (String i :  req.getParameterMap().keySet()) {
			System.out.println(i);
			mappaQuantità.put(i, java.util.Arrays.toString(req.getParameterMap().get(i)).replace("[", "").replace("]", ""));
			System.out.println(java.util.Arrays.toString(req.getParameterMap().get(i)).replace("[", "").replace("]", ""));
		} 

	
		try {
			GestioneDB gestione = new GestioneDB();
			gestione.acquistaProdotti(mappaQuantità);
			gestione.close();
		} catch (ClassNotFoundException | SQLException | InterruptedException e) {
			e.printStackTrace();
		}	
		req.getRequestDispatcher("Homepage.jsp").forward(req, resp);
	}		
	

}