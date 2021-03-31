package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ers_reimbursement_status")
public class Reimbursement_Status implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "reimb_status_id", nullable = false)
	private int reimb_status_id;
	
	@Column(name = "reimb_status", nullable = false)
	private String reimb_status;
	
	
	public Reimbursement_Status() {
		super();
	}


	public Reimbursement_Status(String reimb_status) {
		super();
		this.reimb_status = reimb_status;
	}


	public Reimbursement_Status(int reimb_status_id, String reimb_status) {
		super();
		this.reimb_status_id = reimb_status_id;
		this.reimb_status = reimb_status;
	}


	public int getReimb_status_id() {
		return reimb_status_id;
	}


	public void setReimb_status_id(int reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}


	public String getReimb_status() {
		return reimb_status;
	}


	public void setReimb_status(String reimb_status) {
		this.reimb_status = reimb_status;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reimb_status == null) ? 0 : reimb_status.hashCode());
		result = prime * result + reimb_status_id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement_Status other = (Reimbursement_Status) obj;
		if (reimb_status == null) {
			if (other.reimb_status != null)
				return false;
		} else if (!reimb_status.equals(other.reimb_status))
			return false;
		if (reimb_status_id != other.reimb_status_id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Reimbursement_Status [reimb_status_id=" + reimb_status_id + ", reimb_status=" + reimb_status + "]";
	}
	
	
	
	

}
