package com.xworkz.mvcDatabase.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "egg_table")
@Data

public class EggDTO {

	@Id
	@Column(name = "e_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "e_hotelName")
	private String hotelName;
	@Column(name = "e_dishName")
	private String dishName;
	@Column(name = "e_type")
	private String type;
	@Column(name = "e_price")
	private Double price;
	@Column(name = "e_quantity")
	private Integer quantity;
	@Column(name = "e_takeAway")
	private Boolean takeAway;
	
	public EggDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
}
