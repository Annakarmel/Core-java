package com.xworkz.collection.collectionExamples;

public class GameDTO {

	private String name;
	private Integer totalPlayers;
	private String type;
	
	public GameDTO() {
		
	}
	
	public GameDTO(String name, Integer totalPlayers, String type) {
		super();
		this.name = name;
		this.totalPlayers = totalPlayers;
		this.type = type;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		if(ref != null) {
			
			if(ref instanceof GameDTO) {
				
				GameDTO dto = (GameDTO)ref;
				if(dto.name.equals(this.name)) {
					return true;
				}
				if(dto.type.equals(this.type)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	
	public void setTotalPlayers(Integer totalPlayers) {
		this.totalPlayers = totalPlayers;
	}
	public Integer getTotalPlayers() {
		return totalPlayers;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}
