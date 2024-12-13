package com.tka.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.Entity.Candidate;

public class CandidateUtility {

	public static SessionFactory getSession() {
		Configuration cif = new Configuration();
		cif.configure();
		cif.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cif.buildSessionFactory();
		return factory;
	}

}
