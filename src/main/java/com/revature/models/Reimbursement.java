package com.revature.models;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "ers_reimbursement")
public class Reimbursement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "reimb_id", nullable = false)
	private int reimb_id;
	
	@Column(name = "reimb_amount", nullable = false)
	private double reimb_amount;
	
	@Column(name = "reimb_submitted", nullable = false)
	@CreationTimestamp
	private Timestamp reimb_submitted;
	
	@Column(name = "reimb_resolved")
	@CreationTimestamp
	private Timestamp reimb_resolved;
	
	@Column(name = "reimb_description")
	private String reimb_description;
	
	// Foreign Keys
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "reimb_author", nullable = false)
	private Users reimb_author;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "reimb_resolver")
	private Users reimb_resolver;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "reimb_status_id", nullable = false)
	private Reimbursement_Status reimb_status_id;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "reimb_type_id", nullable = false)
	private Reimbursement_Type reimb_type_id;
	
	
	public Reimbursement() {
		super();
	}


	public Reimbursement(double reimb_amount, Timestamp reimb_submitted, Timestamp reimb_resolved,
			String reimb_description, Users reimb_author, Users reimb_resolver, Reimbursement_Status reimb_status_id,
			Reimbursement_Type reimb_type_id) {
		super();
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
	}


	public Reimbursement(int reimb_id, double reimb_amount, Timestamp reimb_submitted, Timestamp reimb_resolved,
			String reimb_description, Users reimb_author, Users reimb_resolver) {
		super();
		this.reimb_id = reimb_id;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
	}


	public Reimbursement(double reimb_amount, Timestamp reimb_submitted, Timestamp reimb_resolved,
			String reimb_description, Users reimb_author, Users reimb_resolver) {
		super();
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
	}


	public Reimbursement(int reimb_id, double reimb_amount, Timestamp reimb_submitted, Timestamp reimb_resolved,
			String reimb_description, Users reimb_author, Users reimb_resolver, Reimbursement_Status reimb_status_id,
			Reimbursement_Type reimb_type_id) {
		super();
		this.reimb_id = reimb_id;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
	}


	public int getReimb_id() {
		return reimb_id;
	}


	public void setReimb_id(int reimb_id) {
		this.reimb_id = reimb_id;
	}


	public double getReimb_amount() {
		return reimb_amount;
	}


	public void setReimb_amount(double reimb_amount) {
		this.reimb_amount = reimb_amount;
	}


	public Timestamp getReimb_submitted() {
		return reimb_submitted;
	}


	public void setReimb_submitted(Timestamp reimb_submitted) {
		this.reimb_submitted = reimb_submitted;
	}


	public Timestamp getReimb_resolved() {
		return reimb_resolved;
	}


	public void setReimb_resolved(Timestamp reimb_resolved) {
		this.reimb_resolved = reimb_resolved;
	}


	public String getReimb_description() {
		return reimb_description;
	}


	public void setReimb_description(String reimb_description) {
		this.reimb_description = reimb_description;
	}


	public Users getReimb_author() {
		return reimb_author;
	}


	public void setReimb_author(Users reimb_author) {
		this.reimb_author = reimb_author;
	}


	public Users getReimb_resolver() {
		return reimb_resolver;
	}


	public void setReimb_resolver(Users reimb_resolver) {
		this.reimb_resolver = reimb_resolver;
	}


	public Reimbursement_Status getReimb_status_id() {
		return reimb_status_id;
	}


	public void setReimb_status_id(Reimbursement_Status reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}


	public Reimbursement_Type getReimb_type_id() {
		return reimb_type_id;
	}


	public void setReimb_type_id(Reimbursement_Type reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(reimb_amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((reimb_author == null) ? 0 : reimb_author.hashCode());
		result = prime * result + ((reimb_description == null) ? 0 : reimb_description.hashCode());
		result = prime * result + reimb_id;
		result = prime * result + ((reimb_resolved == null) ? 0 : reimb_resolved.hashCode());
		result = prime * result + ((reimb_resolver == null) ? 0 : reimb_resolver.hashCode());
		result = prime * result + ((reimb_status_id == null) ? 0 : reimb_status_id.hashCode());
		result = prime * result + ((reimb_submitted == null) ? 0 : reimb_submitted.hashCode());
		result = prime * result + ((reimb_type_id == null) ? 0 : reimb_type_id.hashCode());
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
		Reimbursement other = (Reimbursement) obj;
		if (Double.doubleToLongBits(reimb_amount) != Double.doubleToLongBits(other.reimb_amount))
			return false;
		if (reimb_author == null) {
			if (other.reimb_author != null)
				return false;
		} else if (!reimb_author.equals(other.reimb_author))
			return false;
		if (reimb_description == null) {
			if (other.reimb_description != null)
				return false;
		} else if (!reimb_description.equals(other.reimb_description))
			return false;
		if (reimb_id != other.reimb_id)
			return false;
		if (reimb_resolved == null) {
			if (other.reimb_resolved != null)
				return false;
		} else if (!reimb_resolved.equals(other.reimb_resolved))
			return false;
		if (reimb_resolver == null) {
			if (other.reimb_resolver != null)
				return false;
		} else if (!reimb_resolver.equals(other.reimb_resolver))
			return false;
		if (reimb_status_id == null) {
			if (other.reimb_status_id != null)
				return false;
		} else if (!reimb_status_id.equals(other.reimb_status_id))
			return false;
		if (reimb_submitted == null) {
			if (other.reimb_submitted != null)
				return false;
		} else if (!reimb_submitted.equals(other.reimb_submitted))
			return false;
		if (reimb_type_id == null) {
			if (other.reimb_type_id != null)
				return false;
		} else if (!reimb_type_id.equals(other.reimb_type_id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Reimbursement [reimb_id=" + reimb_id + ", reimb_amount=" + reimb_amount + ", reimb_submitted="
				+ reimb_submitted + ", reimb_resolved=" + reimb_resolved + ", reimb_description=" + reimb_description
				+ ", reimb_author=" + reimb_author.getUsers_id() + ", reimb_resolver=" + reimb_resolver.getUsers_id() + ", reimb_status_id="
				+ reimb_status_id.getReimb_status_id() + ", reimb_type_id=" + reimb_type_id.getReimb_type_id() + "]";
	}
	
	






	
	
	
	
	
	
	

}
