package com.practice.durgeshjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {
	public Student mapRow(ResultSet rs,int rowNum)throws SQLException{
//		Student s=new Student();
//		s.setId(rs.getInt("id"));
//		s.setName(rs.getString("name"));
//		s.setCity(rs.getString("city"));
//		return s;
		return new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
		
	}

}
