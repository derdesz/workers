package com.codecool.repaircompany.worker;

import com.codecool.repaircompany.ExperienceLevel;

public abstract class WorkerWithDanger extends Worker {

	private boolean isOnHoliday;

	public WorkerWithDanger(String name, Double dailyFee, ExperienceLevel experienceLevel) {
		super(name, dailyFee, experienceLevel);
		this.isOnHoliday = false;
	}

	public void setIsOnHoliday() {
		isOnHoliday = true;
	}


}