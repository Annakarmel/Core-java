package com.xworkz.apartment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "apartment")
@NoArgsConstructor
@NamedQuery(name = "findByplaces",query = "select ent from ApartmentEntity ent where ent.places=:plac")
public class ApartmentEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "apartmentName")
	private String apartmentName;
	@Column(name = "ownerName")
	private String ownerName;
	@Column(name = "noOfRooms")
	private int noOfRooms;
	@Column(name = "address")
	private String address;
	@Column(name = "place")
	private String places;
	
}
