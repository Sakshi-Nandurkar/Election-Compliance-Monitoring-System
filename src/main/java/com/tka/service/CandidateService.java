package com.tka.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tka.Entity.Candidate;
import com.tka.dao.CandidateDao;
import com.tka.utility.CandidateUtility;

public class CandidateService {

	CandidateDao dao;
	Scanner sc = new Scanner(System.in);

	public List<Candidate> getAllCandidate() {
		dao= new CandidateDao();
		List<Candidate> allcandidate = dao.getAllCandidate();
		return allcandidate;
	}

	public List<Candidate> updateCandidate() {
		dao = new CandidateDao();
		List<Candidate> updateCandidate = dao.updateCandidate();
		return updateCandidate;
	}

	public List<Candidate> deleteCandidate(){
		dao = new CandidateDao();
		List<Candidate> deleteCandidate = dao.deleteCandidate();
		return deleteCandidate;
	}
	
	
	public void insertCandidateData() {
		dao = new CandidateDao();
		dao.insertCandidateDataUsingScanner();
	}

	public List<Candidate> candidateParty(){
		dao = new CandidateDao();
		Session ss = CandidateUtility.getSession().openSession();
		Criteria cr = ss.createCriteria(Candidate.class);

		System.out.println("Enter party name which you want to see (Shiv Sena, Congress, BJP, NCP) :");
		String pname = sc.nextLine();
		
		cr.add(Restrictions.eq("partyname", pname));
		
		List<Candidate> list = cr.list();
		for (Candidate obj : list) {
			System.out.println(obj);
		}
		
		return list;
	}
	

	public List<Candidate> onlyFemaleCandidate(){
		dao = new CandidateDao();
		Session ss = CandidateUtility.getSession().openSession();
		Criteria cr = ss.createCriteria(Candidate.class);

		cr.add(Restrictions.eq("gender", "Female"));
		
		List<Candidate> list = cr.list();
		for (Candidate obj : list) {
			System.out.println(obj);
		}
		
		return list;
	}
	
	
	
	public List<Candidate> onlyMaleCandidate(){
		dao = new CandidateDao();
		Session ss = CandidateUtility.getSession().openSession();
		Criteria cr = ss.createCriteria(Candidate.class);

		cr.add(Restrictions.eq("gender", "Male"));
		
		List<Candidate> list = cr.list();
		for (Candidate obj : list) {
			System.out.println(obj);
		}
		return list;
	}

	public List<Candidate> MaleCandidateWithAgeabove(){
		dao = new CandidateDao();
		Session ss = CandidateUtility.getSession().openSession();
		Criteria cr = ss.createCriteria(Candidate.class);

		System.out.println("Enter age");
		int age = sc.nextInt();
		
		cr.add(Restrictions.eq("gender", "Male"));
		cr.add(Restrictions.gt("age", age));
		
		List<Candidate> list = cr.list();
		for (Candidate obj : list) {
			System.out.println(obj);
		}
		
		return list;
	}
	
	
	public List<Candidate> femaleCandidateWithAgeabove(){
		dao = new CandidateDao();
		Session ss = CandidateUtility.getSession().openSession();
		Criteria cr = ss.createCriteria(Candidate.class);

		System.out.println("Enter age");
		int age = sc.nextInt();
		
		cr.add(Restrictions.eq("gender", "Female"));
		cr.add(Restrictions.gt("age", age));
		
		List<Candidate> list = cr.list();
		for (Candidate obj : list) {
			System.out.println(obj);
		}
		return list;
	}
	
	public List<Candidate> allCandidateWithAgeabove(){
		dao = new CandidateDao();
		Session ss = CandidateUtility.getSession().openSession();
		Criteria cr = ss.createCriteria(Candidate.class);

		System.out.println("Enter age");
		int age = sc.nextInt();
		
		cr.add(Restrictions.gt("age", age));
		
		List<Candidate> list = cr.list();
		for (Candidate obj : list) {
			System.out.println(obj);
		}
		return list;
	}
}
