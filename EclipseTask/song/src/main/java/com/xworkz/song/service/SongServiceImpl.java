package com.xworkz.song.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.song.configuration.dto.SongDTO;
import com.xworkz.song.repository.SongRepo;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	private SongRepo repo;

	public SongServiceImpl() {
		System.out.println("SongServiceImpl");
	}

	@Override
	public boolean saveAndValidate(SongDTO dto) {
		System.out.println("saveAndValidate created in serviceImpl");
		System.out.println("repo is called in service:");
		this.repo.save(dto);

		return true;
	}

}
