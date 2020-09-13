package com.oar.CrudOps.dto;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "laptop_details")
@Cacheable
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
public class LaptopDTO implements Serializable {
	@Id
	@GenericGenerator(name = "laptop_auto", strategy = "increment")
	@GeneratedValue(generator = "laptop_auto")
	@Column(name = "id")
	private Long id;

	@Column(name = "brand")
	private String brand;

	@Column(name = "model")
	private String model;

	@Column(name = "display_size")
	private String displaySize;

	@Column(name = "processor")
	private String processor;

	@Column(name = "os")
	private String os;

	@Column(name = "ram")
	private String ram;

	@Column(name = "price")
	private Double price;

	public LaptopDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LaptopDTO [id=" + id + ", brand=" + brand + ", model=" + model + ", displaySize=" + displaySize
				+ ", processor=" + processor + ", os=" + os + ", ram=" + ram + ", price=" + price + "]";
	}

}
