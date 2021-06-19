package com.example.springboot.advertisement;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Advertiser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String adName;
	private String adAddress;
	private Date adDob;
	private String adComapign;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdAddress() {
		return adAddress;
	}
	public void setAdAddress(String adAddress) {
		this.adAddress = adAddress;
	}
	public Date getAdDob() {
		return adDob;
	}
	public void setAdDob(Date adDob) {
		this.adDob = adDob;
	}
	public String getAdComapign() {
		return adComapign;
	}
	public void setAdComapign(String adComapign) {
		this.adComapign = adComapign;
	}
	
	
	
	
}
