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

@WebServlet("/Stationservlet")
public class Stationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TicketJdbc ss = new TicketJdbc();

	public Stationservlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ArrayList<Stations> stat = new ArrayList<Stations>();
		stat = ss.getToFrom();
		Gson gson = new GsonBuilder().create();
		String StationJson = gson.toJson(stat);
		out.println(StationJson);
	}

}
