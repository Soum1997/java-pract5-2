package com.practice.durgeshjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class JdbcDao {
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Student s) {
//		String query="insert into student values("+s.getId()+","+s.getName()+","+s.getCity()+");";
		String query="insert into student(id,name,city) values(?,?,?)";
		return template.update(query,s.getId(),s.getName(),s.getCity());
			
	}

	public List<Student> getAllStudents(){
		return template.query("select*from student",new StudentResutSetExtractor());
	}


}
