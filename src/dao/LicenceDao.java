package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Licence;
import util.HibernateUtil;


public class LicenceDao {

	public void addLicence(Licence licence) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
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
