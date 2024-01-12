package com.xworkz.song.configuration.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import com.xworkz.song.configuration.dto.SongDTO;
import com.xworkz.song.service.SongService;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class SongController {

	@Autowired
	private SongService songService;

	private static String UPLOADED_FOLDER = "D:\\spring-upload\\temp\\";

	public SongController() {
		System.out.println("SongController");
	}

	@PostMapping("/song")
	public String saveSong(Model model, @Valid SongDTO dto, BindingResult errors) {
		System.out.println("Details of the SongDto:" + dto);
		System.out.println("Details of the SongDto is in valid:" + errors.hasErrors());

		model.addAttribute("dto", dto);

		if (errors.hasErrors()) {
			List<ObjectError> objectErrors = errors.getAllErrors();
			objectErrors.forEach(a -> System.out.println(a.getObjectName() + " " + a.getDefaultMessage()));
			model.addAttribute("error", objectErrors);
			model.addAttribute("err", "details cannot be saved");
			System.out.println("error");

			return "Song";
		} else {
			boolean save = this.songService.saveAndValidate(dto);
			if (save) {
				System.out.println("DTO Saved:" + save);
				model.addAttribute("noError", "Details saved");
			}

			return "SongSuccess";
		}

	}

	// @RequestMapping(value = "/upload", method = RequestMethod.POST)
	@PostMapping("/upload") // //new annotation since 4.3
	public String singleFileUpload(@RequestParam("file") MultipartFile file,Model model) {

		if (file.isEmpty()) {
			model.addAttribute("message", "please select file to upload");
			return "SongSuccess";
		}

		try {

			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

		} catch (IOException e) {
			e.printStackTrace();
		}
		model.addAttribute("message", "saved successfully");
		return "SongSuccess";
	}

}
