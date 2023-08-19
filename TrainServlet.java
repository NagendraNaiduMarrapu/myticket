package com.ticket;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/TrainServlet")
public class TrainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TicketJdbc train = new TicketJdbc();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		PrintWriter out = response.getWriter();
		ArrayList<Trains> stat = new ArrayList<Trains>();
		stat = train.getTrains(from, to);
		Gson gson = new GsonBuilder().create();
		String TrainJson = gson.toJson(stat);
		out.println(TrainJson);
	}

}
