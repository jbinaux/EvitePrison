package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Licence;
import util.HibernateUtil;


public class LicenceDao {

	public void addLicence(Licence licence) {
        Transaction trns = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            trns = session.beginTransaction();
            session.save(licence);
            session.getTransaction().commit(); 
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
	
}
