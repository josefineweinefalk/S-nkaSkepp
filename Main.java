package sankaskepp;

import java.util.Scanner;

public class P extends RunGame {
	private static Scanner scan = new Scanner(System.in);
	private static boolean gameEnded;
	private static boolean playerWon;
	private static double playerShots;
	private static double computerShots;
	private static String playerName;
	protected static long p1Time;

	public static void main(String[] args) {
		fillGrid();
		createList();
		playerPlaceShips();
		compPlaceShips();
		System.out.println();

		while (!gameEnded) {
			playerTurn();
			if (allShipsSinked()) {
				System.out.println("Du har sänkt alla spelaren skepp!");
				playerWon = true;
				break;
			}
			computerTurn();
			if (allShipsSinked()) {
				System.out.println("Spelare2 sänkte alla dina skepp!");
				break;
			}
		}
		if (playerWon) {
			System.out.println("Du vann över spelaren!");
			System.out.println("Du slog datorn på " + Math.round(playerShots) + " rundor!");
			System.out.println();
		} else {
			System.out.println();
			System.out.println("Spelaren vann över dig på " + Math.round(computerShots) + " rundor!");
		}
	}
