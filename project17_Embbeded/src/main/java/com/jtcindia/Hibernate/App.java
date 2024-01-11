package com.jtcindia.Hibernate;
public class App {
	public static void main(String[] args) {
		StudentDAO studentdao = new StudentDAOImp();
		PersonalInfo info = new PersonalInfo("vivek","Mr.Umesh Singh","Mrs. Savita Singh","Farmer");
		Student stud = new Student("Vivek Rajput","12th B",info );
		studentdao.insert(stud, info);
	}
}
