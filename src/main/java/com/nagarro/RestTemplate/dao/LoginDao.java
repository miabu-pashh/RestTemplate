package com.nagarro.RestTemplate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.nagarro.RestTemplate.model.LoginForm;

/**
 * 
 * Data Access Layer/ Persistence Layer 
 * 
 * @param user
 * @return
 */
@Repository
public class LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	//Implementation of validate method
	public boolean validateUser(LoginForm user) {

		Transaction transaction = null;
		LoginForm loginForm = null;
		boolean flag = false;

		Session session = sessionFactory.openSession();

		String username = user.getUsername();
		String password = user.getPassword();

		String query = "select * from users where username= :username and password= :password";
		try {

			// start a transaction
			transaction = session.beginTransaction();

			// Get loginForm object
			@SuppressWarnings("rawtypes")
			NativeQuery nativeQuery = session.createSQLQuery(query);
			nativeQuery.addEntity(LoginForm.class);
			nativeQuery.setParameter("username", username);
			nativeQuery.setParameter("password", password);

			loginForm = (LoginForm) nativeQuery.uniqueResult();

			if (loginForm != null) {
				flag = true;
			}

			// commit transaction
			if (transaction.isActive()) {
				transaction.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (transaction.isActive()) {
				session.getTransaction().commit();
			}
			session.close();
		}

		return flag;
	}

}
