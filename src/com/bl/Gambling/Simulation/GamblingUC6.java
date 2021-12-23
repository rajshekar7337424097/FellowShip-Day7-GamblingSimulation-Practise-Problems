package com.bl.Gambling.Simulation;

public class GamblingUC6 {
	static int bet = 1;
	static int daysInMonth = 31;
	static int indexLuckiest = 0;
	static int indexUnLuckiest = 0;
	static int win[];
	static int loss[];
	public static void main(String[] args) {


		for (int day = 1; day <= daysInMonth; day++) {
			int winCount = 0;
			int lossCount = 0;
			int stake = 100;
			System.out.println("Loop" + (day+1));
			while (stake != 50 && stake != 150) {
				double betCheck = Math.floor(Math.random() * 10) % 2;
				if (betCheck == 1) {
					stake = stake + bet;
					winCount = winCount + 1;
				} else {
					stake = stake - bet;
					lossCount = lossCount + 1;
				}
			}
			System.out.println("Wins for day " + (day + 1) + ":" + winCount);
			System.out.println("Losses for day " + (day + 1) + ":" + lossCount);

			if (day > 0) {
				if (lossCount > MaximizeAction(loss)) {
					indexUnLuckiest = day;
				}
				if (winCount > MaximizeAction(win)) {
					indexLuckiest = day;
				}
			}
			loss[day] = lossCount;
			win[day] = winCount;
			System.out.println("Luckiest day is - Day " + (indexLuckiest + 1) + " with " + win[indexLuckiest] + " Wins");
			System.out.println("Unluckiest day is - Day " + (indexUnLuckiest + 1)  + " with " + loss[indexUnLuckiest] + " Losses");
		}

	}
	private static int MaximizeAction(int[] win2) {
		
		return 0;
	}
}
