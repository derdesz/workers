package com.codecool.repaircompany.worker;

import com.codecool.repaircompany.ExperienceLevel;

public class GasFitter extends WorkerWithDanger {

    public static final int CHANCE_FOR_JOB = 65;

    public GasFitter(String name, Double dailyFee, ExperienceLevel experienceLevel) {
        super(name, dailyFee, experienceLevel);
    }

    @Override
    public void setChanceForJob() {
        super.chanceForJob = CHANCE_FOR_JOB;
    }


}