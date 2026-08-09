package nz.ac.auckland.grocerfy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Table to store information about different stores and their attributes. 
 */
@Entity
@Table(name = "stores")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true, length = 150)
	private String name;

	@Column(nullable = false, length = 100)
	private String city;

	@Column(length = 100)
	private String region;

	@Column(length = 255)
	private String address;

	protected Store() {
	}

	public Store(String name, String city, String region, String address) {
		this.name = name;
		this.city = city;
		this.region = region;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDisplayName() {
		if (region == null || region.isBlank()) {
			return name + " - " + city;
		}
		return name + " - " + city + ", " + region;
	}
}