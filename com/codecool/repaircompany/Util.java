package com.codecool.repaircompany;

import com.codecool.repaircompany.worker.*;

import java.util.Random;

public class Util {


	public static Boolean calculateJobChance(Integer chanceforJob) {
		return new Random().nextInt(101) >= chanceforJob;
	}

}