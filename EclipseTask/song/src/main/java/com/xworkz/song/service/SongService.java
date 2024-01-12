package com.xworkz.song.service;

import com.xworkz.song.configuration.dto.SongDTO;

public interface SongService {

	public boolean saveAndValidate(SongDTO dto);
}
