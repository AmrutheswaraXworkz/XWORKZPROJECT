package com.xworkz.dto.boot;

import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.app.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		 ProductDTO product1 = new ProductDTO(
		            1, "Laptop", 1200, "XYZ Electronics", LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31),
		            10, "Powerful laptop with high performance", 50, 4.7f, 30, 15, 5, 0, 0, 10,
		            "Packing Solutions Inc.", 5, "Charging cable, User manual", "Electronics", LocalDate.of(2023, 1, 15),
		            987654321, false, "Country B", 456, 7890, true, 24, true,
		            LocalDate.of(2023, 11, 15), LocalDate.of(2024, 1, 15)
		    );

		    ProductDTO product2 = new ProductDTO(
		            2, "Smartphone", 800, "ABC Tech", LocalDate.of(2023, 2, 1), LocalDate.of(2024, 2, 1),
		            15, "Feature-packed smartphone with AI camera", 100, 4.5f, 40, 20, 10, 5, 5, 10,
		            "TechPack Inc.", 2, "Charger, Earphones", "Mobile", LocalDate.of(2023, 2, 15),
		            123456789, false, "Country A", 789, 54321, true, 12, true,
		            LocalDate.of(2023, 12, 1), LocalDate.of(2024, 2, 1)
		    );

		    ProductDTO product3 = new ProductDTO(
		            3, "Coffee Maker", 50, "Home Appliances Ltd.", LocalDate.of(2023, 3, 1), LocalDate.of(2025, 3, 1),
		            5, "Brew your favorite coffee at home", 30, 4.2f, 15, 8, 5, 2, 0, 0,
		            "SafePacker", 3, "Coffee filters", "Kitchen Appliances", LocalDate.of(2023, 3, 15),
		            456789012, false, "Country C", 234, 67890, true, 6, false,
		            LocalDate.of(2023, 12, 1), LocalDate.of(2024, 3, 1)
		    );

		    ProductDTO product4 = new ProductDTO(
		            4, "Wireless Headphones", 100, "AudioTech", LocalDate.of(2023, 4, 1), LocalDate.of(2024, 4, 1),
		            12, "Immersive sound experience with noise cancellation", 50, 4.8f, 25, 15, 5, 3, 2, 0,
		            "SoundPacker", 0, "Charging cable, User manual", "Audio", LocalDate.of(2023, 4, 15),
		            345678901, false, "Country D", 567, 12345, true, 18, true,
		            LocalDate.of(2023, 12, 1), LocalDate.of(2024, 4, 1)
		    );

		    ProductDTO product5 = new ProductDTO(
		            5, "Fitness Tracker", 30, "HealthTech", LocalDate.of(2023, 5, 1), LocalDate.of(2024, 5, 1),
		            8, "Track your health and fitness goals", 100, 4.0f, 20, 10, 15, 5, 0, 0,
		            "HealthPacker", 0, "User manual", "Wearable", LocalDate.of(2023, 5, 15),
		            567890123, false, "Country E", 789, 67890, true, 12, false,
		            LocalDate.of(2023, 12, 1), LocalDate.of(2024, 5, 1)
		    );

		    ProductDTO product6 = new ProductDTO(
		            6, "Digital Camera", 500, "PhotoTech", LocalDate.of(2023, 6, 1), LocalDate.of(2024, 6, 1),
		            18, "Capture high-quality images and videos", 40, 4.5f, 30, 10, 5, 3, 2, 10,
		            "CameraPacker", 1, "SD card, Camera bag", "Photography", LocalDate.of(2023, 6, 15),
		            789012345, false, "Country F", 890, 45678, true, 24, true,
		            LocalDate.of(2023, 12, 1), LocalDate.of(2024, 6, 1)
		    );

		    ProductDTO product7 = new ProductDTO(
		            7, "Gaming Console", 400, "GameTech", LocalDate.of(2023, 7, 1), LocalDate.of(2024, 7, 1),
		            20, "Enjoy immersive gaming experiences", 30, 4.8f, 25, 15, 5, 2, 3, 5,
		            "GamePacker", 4, "Controllers, Game CDs", "Gaming", LocalDate.of(2023, 7, 15),
		            901234567, false, "Country G", 123, 89012, true, 12, true,
		            LocalDate.of(2023, 12, 1), LocalDate.of(2024, 7, 1)
		    );

		    ProductDTO product8 = new ProductDTO(
		            8, "Portable Speaker", 80, "AudioTech", LocalDate.of(2023, 8, 1), LocalDate.of(2024, 8, 1),
		            15, "Enjoy music on the go with high-quality sound", 60, 4.3f, 20, 15, 10, 10, 5, 0,
		            "SoundPacker", 0, "Charging cable, User manual", "Audio", LocalDate.of(2023, 8, 15),
		            123456789, false, "Country H", 456, 78901, true, 12, false,
		            LocalDate.of(2023, 12, 1), LocalDate.of(2024, 8, 1)
		    );

		    ProductDTO product9 = new ProductDTO(
		            9, "External Hard Drive", 120, "TechStorage", LocalDate.of(2023, 9, 1), LocalDate.of(2024, 9, 1),
		            10, "Expand your storage capacity easily", 80, 4.6f, 35, 20, 15, 5, 0, 5,
		            "StoragePacker", 0, "USB cable, User manual", "Storage", LocalDate.of(2023, 9, 15),
		            234567890, false, "Country I", 567, 23456, true, 24, true,
		            LocalDate.of(2023, 12, 1), LocalDate.of(2024, 9, 1)
		    );

		    ProductDTO product10 = new ProductDTO(
		            10, "Smart Watch", 150, "WearableTech", LocalDate.of(2023, 10, 1), LocalDate.of(2024, 10, 1),
		            8, "Stay connected with fitness and notifications", 120, 4.2f, 25, 15, 10, 5, 0, 5,
		            "WatchPacker", 0, "Charging cable, User manual", "Wearable", LocalDate.of(2023, 10, 15),
		            345678901, false, "Country J", 678, 34567, true, 18, true,
		            LocalDate.of(2023, 12, 1), LocalDate.of(2024, 10, 1)
		    );
		    
		    System.err.println("sorting through id");
		    Collection<ProductDTO> products=Stream.of(product1,product2,product3,product4,product5,product6,product7,product8,product9,product10).collect(Collectors.toList());
		    Comparator<ProductDTO> idAsc=(t1,t2)->t1.getId().compareTo(t2.getId());
		    products.stream().sorted(idAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through id");
		    Comparator<ProductDTO> idDsc=(t1,t2)->t2.getId().compareTo(t1.getId());
		    products.stream().sorted(idDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through name");
		    Comparator<ProductDTO> nameAsc=(t1,t2)->t1.getName().compareTo(t2.getName());
		    products.stream().sorted(nameAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through name");
		    Comparator<ProductDTO> nameDsc=(t1,t2)->t2.getName().compareTo(t1.getName());
		    products.stream().sorted(nameDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through price");
		    Comparator<ProductDTO> priceAsc=(t1,t2)->t1.getPrice().compareTo(t2.getPrice());
		    products.stream().sorted(priceAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through price");
		    Comparator<ProductDTO> priceDsc=(t1,t2)->t2.getPrice().compareTo(t1.getPrice());
		    products.stream().sorted(priceDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through company");
		    Comparator<ProductDTO> companyAsc=(t1,t2)->t1.getCompany().compareTo(t2.getCompany());
		    products.stream().sorted(companyAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through company");
		    Comparator<ProductDTO> companyDsc=(t1,t2)->t2.getCompany().compareTo(t1.getCompany());
		    products.stream().sorted(companyDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through Manufacture Date");
		    Comparator<ProductDTO> manDateAsc=(t1,t2)->t1.getManDate().compareTo(t2.getManDate());
		    products.stream().sorted(manDateAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through Manufacture Date");
		    Comparator<ProductDTO> manDateDsc=(t1,t2)->t2.getManDate().compareTo(t1.getManDate());
		    products.stream().sorted(manDateDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through Expiry Date");
		    Comparator<ProductDTO> expDateAsc=(t1,t2)->t1.getExpDate().compareTo(t2.getExpDate());
		    products.stream().sorted(expDateAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through Expiry Date");
		    Comparator<ProductDTO> expDateDsc=(t1,t2)->t2.getExpDate().compareTo(t1.getExpDate());
		    products.stream().sorted(expDateDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through discount");
		    Comparator<ProductDTO> discountAsc=(t1,t2)->t1.getDiscount().compareTo(t2.getDiscount());
		    products.stream().sorted(discountAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through discount");
		    Comparator<ProductDTO> discountDsc=(t1,t2)->t2.getDiscount().compareTo(t1.getDiscount());
		    products.stream().sorted(discountDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through description");
		    Comparator<ProductDTO> descAsc=(t1,t2)->t1.getDescription().compareTo(t2.getDescription());
		    products.stream().sorted(descAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through description");
		    Comparator<ProductDTO> descDsc=(t1,t2)->t2.getDescription().compareTo(t1.getDescription());
		    products.stream().sorted(descDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through quantity");
		    Comparator<ProductDTO> quantityAsc=(t1,t2)->t1.getQuantity().compareTo(t2.getQuantity());
		    products.stream().sorted(quantityAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through quantity");
		    Comparator<ProductDTO> quantityDsc=(t1,t2)->t2.getQuantity().compareTo(t1.getQuantity());
		    products.stream().sorted(quantityDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through rating");
		    Comparator<ProductDTO> ratingAsc=(t1,t2)->t1.getRating().compareTo(t2.getRating());
		    products.stream().sorted(ratingAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through rating");
		    Comparator<ProductDTO> ratingDsc=(t1,t2)->t2.getRating().compareTo(t1.getRating());
		    products.stream().sorted(ratingDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through peopleRated");
		    Comparator<ProductDTO> peopleAsc=(t1,t2)->t1.getPeopleRated().compareTo(t2.getPeopleRated());
		    products.stream().sorted(peopleAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through peopleRated");
		    Comparator<ProductDTO> peopleDsc=(t1,t2)->t2.getPeopleRated().compareTo(t1.getPeopleRated());
		    products.stream().sorted(peopleDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingFive");
		    Comparator<ProductDTO> rating5Asc=(t1,t2)->t1.getPeopleRatedFive().compareTo(t2.getPeopleRatedFive());
		    products.stream().sorted(rating5Asc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingFive");
		    Comparator<ProductDTO> rating5Dsc=(t1,t2)->t2.getPeopleRatedFive().compareTo(t1.getPeopleRatedFive());
		    products.stream().sorted(rating5Dsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingFour");
		    Comparator<ProductDTO> rating4Asc=(t1,t2)->t1.getPeopleRatedFour().compareTo(t2.getPeopleRatedFour());
		    products.stream().sorted(rating4Asc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingFour");
		    Comparator<ProductDTO> rating4Dsc=(t1,t2)->t2.getPeopleRatedFour().compareTo(t1.getPeopleRatedFour());
		    products.stream().sorted(rating4Dsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingThree");
		    Comparator<ProductDTO> rating3Asc=(t1,t2)->t1.getPeopleRatedThree().compareTo(t2.getPeopleRatedThree());
		    products.stream().sorted(rating3Asc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingThree");
		    Comparator<ProductDTO> rating3Dsc=(t1,t2)->t1.getPeopleRatedThree().compareTo(t2.getPeopleRatedThree());
		    products.stream().sorted(rating3Dsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingTwo");
		    Comparator<ProductDTO> rating2Asc=(t1,t2)->t1.getPeopleRatedTwo().compareTo(t2.getPeopleRatedTwo());
		    products.stream().sorted(rating2Asc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingTwo");
		    Comparator<ProductDTO> rating2Dsc=(t1,t2)->t2.getPeopleRatedTwo().compareTo(t1.getPeopleRatedTwo());
		    products.stream().sorted(rating2Dsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingOne");
		    Comparator<ProductDTO> rating1Asc=(t1,t2)->t1.getPeopleRatedOne().compareTo(t2.getPeopleRatedOne());
		    products.stream().sorted(rating1Asc).forEach(c->System.out.println(c));
		    System.err.println("sorting through ratingOne");
		    Comparator<ProductDTO> rating1Dsc=(t1,t2)->t2.getPeopleRatedOne().compareTo(t1.getPeopleRatedOne());
		    products.stream().sorted(rating1Dsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through packer");
		    Comparator<ProductDTO> packerAsc=(t1,t2)->t1.getPacker().compareTo(t2.getPacker());
		    products.stream().sorted(packerAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through packer");
		    Comparator<ProductDTO> packerDsc=(t1,t2)->t2.getPacker().compareTo(t1.getPacker());
		    products.stream().sorted(packerDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item weight");
		    Comparator<ProductDTO> weightAsc=(t1,t2)->t1.getItemWeight().compareTo(t2.getItemWeight());
		    products.stream().sorted(weightAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item weight");
		    Comparator<ProductDTO> weightDsc=(t1,t2)->t2.getItemWeight().compareTo(t1.getItemWeight());
		    products.stream().sorted(weightDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item included");
		    Comparator<ProductDTO> includedAsc=(t1,t2)->t1.getIncluded().compareTo(t2.getIncluded());
		    products.stream().sorted(includedAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item included");
		    Comparator<ProductDTO> includedDsc=(t1,t2)->t2.getIncluded().compareTo(t1.getIncluded());
		    products.stream().sorted(includedDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item genericName");
		    Comparator<ProductDTO> genericAsc=(t1,t2)->t1.getGenericName().compareTo(t2.getGenericName());
		    products.stream().sorted(genericAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item genericName");
		    Comparator<ProductDTO> genericDsc=(t1,t2)->t2.getGenericName().compareTo(t1.getGenericName());
		    products.stream().sorted(genericDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item available date");
		    Comparator<ProductDTO> availableDateAsc=(t1,t2)->t1.getDateFirstAvailable().compareTo(t2.getDateFirstAvailable());
		    products.stream().sorted(availableDateAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item available date");
		    Comparator<ProductDTO> availableDateDsc=(t1,t2)->t2.getDateFirstAvailable().compareTo(t1.getDateFirstAvailable());
		    products.stream().sorted(availableDateDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item asin");
		    Comparator<ProductDTO> asinAsc=(t1,t2)->t1.getAsin().compareTo(t2.getAsin());
		    products.stream().sorted(asinAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item asin");
		    Comparator<ProductDTO> asinDsc=(t1,t2)->t2.getAsin().compareTo(t1.getAsin());
		    products.stream().sorted(asinDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item damaged");
		    Comparator<ProductDTO> damagedAsc=(t1,t2)->t1.getDamaged().compareTo(t2.getDamaged());
		    products.stream().sorted(damagedAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item damaged");
		    Comparator<ProductDTO> damagedDsc=(t1,t2)->t2.getDamaged().compareTo(t1.getDamaged());
		    products.stream().sorted(damagedDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item country");
		    Comparator<ProductDTO> countryAsc=(t1,t2)->t1.getOriginCountry().compareTo(t2.getOriginCountry());
		    products.stream().sorted(countryAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item country");
		    Comparator<ProductDTO> countryDsc=(t1,t2)->t2.getOriginCountry().compareTo(t1.getOriginCountry());
		    products.stream().sorted(countryDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item model no");
		    Comparator<ProductDTO> modelNoAsc=(t1,t2)->t1.getModelNo().compareTo(t2.getModelNo());
		    products.stream().sorted(modelNoAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item model no");
		    Comparator<ProductDTO> modelNoDsc=(t1,t2)->t2.getModelNo().compareTo(t1.getModelNo());
		    products.stream().sorted(modelNoDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item serial no");
		    Comparator<ProductDTO> serialNoAsc=(t1,t2)->t1.getSerialNo().compareTo(t2.getSerialNo());
		    products.stream().sorted(serialNoAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item serial no");
		    Comparator<ProductDTO> serialNoDsc=(t1,t2)->t2.getSerialNo().compareTo(t1.getSerialNo());
		    products.stream().sorted(serialNoDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item returnable");
		    Comparator<ProductDTO> returnAsc=(t1,t2)->t1.getReturnable().compareTo(t2.getReturnable());
		    products.stream().sorted(returnAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item returnable");
		    Comparator<ProductDTO> returnDsc=(t1,t2)->t2.getReturnable().compareTo(t1.getReturnable());
		    products.stream().sorted(returnDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item warranty");
		    Comparator<ProductDTO> warrantyAsc=(t1,t2)->t1.getWarranty().compareTo(t2.getWarranty());
		    products.stream().sorted(warrantyAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item warranty");
		    Comparator<ProductDTO> warrantyDsc=(t1,t2)->t2.getWarranty().compareTo(t1.getWarranty());
		    products.stream().sorted(warrantyDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item primedelivery");
		    Comparator<ProductDTO> primeAsc=(t1,t2)->t1.getPrimeDelivery().compareTo(t2.getPrimeDelivery());
		    products.stream().sorted(primeAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item primedelivery");
		    Comparator<ProductDTO> primeDsc=(t1,t2)->t2.getPrimeDelivery().compareTo(t1.getPrimeDelivery());
		    products.stream().sorted(primeDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item delivery expected");
		    Comparator<ProductDTO> expectAsc=(t1,t2)->t1.getDeliveryDate().compareTo(t2.getDeliveryDate());
		    products.stream().sorted(expectAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item delivery expected");
		    Comparator<ProductDTO> expectDsc=(t1,t2)->t2.getDeliveryDate().compareTo(t1.getDeliveryDate());
		    products.stream().sorted(expectDsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item delivery return by");
		    Comparator<ProductDTO> returnDateAsc=(t1,t2)->t1.getReturnByDate().compareTo(t2.getReturnByDate());
		    products.stream().sorted(returnDateAsc).forEach(c->System.out.println(c));
		    System.err.println("sorting through item delivery return by");
		    Comparator<ProductDTO> returnDateDsc=(t1,t2)->t2.getReturnByDate().compareTo(t1.getReturnByDate());
		    products.stream().sorted(returnDateDsc).forEach(c->System.out.println(c));
		    
		    System.err.println("sorting based on id,name,comapany");
		    products.stream().sorted(idAsc.thenComparing(nameAsc).thenComparing(companyAsc)).forEach(c->System.out.println(c));
		    System.err.println("sorting based on id,manufacture date,expiry date");
		    products.stream().sorted(idAsc.thenComparing(manDateAsc).thenComparing(expDateAsc)).forEach(c->System.out.println(c));
		    System.err.println("sorting based on name,company,genric name");
		    products.stream().sorted(nameAsc.thenComparing(companyAsc).thenComparing(genericAsc)).forEach(c->System.out.println(c));
		    System.err.println("sorting based on genric name,rating,rated 5");
		    products.stream().sorted(nameAsc.thenComparing(peopleAsc).thenComparing(rating5Asc)).forEach(c->System.out.println(c));
		    System.err.println("sorting based on rating,rated,rated 4");
		    products.stream().sorted(peopleAsc.thenComparing(ratingAsc).thenComparing(rating4Asc)).forEach(c->System.out.println(c));
		    System.err.println("sorting based on id,origin,comapany");
		    products.stream().sorted(idAsc.thenComparing(countryAsc).thenComparing(companyAsc)).forEach(c->System.out.println(c));
		    System.err.println("sorting based on id,origin,packer");
		    products.stream().sorted(idAsc.thenComparing(countryAsc).thenComparing(packerAsc)).forEach(c->System.out.println(c));
		    System.err.println("sorting based on packer,name,serial number");
		    products.stream().sorted(nameAsc.thenComparing(serialNoAsc).thenComparing(packerAsc)).forEach(c->System.out.println(c));
		    System.err.println("sorting based on id,packer,return");
		    products.stream().sorted(idAsc.thenComparing(packerAsc).thenComparing(returnAsc)).forEach(c->System.out.println(c));
		    System.err.println("sorting based on manufacture date,expiry date,return date");
		    products.stream().sorted(manDateAsc.thenComparing(expDateAsc).thenComparing(returnDateAsc)).forEach(c->System.out.println(c));
		    
		    System.err.println("sorting based on id,name descending");
		    products.stream().sorted(idDsc.thenComparing(nameDsc)).forEach(c->System.out.println(c));

		    System.err.println("sorting based on name,company descending");
		    products.stream().sorted(nameDsc.thenComparing(companyDsc)).forEach(c->System.out.println(c));
		    
		    System.err.println("sorting based on company,serial no descending");
		    products.stream().sorted(companyDsc.thenComparing(serialNoDsc)).forEach(c->System.out.println(c));

		    System.err.println("sorting based on serial,model descending");
		    products.stream().sorted(serialNoDsc.thenComparing(modelNoDsc)).forEach(c->System.out.println(c));

		    System.err.println("sorting based on model no,asin descending");
		    products.stream().sorted(modelNoDsc.thenComparing(asinDsc)).forEach(c->System.out.println(c));

		    System.err.println("sorting based on asin,packer descending");
		    products.stream().sorted(asinDsc.thenComparing(packerDsc)).forEach(c->System.out.println(c));

		    System.err.println("sorting based on packer,origin descending");
		    products.stream().sorted(packerDsc.thenComparing(countryDsc)).forEach(c->System.out.println(c));

		    System.err.println("sorting based on origin,warranty descending");
		    products.stream().sorted(countryDsc.thenComparing(warrantyDsc)).forEach(c->System.out.println(c));

		    System.err.println("sorting based on warranty,prime delivery descending");
		    products.stream().sorted(warrantyDsc.thenComparing(primeDsc)).forEach(c->System.out.println(c));

		    System.err.println("sorting based on prime delivery,origin descending");
		    products.stream().sorted(priceDsc.thenComparing(countryDsc)).forEach(c->System.out.println(c));
		    
		    List<Integer> idList = products.stream().map(c->c.getId()).collect(Collectors.toList());
		    idList.forEach(c->System.out.println(c));
	        List<String> nameList = products.stream().map(c->c.getName()).collect(Collectors.toList());
	        nameList.forEach(c->System.out.println(c));
	        List<Integer> priceList = products.stream().map(c->c.getPrice()).collect(Collectors.toList());
	        priceList.forEach(c->System.out.println(c));
	        List<String> companyList = products.stream().map(c->c.getCompany()).collect(Collectors.toList());
	        companyList.forEach(c->System.out.println(c));
	        List<LocalDate> manDateList = products.stream().map(c->c.getManDate()).collect(Collectors.toList());
	        manDateList.forEach(c->System.out.println(c));
	        List<LocalDate> expDateList = products.stream().map(c->c.getExpDate()).collect(Collectors.toList());
	        expDateList.forEach(c->System.out.println(c));
	        List<Integer> discountList =products.stream().map(c->c.getDiscount()).collect(Collectors.toList());
	        discountList.forEach(c->System.out.println(c));
	        List<String> descriptionList = products.stream().map(c->c.getDescription()).collect(Collectors.toList());
	        descriptionList.forEach(c->System.out.println(c));
	        List<Integer> quantityList =products.stream().map(c->c.getQuantity()).collect(Collectors.toList());
	        quantityList.forEach(c->System.out.println(c));
	        List<Float> ratingList =products.stream().map(c->c.getRating()).collect(Collectors.toList());
	        ratingList.forEach(c->System.out.println(c));
	        List<Integer> peopleRatedList = products.stream().map(c->c.getPeopleRated()).collect(Collectors.toList());
	        peopleRatedList.forEach(c->System.out.println(c));
	        List<Integer> peopleRatedFiveList = products.stream().map(c->c.getPeopleRatedFive()).collect(Collectors.toList());
	        peopleRatedFiveList.forEach(c->System.out.println(c));
	        List<Integer> peopleRatedFourList = products.stream().map(c->c.getPeopleRatedFour()).collect(Collectors.toList());
	        peopleRatedFourList.forEach(c->System.out.println(c));
	        List<Integer> peopleRatedThreeList =products.stream().map(c->c.getPeopleRatedThree()).collect(Collectors.toList());
	        peopleRatedThreeList.forEach(c->System.out.println(c));
	        List<Integer> peopleRatedTwoList =products.stream().map(c->c.getPeopleRatedTwo()).collect(Collectors.toList());
	        peopleRatedTwoList.forEach(c->System.out.println(c));
	        List<Integer> peopleRatedOneList = products.stream().map(c->c.getPeopleRatedOne()).collect(Collectors.toList());
	        peopleRatedOneList.forEach(c->System.out.println(c));
	        List<String> packerList = products.stream().map(c->c.getPacker()).collect(Collectors.toList());
	        packerList.forEach(c->System.out.println(c));
	        List<Integer> itemWeightList = products.stream().map(c->c.getItemWeight()).collect(Collectors.toList());
	        itemWeightList.forEach(c->System.out.println(c));
	        List<String> includedList = products.stream().map(c->c.getIncluded()).collect(Collectors.toList());
	        includedList.forEach(c->System.out.println(c));
	        List<String> genericNameList = products.stream().map(c->c.getGenericName()).collect(Collectors.toList());
	        genericNameList.forEach(c->System.out.println(c));
	        List<LocalDate> dateFirstAvailableList = products.stream().map(c->c.getDateFirstAvailable()).collect(Collectors.toList());
	        dateFirstAvailableList.forEach(c->System.out.println(c));
	        List<Integer> asinList = products.stream().map(c->c.getAsin()).collect(Collectors.toList());
	        asinList.forEach(c->System.out.println(c));
	        List<Boolean> damagedList = products.stream().map(c->c.getDamaged()).collect(Collectors.toList());
	        damagedList.forEach(c->System.out.println(c));
	        List<String> originCountryList = products.stream().map(c->c.getOriginCountry()).collect(Collectors.toList());
	        originCountryList.forEach(c->System.out.println(c));
	        List<Integer> modelNoList = products.stream().map(c->c.getModelNo()).collect(Collectors.toList());
	        modelNoList.forEach(c->System.out.println(c));
	        List<Integer> serialNoList = products.stream().map(c->c.getSerialNo()).collect(Collectors.toList());
	        serialNoList.forEach(c->System.out.println(c));
	        List<Boolean> returnableList = products.stream().map(c->c.getReturnable()).collect(Collectors.toList());
	        returnableList.forEach(c->System.out.println(c));
	        List<Integer> warrantyList = products.stream().map(c->c.getWarranty()).collect(Collectors.toList());
	        warrantyList.forEach(c->System.out.println(c));
	        List<Boolean> primeDeliveryList = products.stream().map(c->c.getPrimeDelivery()).collect(Collectors.toList());
	        primeDeliveryList.forEach(c->System.out.println(c));
	        List<LocalDate> deliveryDateList =products.stream().map(c->c.getDeliveryDate()).collect(Collectors.toList());
	        deliveryDateList.forEach(c->System.out.println(c));
	        List<LocalDate> returnByDateList =products.stream().map(c->c.getReturnByDate()).collect(Collectors.toList());
	        returnByDateList.forEach(c->System.out.println(c));
	        
	      
		    
		    
		    
		   

		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}
}
