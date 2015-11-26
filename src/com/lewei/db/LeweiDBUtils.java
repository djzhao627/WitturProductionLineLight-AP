package com.lewei.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class LeweiDBUtils {

	private static final String URL = "jdbc:mysql://180.76.131.21:3306/web_warning?useunicode=true&characterEncoding=utf8";

	private static final String USER = "root";

	private static final String PASSWORD = "888888";

	private static Connection conn = null;

	public Connection getConn() {
		if (conn == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException | ClassNotFoundException e) {
					System.out.println("leweiDB Stop time : " + new Date());
//					this.getConn();
					System.out.println("conn :" + conn);
				e.printStackTrace();
			} finally {
				return conn;
			}
		}
		return conn;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("-----------");

		Connection connection = new LeweiDBUtils().getConn();
		Statement statement = connection.createStatement();
		
		// 3.ͨ�����ݿ�����Ӳ������ݿ⣨��ɾ�Ĳ飩
		System.out.println(connection + "----");
		// 4.ͨ����ѯ���ؽ��
		// ResultSet rs = statement.executeQuery("select * from user");
		// // 5.ѭ��ȥ�� rs �еĽ��
		// while(rs.next()){
		// System.out.println(rs.getObject(3));
		// }
		//
	}

}
