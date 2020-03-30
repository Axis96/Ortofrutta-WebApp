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


public class GestioneOrtofrutta extends HttpServlet {
		
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int scelta=0;
		if(req.getParameter("scelta") != null) {
			scelta =Integer.parseInt(req.getParameter("scelta"));
		}
		
		switch (scelta) {
		case 1:
			req.getRequestDispatcher("Magazzino.jsp").forward(req, resp);
			break;
		case 2:
			req.getRequestDispatcher("Cassa.jsp").forward(req, resp);
			break;
		case 3:
			req.getRequestDispatcher("RegistroClienti.jsp").forward(req, resp);
			break;
		default:
			break;
		}
	}
		


}
	
	
	

	
	
	
