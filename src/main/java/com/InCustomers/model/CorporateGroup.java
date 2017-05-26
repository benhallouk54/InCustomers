package com.InCustomers.model;


	import java.util.Date;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;


	@Entity
	@Table(name = "corporateGroup")
	public class CorporateGroup {
	    private Long corporateGroupId;
	    private String name;
	    private String emailAddress;
	    private Date dateCreated;

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public Long getCorporateGroupId() {
	        return corporateGroupId;
	    }

	    public void setCorporateGroupId(Long corporateGroupId) {
	        this.corporateGroupId = corporateGroupId;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		public Date getDateCreated() {
			return dateCreated;
		}

		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}

}
