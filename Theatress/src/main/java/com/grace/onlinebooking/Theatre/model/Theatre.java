package com.grace.onlinebooking.Theatre.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ThetreDetails")
public class Theatre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="thetreId")
	private Long thetreId;
	public Long getThetreId() {
		return thetreId;
	}

	public void setThetreId(Long thetreId) {
		this.thetreId = thetreId;
	}

	public String getThetreName() {
		return thetreName;
	}

	public void setThetreName(String thetreName) {
		this.thetreName = thetreName;
	}

	public String getThetreLocation() {
		return thetreLocation;
	}

	public void setThetreLocation(String thetreLocation) {
		this.thetreLocation = thetreLocation;
	}

	public String getCityid() {
		return cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	@Column(name="thetreName")
	private String thetreName;
	@Column(name="thetreLocation")
	private String thetreLocation;
	@Column(name="cityid")
	private String cityid;
	  // Getters and Setters

	 private Show show;
	
	
	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Theatre() {
	  }

	 
	
	
}
