package com.codecool.repaircompany;

import com.codecool.repaircompany.worker.Electrician;
import com.codecool.repaircompany.worker.GasFitter;
import com.codecool.repaircompany.worker.Plumber;

public class Main {

    public static void main(String[] args) {
        
        Company company = new Company();

        Plumber plumber = new Plumber("Bence", (double) 200000, ExperienceLevel.MEDIUMLEVEL);
        Electrician electrician = new Electrician("Benec", (double) 300000, ExperienceLevel.EXPERT);
        GasFitter gasFitter = new GasFitter("Árpi", (double) 150000, ExperienceLevel.BEGINNER);

        company.addWorker(plumber);
        company.addWorker(electrician);
        company.addWorker(gasFitter);

        System.out.println(company.calculateThreeMonthsOfRevenue());


    }
}
