package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class ConnectPostgreSQL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String dbURL = "jdbc:postgresql://localhost:5432/postgres";
		String user = "javauser";
		String pwd = "igor";
		Connection connectn = DriverManager.getConnection(dbURL, user, pwd);
		Statement statmnt = connectn.createStatement();
		ResultSet res = statmnt.executeQuery("SELECT * from clients");
		while (res.next()) {
			System.out.println(res.getInt("id") + " " + res.getString("name") 
								+ " " + res.getString("lastname") + " " + res.getString("adresse"));
		}
		
		System.out.println("---------");
		ResultSetMetaData rsm = res.getMetaData();
		System.out.println(rsm.getCatalogName(1) + "." + rsm.getTableName(1) + " :");
		for (int i=1; i<=rsm.getColumnCount(); i++) {
			System.out.print(i + " " + rsm.getColumnName(i) + " " 
						+ rsm.getColumnTypeName(i) + " (" + rsm.getColumnDisplaySize(i) + ")\n");
		}
		
		System.out.println("---------");
		int n = 1;
		System.out.println(n + " :");
		System.out.println("getTableName " + rsm.getTableName(n));
		System.out.println("getCatalogName " + rsm.getCatalogName(n));
		System.out.println("getSchemaName " + rsm.getSchemaName(n));
		System.out.println("getColumnLabel " + rsm.getColumnLabel(n));
		System.out.println("getColumnName " + rsm.getColumnName(n));
		System.out.println("getColumnTypeName " + rsm.getColumnTypeName(n));
		System.out.println("getPrecision " + rsm.getPrecision(n));
		System.out.println("getColumnDisplaySize " + rsm.getColumnDisplaySize(n));
		System.out.println("getColumnCount " + rsm.getColumnCount());
		
		connectn.close();
	}

}
