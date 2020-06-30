package com.wcs.java.tx.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		
		// 3 konten angelegt
		
		
		//										user:password@server:port/database
		Connection con = DriverManager
				.getConnection("jdbc:mysql://my_stuff:my_stuff@localhost:3306/my_stuff?serverTimezone=CET");
		
		SetupUtil.setup();
		
		try {
//		con.setAutoCommit(false);
//		con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
//		
//		Statement st = con.createStatement();
//		st.execute("UPDATE BANKACCOUNTS SET AMOUNT=1000 WHERE USER='david'");
//		st.execute("UPDATE BANKACCOUNTS SET AMOUNT=2000 WHERE USER='andre'");
//		con.commit();
		} catch(Exception ex) {
			con.rollback();
		}finally {
			con.close();
		}

	}

}
