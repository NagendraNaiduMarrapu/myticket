package com.ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TicketJdbc {
	Connection c = null;
	PreparedStatement st = null;
	ArrayList<Stations> al = new ArrayList<Stations>();
	ArrayList<Trains> al1 = new ArrayList<Trains>();

	public ArrayList<Stations> getToFrom() {
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://192.168.110.48:5432/plf_training", "plf_training_admin",
					"pff123");
			st = c.prepareStatement("select trn_start from mystations");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Stations s = new Stations(rs.getString(1));
				al.add(s);
			}

		} catch (Exception e) {
			System.out.println("error");
		}
		return al;
	}

	public ArrayList<Trains> getTrains(String from, String to) {
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://192.168.110.48:5432/plf_training", "plf_training_admin",
					"pff123");
			st = c.prepareStatement("select trn_name from mystations where trn_start=? and trn_end=?");
			st.setString(1, from);
			st.setString(2, to);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Trains t = new Trains(rs.getString(1));
				al1.add(t);
			}

		} catch (Exception e) {
			System.out.println("error");
		}
		return al1;
	}
}
