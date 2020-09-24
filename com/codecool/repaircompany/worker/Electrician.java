package com.codecool.repaircompany.worker;

import com.codecool.repaircompany.ExperienceLevel;

public class Electrician extends WorkerWithDanger {

    public static final int CHANCE_FOR_JOB = 90;

    public Electrician(String name, Double dailyFee, ExperienceLevel experienceLevel) {
        super(name, dailyFee, experienceLevel);
    }

    @Override
    public void setChanceForJob() {
        super.chanceForJob = CHANCE_FOR_JOB;
    }


}