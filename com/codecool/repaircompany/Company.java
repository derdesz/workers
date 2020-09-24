package com.codecool.repaircompany;

import com.codecool.repaircompany.worker.*;
import java.util.*;

public class Company {


    private Set<Worker> workers;
    private String nameOfWorkerStayingAtTheOffice;
    private Double balance;


    public Company() {
        this.workers = new HashSet<>();
        balance = 0.0;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public Double calculateDailyRevenue() {

        for (Worker worker : workers) {
            if (worker.isWorkday() && nameOfWorkerStayingAtTheOffice != worker.getName()) {
                balance += worker.calculateDailyRevenueForCompany();
            }
        }
        return balance;
    }

    public Double calculateMontyExpenses() {
        for (Worker worker : workers) {
            if (worker.getExperienceLevel().equals(ExperienceLevel.BEGINNER)) {
                balance -= ExperienceLevel.BEGINNER.getMonthlyExpense();
            } else if (worker.getExperienceLevel().equals(ExperienceLevel.MEDIUMLEVEL)) {
                balance -= ExperienceLevel.MEDIUMLEVEL.getMonthlyExpense();
            } else {
                balance -= ExperienceLevel.EXPERT.getMonthlyExpense();
            }
        }
        return balance;
    }


    public String setNameOfWorkerStayingAtTheOffice() {
        PrimitiveIterator.OfInt randInt = new Random().ints(0, workers.size() -1).iterator();

        while (true) {
            Worker worker = (Worker) Arrays.asList(workers.toArray()).get(randInt.nextInt());
            if (!worker.isWorkday()) {
                return (nameOfWorkerStayingAtTheOffice = worker.getName());
            }
        }
    }


    public Double calculateThreeMonthsOfRevenue() {
        for (int i = 0; i < 90; i++) {
            setNameOfWorkerStayingAtTheOffice();
            calculateDailyRevenue();
            if (i % 30 == 0) {
                calculateMontyExpenses();
            }
        }
        return balance;
    }
}