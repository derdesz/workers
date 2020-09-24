package com.codecool.repaircompany.worker;

import com.codecool.repaircompany.Company;
import com.codecool.repaircompany.ExperienceLevel;
import com.codecool.repaircompany.Util;

public abstract class Worker {

    private final String name;
    private final Double dailyFee;
    private final ExperienceLevel experienceLevel;
    protected Integer chanceForJob;
    private Company company;
    private String theOneWhoStaysAtTheOffice;



    public Worker(String name, Double dailyFee, ExperienceLevel experienceLevel) {
        this.name = name;
        this.dailyFee = dailyFee;
        this.experienceLevel = experienceLevel;
        setChanceForJob();
    }

    public Double calculateDailyRevenueForCompany() {
        return (this.dailyFee * experienceLevel.getRemainingRevenuePercentageForCompany());
    }

    public abstract void setChanceForJob();


    public Integer getChanceForJob() {
        return chanceForJob;
    }

    public String getName() {
        return name;
    }

    public boolean isWorkday() {
        return Util.calculateJobChance(getChanceForJob());
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public void getNameOfWorkerStayingAtTheOffice() {
         this.theOneWhoStaysAtTheOffice = company.setNameOfWorkerStayingAtTheOffice();
    }
}