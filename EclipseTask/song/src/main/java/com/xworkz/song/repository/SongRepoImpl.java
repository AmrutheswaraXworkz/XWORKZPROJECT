package com.xworkz.song.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.song.configuration.dto.SongDTO;

@Repository
public class SongRepoImpl implements SongRepo {

	@Override
	public void save(SongDTO dto) {
		System.out.println("saved succesfully:" + dto);

	}

}
