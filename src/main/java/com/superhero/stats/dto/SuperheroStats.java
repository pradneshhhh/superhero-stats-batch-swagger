package com.superhero.stats.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All details about the Superhero Stats")
public class SuperheroStats {
	

	private int id;
	@ApiModelProperty(notes="Name should have first letter Upper Case and separated by a space if required")
	private String name;
	@ApiModelProperty(notes="Male/Female")
	private String gender;
	
	private String eyeColor;
	
	private String race;
	
	private String hairColor;
	
	private String height;
	@ApiModelProperty(notes="Marvel Comics")
	private String publisher;
	
	private String skinColor;
	@ApiModelProperty(notes="good/bad/neutral")
	private String alignment;
	
	private String weight;
	
	public SuperheroStats() {
	}
	
	
	
	public SuperheroStats(int id, String name, String gender, String eyeColor, String race, String hairColor,
			String height, String publisher, String skinColor, String alignment, String weight) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.eyeColor = eyeColor;
		this.race = race;
		this.hairColor = hairColor;
		this.height = height;
		this.publisher = publisher;
		this.skinColor = skinColor;
		this.alignment = alignment;
		this.weight = weight;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
}
