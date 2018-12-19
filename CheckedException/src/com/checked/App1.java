package com.checked;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("");
		DriverManager.getConnection("", "", "");
	}

}
