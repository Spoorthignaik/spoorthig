package com.xworkz.things.boot;

import com.xworkz.things.Cardiologist;
import com.xworkz.things.Dentist;
import com.xworkz.things.Doctor;
import com.xworkz.things.ENT;

public class DoctorRunner {

	public static void main(String[] args) {
		
		Doctor doctor=new Doctor();
		System.out.println(doctor.name);
		System.out.println(doctor.salary);
		
		Doctor doctor1=new Dentist();
		Dentist dentist=(Dentist)doctor1;
		System.out.println(dentist.age);
		System.out.println(dentist.workingHours);
		System.out.println(dentist.name);
		System.out.println(dentist.salary);
		
		Doctor doctor2=new ENT();
		ENT ent=(ENT)doctor2;
		System.out.println(ent.experienced);
		System.out.println(ent.gender);
		System.out.println(ent.name);
		System.out.println(ent.salary);
		
		
		Doctor doctor3=new Cardiologist();
		Cardiologist cardiologist=(Cardiologist)doctor3;
		System.out.println(cardiologist.appointment);
		System.out.println(cardiologist.fee);
		System.out.println(cardiologist.name);
		System.out.println(cardiologist.salary);
		
		
	}

}
