package com.senai.julio.PrjGame.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String platform;
	
	// get
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPlatform() {
		return platform;
	}
	
	// set
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}
}
