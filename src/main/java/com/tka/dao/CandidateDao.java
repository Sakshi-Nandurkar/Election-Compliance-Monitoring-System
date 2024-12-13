package com.tka.dao;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.tka.Entity.Candidate;
import com.tka.utility.CandidateUtility;

public class CandidateDao {

	Scanner sc = new Scanner(System.in);
	
	public List<Candidate> getAllCandidate() {
		Session ss = CandidateUtility.getSession().openSession();
		Criteria criteria = ss.createCriteria(Candidate.class);

		List listofcandidates = criteria.list();
		return listofcandidates;
	}


	public List<Candidate> updateCandidate() {
		Session ss = CandidateUtility.getSession().openSession();
		Transaction tx = ss.beginTransaction();
		
		System.out.print("Enter Candidate id: ");
		int cid = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Candidate Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Party Name: ");
		String partyname = sc.nextLine();
		
		System.out.print("Enter Assembly Name: ");
		String assembly = sc.nextLine();

		System.out.print("Enter State Name: ");
		String statename = sc.nextLine();
		
		System.out.print("Enter Gender: ");
		String gender = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		Candidate obj = new Candidate(cid, name, partyname, assembly, statename, gender, age);
		ss.saveOrUpdate(obj);
		tx.commit();
		ss.close();
		return null;
	}


	public List<Candidate> deleteCandidate() {
		Session ss = CandidateUtility.getSession().openSession();
		Transaction tx = ss.beginTransaction();

		System.out.print("Enter Candidate id: ");
		int cid = sc.nextInt();
		sc.nextLine();
		
		Candidate candidate = ss.get(Candidate.class,cid);
		
		ss.delete(candidate);
		tx.commit();
		ss.close();
		return null;
	}



	public void insertCandidateDataUsingScanner() {
		Session ss = CandidateUtility.getSession().openSession();
		Transaction tr = ss.beginTransaction();

		Candidate candidate = new Candidate();
		System.out.print("Enter Candidate id: ");
		candidate.setCid(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Enter Candidate Name: ");
		candidate.setCname(sc.nextLine());

		System.out.print("Enter Party Name: ");
		candidate.setPartyname(sc.nextLine());

		System.out.print("Enter Assembly Name: ");
		candidate.setAssembly(sc.nextLine());

		System.out.print("Enter State Name: ");
		candidate.setStatename(sc.nextLine());

		System.out.print("Enter Gender: ");
		candidate.setGender(sc.nextLine());

		System.out.print("Enter Age: ");
		candidate.setAge(sc.nextInt());

		ss.save(candidate);
		tr.commit();
		ss.close();
	}


}
