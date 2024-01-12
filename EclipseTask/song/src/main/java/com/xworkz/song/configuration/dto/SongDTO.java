package com.xworkz.song.configuration.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SongDTO {

	@NotNull
	@Size(min = 3, max = 20, message = "name must be min 3 and max 20")
	private String name;

	@NotNull
	@Size(min = 3, max = 20, message = "singer name must be min 3 and max 20")
	private String singerName;

	@NotNull
	@Size(min = 3, max = 20, message = "composer name must be min 3 and max 20")
	private String composer;

	@NotNull
	@Size(min = 3, max = 20, message = "duration must be min 3 and max 20")
	private String duration;

	@NotNull
	@Size(min = 3, max = 20, message = "album name must be min 3 and max 20")
	private String album;

	@NotNull
	@Size(min = 3, max = 20, message = "language must be min 3 and max 20")
	private String language;

	@NotNull
	@Size(min = 3, max = 20, message = "date must be min 3 and max 20")
	private String date;

	@NotNull
	@Size(min = 3, max = 20, message = "lyricist name must be min 3 and max 20")
	private String lyricist;

	@NotNull
	@Size(min = 3, max = 20, message = "producer name must be min 3 and max 20")
	private String producer;

	@NotNull
	@Size(min = 3, max = 20, message = "director name must be min 3 and max 20")
	private String director;
}
