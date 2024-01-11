package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAOImp implements StudentDAO {

	public void insert(Student student, PersonalInfo info) {
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionfactory().openSession();
		transaction = session.beginTransaction();
		try {
			PersonalInfo info1 = new PersonalInfo(info.getSname(), info.getFather_name(), info.getMother_name(),
					info.getOccupation());
			Student student1 = new Student(student.getSname(), student.getClass_$_Section(), info1);
			session.save(student1);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	public void update(Student student, PersonalInfo info, int row) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			transaction = session.beginTransaction();
			Student stud = session.load(Student.class, row);
			stud.setSname(student.getSname());
			stud.setClass_$_Section(student.getClass_$_Section());
			stud.setPersonalInfo(info);
			session.save(stud);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	public void fetch(int row) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			transaction = session.beginTransaction();
			Student student = session.load(Student.class, row);
			System.out.println(student);
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	public void delete(int row) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			transaction = session.beginTransaction();
			Student student = session.load(Student.class, row);
			session.delete(student);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.commit();
			e.printStackTrace();
		}

	}
}
