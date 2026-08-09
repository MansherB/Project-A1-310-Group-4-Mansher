package nz.ac.auckland.grocerfy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a product in the Grocerfy application including its attributes. 
 */
@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true, length = 150)
	private String productName;

	@Column(length = 100)
	private String brand;

	@Column(nullable = false, length = 100)
	private String category;

	@Column(name = "package_size", length = 50)
	private String packageSize;

	@Column(nullable = false)
	private boolean lactoseFree;

	@Column(nullable = false)
	private boolean glutenFree;

	@Column(nullable = false)
	private boolean vegetarian;

	@Column(nullable = false)
	private boolean vegan;

	protected Product() {
	}

	public Product(String productName, String brand, String category, String packageSize, boolean lactoseFree, boolean glutenFree, boolean vegetarian,
			boolean vegan) {
		this.productName = productName;
		this.brand = brand;
		this.category = category;
		this.packageSize = packageSize;
		this.lactoseFree = lactoseFree;
		this.glutenFree = glutenFree;
		this.vegetarian = vegetarian;
		this.vegan = vegan;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPackageSize() {
		return packageSize;
	}

	public void setPackageSize(String packageSize) {
		this.packageSize = packageSize;
	}

	public boolean isLactoseFree() {
		return lactoseFree;
	}

	public void setLactoseFree(boolean lactoseFree) {
		this.lactoseFree = lactoseFree;
	}

	public boolean isGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public boolean isVegan() {
		return vegan;
	}

	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}

	public String getDisplayName() {
		if (brand == null || brand.isBlank()) {
			return productName;
		}
		return brand + " " + productName;
	}
}