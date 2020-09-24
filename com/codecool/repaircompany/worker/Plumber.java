package com.codecool.repaircompany.worker;

import com.codecool.repaircompany.ExperienceLevel;

public class Plumber extends Worker {

    public static final int CHANCE_FOR_JOB = 80;

    public Plumber(String name, Double dailyFee, ExperienceLevel experienceLevel) {
        super(name, dailyFee, experienceLevel);
    }

    @Override
    public void setChanceForJob() {
        super.chanceForJob = CHANCE_FOR_JOB;
    }


}