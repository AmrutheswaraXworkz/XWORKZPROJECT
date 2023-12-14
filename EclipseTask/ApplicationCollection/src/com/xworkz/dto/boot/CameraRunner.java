package com.xworkz.dto.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.CameraDTO;

public class CameraRunner {

	public static void main(String[] args) {
		CameraDTO camera = new CameraDTO(1, "Sony", "Alpha", 78989, LocalDate.of(2023, 10, 22));
		CameraDTO camera1 = new CameraDTO(2, "Canon", "EOS", 40888, LocalDate.of(2022, 9, 2));
		CameraDTO camera2 = new CameraDTO(3, "Nikon", "D7500", 90490, LocalDate.of(2022, 8, 16));
		CameraDTO camera3 = new CameraDTO(4, "Canon", "Digital SLR", 85000, LocalDate.of(2022, 7, 13));
		CameraDTO camera4 = new CameraDTO(5, "Sony", "Beta", 90500, LocalDate.of(2021, 6, 11));

		Collection<CameraDTO> cameras = new ArrayList<CameraDTO>();
		cameras.add(camera);
		cameras.add(camera1);
		cameras.add(camera2);
		cameras.add(camera3);
		cameras.add(camera4);

		cameras.stream().filter((photo) -> photo.getBrand().equals("Canon")).forEach(cam -> System.out.println(cam));
		System.out.println();
		Collection<String> models = new ArrayList<String>();
		cameras.stream().filter((price) -> price.getCost() > 45000).forEach(cam -> models.add(cam.getModel()));
		models.forEach(s -> System.err.println(s));
		System.out.println();
		Collection<Double> price = new ArrayList<Double>();
		cameras.stream().filter((model) -> model.getModel().equals("EOS")).forEach(cam -> price.add(cam.getCost()));
		price.forEach(a -> System.out.println(a));
		System.out.println();

		cameras.stream().filter((cam) -> cam.getBrand().equals("Canon")).map(c -> c.getCost())
				.forEach(a -> System.err.println(a));

	}
}
