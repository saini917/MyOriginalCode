package com.coachingProgram;

public class ChintiQuestion {
	int dailyDistance;
	int totalDistance;
	int maxDayReached;

	// one approach
	public ChintiQuestion(int totalDistance, int dailyDistance) {
		this.dailyDistance = dailyDistance;
		this.totalDistance = totalDistance;
		maxDayReached = totalDistance / dailyDistance;
		System.out.println("Maximum reached day:" + maxDayReached);
	}

	// 2nd approach
	public ChintiQuestion(int totalDistance, int dailyDistance, int afterDecimal) {
		int d = totalDistance / dailyDistance;

		// Now one by print digits after dot
		for (int i = 0; i <= afterDecimal; i++) {
			System.out.print(d);
			totalDistance = totalDistance - (dailyDistance * d);
			if (totalDistance == 0)
				break;
			totalDistance = totalDistance * 10;
			d = totalDistance / dailyDistance;
			if (i == 0)
				System.out.print(".");
		}
	}

	public static void main(String str[]) {
		new ChintiQuestion(80, 3);
		new ChintiQuestion(80, 3, 3);

	}

}
