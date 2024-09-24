package com.chalapathi.designpattern.factory;

public class FactoryPatternMainClass {
	
	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession doc = professionFactory.getProfession("Doctor");
		doc.print();

		Profession eng = professionFactory.getProfession("Engineer");
		eng.print();
		Profession teacher = professionFactory.getProfession("Teacher");
		teacher.print();
	}

}
