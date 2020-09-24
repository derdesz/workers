package com.codecool.repaircompany;

public enum ExperienceLevel {
	BEGINNER(0.4, 50000),
	MEDIUMLEVEL(0.3, 35000),
	EXPERT(0.2, 25000);

	private final double remainingRevenuePercentageForCompany;
	private final int monthlyExpense;

	ExperienceLevel(double remainingRevenuePercentageForCompany, int monthlyExpense) {
		this.remainingRevenuePercentageForCompany = remainingRevenuePercentageForCompany;
		this.monthlyExpense = monthlyExpense;
	}

	public double getRemainingRevenuePercentageForCompany() {
		return remainingRevenuePercentageForCompany;
	}

	public int getMonthlyExpense() {
		return monthlyExpense;
	}
}