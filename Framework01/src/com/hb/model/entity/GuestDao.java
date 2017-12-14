package com.hb.model.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class GuestDao {
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pw = "tiger";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public GuestDao() {
		// TODO Auto-generated constructor stub

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private List executeQuery(String sql, Object[] objs) {		
		List<GuestDto> list = new ArrayList<GuestDto>();
		System.out.println(objs[0]);
		try {

			pstmt = conn.prepareStatement(sql);
		
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				GuestDto bean = new GuestDto();
				
				bean.setSabun(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setNalja(rs.getDate(3));
				list.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		return list;
	}

	private void executeUpdate(String sql, Object[] objs) {
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				pstmt.setObject(i + 1, objs[i]);
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public List<GuestDto> selectAll() {		
		String sql = "SELECT * FROM GUEST01";
		String[] objs={"sabun","name","nalja"};
		
		return executeQuery(sql, objs);
	}

	public void insertOne(int sabun, String name, String nalja) {

		String sql = "insert into guest01 (sabun, name, nalja) "
				+ "values(?,?,to_date(?,'yyyy-MM-dd'))";
		Object[] objs = { sabun, name, nalja };
		executeUpdate(sql, objs);

	}

	public GuestDto selectOne(int sabun) {
		String sql = "select * from guest01 where sabun=?";
		String[] objs={"sabun","name","nalja"};		
		System.out.println(sabun);		
		return (GuestDto) executeQuery(sql, objs).get(0);

	}

	public void updatedOne(int sabun, String name, String nalja) {
		// TODO Auto-generated method stub
		String sql = "update guest01 set name=?, nalja=to_date(?,'yyyy-MM-dd') where sabun=?";
		executeUpdate(sql, new Object[] { name, nalja });

	}
}
