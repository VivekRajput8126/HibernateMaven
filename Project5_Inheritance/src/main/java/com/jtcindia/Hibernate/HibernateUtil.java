package com.jtcindia.Hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	static SessionFactory sessionfactory;
	static {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/inhertancemapping_tablepersubclass");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "umeshsingh@8126");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		properties.put(Environment.SHOW_SQL, "true");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Customer.class);
		configuration.addAnnotatedClass(Hero.class);
		configuration.addAnnotatedClass(Honda.class);
		configuration.addAnnotatedClass(TVS.class);
		configuration.addAnnotatedClass(HeroSplender.class);
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ServiceRegistry sr = (ServiceRegistry) ssrb.applySettings(configuration.getProperties()).build();
		sessionfactory = configuration.buildSessionFactory(sr);
	}

	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}
}
