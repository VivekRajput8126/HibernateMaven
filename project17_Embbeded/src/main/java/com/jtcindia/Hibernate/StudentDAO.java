package com.jtcindia.Hibernate;

public interface StudentDAO {
	void insert(Student student,PersonalInfo personalinfo);
	void update(Student student,PersonalInfo personalinfo,int row);
	void fetch(int row);
	void delete(int row);
	
}
