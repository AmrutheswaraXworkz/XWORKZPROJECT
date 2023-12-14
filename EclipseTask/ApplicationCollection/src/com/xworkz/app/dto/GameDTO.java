package com.xworkz.app.dto;

import java.io.Serializable;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;

public class GameDTO implements Serializable {

	private Integer id;
	private String name;
	private Integer participants;
	private Integer points;
	private LocalDate eventDate;
	private String winner;
	private String runnerUp;
	private Double duration;

	public GameDTO(Integer id, String name, Integer participants, Integer points, LocalDate eventDate, String winner,
			String runnerUp, Double duration) {
		super();
		this.id = id;
		this.name = name;
		this.participants = participants;
		this.points = points;
		this.eventDate = eventDate;
		this.winner = winner;
		this.runnerUp = runnerUp;
		this.duration = duration;
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

	public Integer getParticipants() {
		return participants;
	}

	public void setParticipants(Integer participants) {
		this.participants = participants;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getRunnerUp() {
		return runnerUp;
	}

	public void setRunnerUp(String runnerUp) {
		this.runnerUp = runnerUp;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "GameDTO [id=" + id + ", name=" + name + ", participants=" + participants + ", points=" + points
				+ ", eventDate=" + eventDate + ", winner=" + winner + ", runnerUp=" + runnerUp + ", duration="
				+ duration + "]";
	}

}
