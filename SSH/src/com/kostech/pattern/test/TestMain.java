package com.kostech.pattern.test;

public class TestMain {

	public static void main(String[] args) {
		HappyPeopleNew hpna=new PassengerByAirplane();
		hpna.celebrateSpringFestival();
		
		HappyPeopleNew hpnt=new PassengerByTrain();
		hpnt.celebrateSpringFestival();
		
		HappyPeopleNew hpnb=new PassengerByBus();
		hpnb.celebrateSpringFestival();
	}
}
