package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductDTO implements Serializable {
	private Integer id;
	private String name;
	private Integer price;
	private String company;
	private LocalDate manDate;
	private LocalDate expDate;
	private Integer discount;
	private String description;
	private Integer quantity;
	private Float rating;
	private Integer peopleRated;
	private Integer peopleRatedFive;
	private Integer peopleRatedFour;
	private Integer peopleRatedThree;
	private Integer peopleRatedTwo;
	private Integer peopleRatedOne;
	private String packer;
	private Integer itemWeight;
	private String included;
	private String genericName;
	private LocalDate dateFirstAvailable;
	private Integer asin;
	private Boolean damaged;
	private String originCountry;
	private Integer modelNo;
	private Integer serialNo;
	private Boolean returnable;
	private Integer warranty;
	private Boolean primeDelivery;
	private LocalDate deliveryDate;
	private LocalDate returnByDate;

	public ProductDTO(Integer id, String name, Integer price, String company, LocalDate manDate, LocalDate expDate,
			Integer discount, String description, Integer quantity, Float rating, Integer peopleRated,
			Integer peopleRatedFive, Integer peopleRatedFour, Integer peopleRatedThree, Integer peopleRatedTwo,
			Integer peopleRatedOne, String packer, Integer itemWeight, String included, String genericName,
			LocalDate dateFirstAvailable, Integer asin, Boolean damaged, String originCountry, Integer modelNo,
			Integer serialNo, Boolean returnable, Integer warranty, Boolean primeDelivery, LocalDate deliveryDate,
			LocalDate returnByDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.company = company;
		this.manDate = manDate;
		this.expDate = expDate;
		this.discount = discount;
		this.description = description;
		this.quantity = quantity;
		this.rating = rating;
		this.peopleRated = peopleRated;
		this.peopleRatedFive = peopleRatedFive;
		this.peopleRatedFour = peopleRatedFour;
		this.peopleRatedThree = peopleRatedThree;
		this.peopleRatedTwo = peopleRatedTwo;
		this.peopleRatedOne = peopleRatedOne;
		this.packer = packer;
		this.itemWeight = itemWeight;
		this.included = included;
		this.genericName = genericName;
		this.dateFirstAvailable = dateFirstAvailable;
		this.asin = asin;
		this.damaged = damaged;
		this.originCountry = originCountry;
		this.modelNo = modelNo;
		this.serialNo = serialNo;
		this.returnable = returnable;
		this.warranty = warranty;
		this.primeDelivery = primeDelivery;
		this.deliveryDate = deliveryDate;
		this.returnByDate = returnByDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public LocalDate getManDate() {
		return manDate;
	}

	public void setManDate(LocalDate manDate) {
		this.manDate = manDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Integer getPeopleRated() {
		return peopleRated;
	}

	public void setPeopleRated(Integer peopleRated) {
		this.peopleRated = peopleRated;
	}

	public Integer getPeopleRatedFive() {
		return peopleRatedFive;
	}

	public void setPeopleRatedFive(Integer peopleRatedFive) {
		this.peopleRatedFive = peopleRatedFive;
	}

	public Integer getPeopleRatedFour() {
		return peopleRatedFour;
	}

	public void setPeopleRatedFour(Integer peopleRatedFour) {
		this.peopleRatedFour = peopleRatedFour;
	}

	public Integer getPeopleRatedThree() {
		return peopleRatedThree;
	}

	public void setPeopleRatedThree(Integer peopleRatedThree) {
		this.peopleRatedThree = peopleRatedThree;
	}

	public Integer getPeopleRatedTwo() {
		return peopleRatedTwo;
	}

	public void setPeopleRatedTwo(Integer peopleRatedTwo) {
		this.peopleRatedTwo = peopleRatedTwo;
	}

	public Integer getPeopleRatedOne() {
		return peopleRatedOne;
	}

	public void setPeopleRatedOne(Integer peopleRatedOne) {
		this.peopleRatedOne = peopleRatedOne;
	}

	public String getPacker() {
		return packer;
	}

	public void setPacker(String packer) {
		this.packer = packer;
	}

	public Integer getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(Integer itemWeight) {
		this.itemWeight = itemWeight;
	}

	public String getIncluded() {
		return included;
	}

	public void setIncluded(String included) {
		this.included = included;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public LocalDate getDateFirstAvailable() {
		return dateFirstAvailable;
	}

	public void setDateFirstAvailable(LocalDate dateFirstAvailable) {
		this.dateFirstAvailable = dateFirstAvailable;
	}

	public Integer getAsin() {
		return asin;
	}

	public void setAsin(Integer asin) {
		this.asin = asin;
	}

	public Boolean getDamaged() {
		return damaged;
	}

	public void setDamaged(Boolean damaged) {
		this.damaged = damaged;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public Integer getModelNo() {
		return modelNo;
	}

	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public Boolean getReturnable() {
		return returnable;
	}

	public void setReturnable(Boolean returnable) {
		this.returnable = returnable;
	}

	public Integer getWarranty() {
		return warranty;
	}

	public void setWarranty(Integer warranty) {
		this.warranty = warranty;
	}

	public Boolean getPrimeDelivery() {
		return primeDelivery;
	}

	public void setPrimeDelivery(Boolean primeDelivery) {
		this.primeDelivery = primeDelivery;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDate getReturnByDate() {
		return returnByDate;
	}

	public void setReturnByDate(LocalDate returnByDate) {
		this.returnByDate = returnByDate;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", company=" + company + ", manDate="
				+ manDate + ", expDate=" + expDate + ", discount=" + discount + ", description=" + description
				+ ", quantity=" + quantity + ", rating=" + rating + ", peopleRated=" + peopleRated
				+ ", peopleRatedFive=" + peopleRatedFive + ", peopleRatedFour=" + peopleRatedFour
				+ ", peopleRatedThree=" + peopleRatedThree + ", peopleRatedTwo=" + peopleRatedTwo + ", peopleRatedOne="
				+ peopleRatedOne + ", packer=" + packer + ", itemWeight=" + itemWeight + ", included=" + included
				+ ", genericName=" + genericName + ", dateFirstAvailable=" + dateFirstAvailable + ", asin=" + asin
				+ ", damaged=" + damaged + ", originCountry=" + originCountry + ", modelNo=" + modelNo + ", serialNo="
				+ serialNo + ", returnable=" + returnable + ", warranty=" + warranty + ", primeDelivery="
				+ primeDelivery + ", deliveryDate=" + deliveryDate + ", returnByDate=" + returnByDate + "]";
	}

	
}
