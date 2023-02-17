package com.practice.durgeshjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentResutSetExtractor  implements ResultSetExtractor<List<Student>> {
    public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Student> studentList = new ArrayList<Student>();
        while (rs.next()){
            Student s= new Student(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3));
            studentList.add(s);
        }
        return studentList;
    }
}