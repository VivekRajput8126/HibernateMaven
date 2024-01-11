package Hello.Project4_CollectionMapping;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;

public class App {

	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Map<String, Integer> ref = new HashMap<String, Integer>();
			ref.put("Vivek", 87927394);
			ref.put("Shakib",76876);
			Interview interview = new Interview("Rahul", "Genpact", "6LPA",ref);
			session.save(interview);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
