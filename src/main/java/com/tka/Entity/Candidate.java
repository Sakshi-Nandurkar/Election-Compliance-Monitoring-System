package com.tka.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate {

	@Id
	private int cid;
	
	private String cname;
	
	private String partyname;
	
	private String assembly;
	
	private String statename;
	
	private String gender;
	
	private int age;

	public Candidate() {
		super();
	}

	public Candidate(int cid, String cname, String partyname, String assembly, String statename, String gender,
			int age) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.partyname = partyname;
		this.assembly = assembly;
		this.statename = statename;
		this.gender = gender;
		this.age = age;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", cname=" + cname + ", partyname=" + partyname + ", assembly=" + assembly
				+ ", statename=" + statename + ", gender=" + gender + ", age=" + age + "]";
	}		
}
