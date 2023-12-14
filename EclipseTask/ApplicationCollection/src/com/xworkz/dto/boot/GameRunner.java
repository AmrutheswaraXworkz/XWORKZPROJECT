package com.xworkz.dto.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.app.dto.GameDTO;

public class GameRunner {

	public static void main(String[] args) {
		GameDTO game1 = new GameDTO(1, "PUBG", 100, 25, LocalDate.of(2023, 10, 22), "Amruth", "Gagan", 1.5);
		GameDTO game2 = new GameDTO(2, "Chess", 50, 20, LocalDate.of(2023, 11, 15), "Alice", "Bob", 2.0);
		GameDTO game3 = new GameDTO(3, "Soccer", 200, 30, LocalDate.of(2023, 9, 8), "Elena", "David", 1.8);
		GameDTO game4 = new GameDTO(4, "Basketball", 150, 28, LocalDate.of(2023, 12, 5), "Frank", "Grace", 2.2);
		GameDTO game5 = new GameDTO(5, "Tennis", 60, 20, LocalDate.of(2023, 8, 19), "Hannah", "Ian", 1.7);
		GameDTO game6 = new GameDTO(6, "Golf", 40, 22, LocalDate.of(2023, 7, 14), "Julia", "Kevin", 2.5);
		GameDTO game7 = new GameDTO(7, "Baseball", 80, 24, LocalDate.of(2023, 11, 3), "Liam", "Mia", 2.3);
		GameDTO game8 = new GameDTO(8, "Table Tennis", 30, 15, LocalDate.of(2023, 10, 1), "Noah", "Olivia", 1.9);
		GameDTO game9 = new GameDTO(9, "Volleyball", 120, 27, LocalDate.of(2023, 8, 28), "Oliver", "Sophia", 2.1);
		GameDTO game10 = new GameDTO(10, "Badminton", 70, 21, LocalDate.of(2023, 9, 12), "Zoe", "William", 1.6);

		Collection<GameDTO> games = Stream.of(game1, game2, game3, game4, game5, game6, game7, game8, game9, game10)
				.collect(Collectors.toList());
		System.err.println("sorted using name ascending");
		Comparator<GameDTO> nameAsc = (t1, t2) -> t1.getName().compareTo(t2.getName());
		games.stream().sorted(nameAsc).forEach(c -> System.out.println(c));

		System.err.println("sorted using name descending");
		Comparator<GameDTO> nameDsc = (t1, t2) -> t2.getName().compareTo(t1.getName());
		games.stream().sorted(nameDsc).forEach(c -> System.out.println(c));

		System.err.println("sorted using points ascending");
		Comparator<GameDTO> pointsAsc = (t1, t2) -> t1.getPoints().compareTo(t2.getPoints());
		games.stream().sorted(pointsAsc).forEach(c -> System.out.println(c));

		System.err.println("sorted using points descending");
		Comparator<GameDTO> pointsDsc = (t1, t2) -> t2.getPoints().compareTo(t1.getPoints());
		games.stream().sorted(pointsDsc).forEach(c -> System.out.println(c));

		System.err.println("sorted using eventDate ascending");
		Comparator<GameDTO> dateAsc = (t1, t2) -> t1.getEventDate().compareTo(t2.getEventDate());
		games.stream().sorted(dateAsc).forEach(c -> System.out.println(c));

		System.err.println("sorted using eventDate descending");
		Comparator<GameDTO> dateDsc = (t1, t2) -> t2.getEventDate().compareTo(t1.getEventDate());
		games.stream().sorted(dateDsc).forEach(c -> System.out.println(c));

		System.err.println("sorting with both name and points ascending");
		Comparator<GameDTO> temp = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Comparator<GameDTO> namePoints = temp.thenComparing((t1, t2) -> t1.getPoints().compareTo(t2.getPoints()));
		games.stream().sorted(namePoints).forEach(p -> System.out.println(p));

		System.err.println("sorting based on name,points and event date");
		Comparator<GameDTO> temp1 = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Comparator<GameDTO> temp2 = temp1.thenComparing((t1, t2) -> t1.getPoints().compareTo(t2.getPoints()));
		Comparator<GameDTO> namePointsDate = temp2
				.thenComparing((t1, t2) -> t1.getEventDate().compareTo(t2.getEventDate()));
		games.stream().sorted(namePointsDate).forEach(npd -> System.out.println(npd));

		System.err.println("sorting based on duration,date and id");
		Comparator<GameDTO> temp3 = (t1, t2) -> t1.getDuration().compareTo(t2.getDuration());
		Comparator<GameDTO> temp4 = temp3.thenComparing((t1, t2) -> t1.getEventDate().compareTo(t2.getEventDate()));
		Comparator<GameDTO> durationDateId = temp4.thenComparing((t1, t2) -> t1.getId().compareTo(t2.getId()));
		games.stream().sorted(durationDateId).forEach(npd -> System.out.println(npd));

		System.err.println("collecting only duration in descending");
		Comparator<GameDTO> duration = (t1, t2) -> t2.getDuration().compareTo(t1.getDuration());
		Collection<GameDTO> durationCollection = games.stream().sorted(duration).collect(Collectors.toList());
		durationCollection.stream().sorted(duration).map(c -> c.getDuration()).forEach(c -> System.out.println(c));

		System.err.println("collecting only using names");
		Collection<String> gameNames = games.stream().map(n -> n.getName()).collect(Collectors.toList());
		gameNames.stream().forEach(c -> System.out.println(c));

		System.err.println("collecting winner name and sort in descending");
		Comparator<GameDTO> name = (t1, t2) -> t2.getWinner().compareTo(t1.getWinner());
		Collection<GameDTO> nameDuration = games.stream().sorted(name).collect(Collectors.toList());
		nameDuration.stream().map(c -> c.getWinner()).forEach(c -> System.out.println(c));

		System.err.println("collecting only using runner up name");
		Collection<String> runnerUp = games.stream().map(n -> n.getRunnerUp()).collect(Collectors.toList());
		runnerUp.stream().forEach(c -> System.out.println(c));

		System.err.println("find game by name");
		games.stream().filter((c) -> c.getWinner().equals("Amruth")).forEach(c -> System.out.println(c.getName()));

		System.err.println("find game by event date");
		games.stream().filter((c) -> c.getEventDate().equals(LocalDate.of(2023, 8, 19)))
				.forEach(c -> System.out.println(c.getName()));

		System.err.println("find game by event date");
		games.stream().filter((c) -> c.getEventDate().equals(LocalDate.of(2023, 8, 19)))
				.forEach(c -> System.out.println(c.getName()));

		System.err.println("find Winner by game");
		games.stream().filter((c) -> c.getName().equals("PUBG")).forEach(c -> System.out.println(c.getWinner()));

		System.err.println("find point by game");
		games.stream().filter((c) -> c.getName().equals("Volleyball")).forEach(c -> System.out.println(c.getPoints()));

	}
}
