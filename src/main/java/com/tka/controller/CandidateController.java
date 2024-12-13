package com.tka.controller;

import java.util.List;

import com.tka.Entity.Candidate;
import com.tka.dao.CandidateDao;
import com.tka.service.CandidateService;

public class CandidateController {
	CandidateService service;
	
	public List<Candidate> getAllCandidate() {
		service = new CandidateService();
		List<Candidate> allcandidate = service.getAllCandidate();
		return allcandidate;
	}
	

	public List<Candidate> updateCandidate() {
		service = new CandidateService();
		List<Candidate> updateCandidate = service.updateCandidate();
		return updateCandidate;
	}
	
	
	public List<Candidate> deleteCandidate(){
		service = new CandidateService();
		List<Candidate> deleteCandidate = service.deleteCandidate();
		return deleteCandidate;
	}
	
	
	public void insertCandidateData() {
		service = new CandidateService();
		service.insertCandidateData();
	}

	public List<Candidate> candidateParty() {
		service = new CandidateService();
		List<Candidate> candidateParty = service.candidateParty();
		return candidateParty;
	}
	
	
	public List<Candidate> femaleCandidate() {
		service = new CandidateService();
		return service.onlyFemaleCandidate();
	}
	
	
	public List<Candidate> maleCandidate() {
		service = new CandidateService();
		return service.onlyMaleCandidate();
	}
	
	
	public List<Candidate> MaleCandidateWithAgeabove() {
		service = new CandidateService();
		return service.MaleCandidateWithAgeabove();
	}
	
	public List<Candidate> femaleCandidateWithAgeabove() {
		service = new CandidateService();
		return service.femaleCandidateWithAgeabove();
	}

	public List<Candidate> allCandidateWithAgeabove() {
		service = new CandidateService();
		return service.allCandidateWithAgeabove();
	}
	
}
