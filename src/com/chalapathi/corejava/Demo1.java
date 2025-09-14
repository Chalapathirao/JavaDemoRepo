package com.chalapathi.corejava;

import javax.swing.SingleSelectionModel;
import javax.swing.event.ChangeListener;

public class Demo1 implements Runnable, SingleSelectionModel {

	public Demo1() {
		System.out.println("constructor executed"); 
	}
	 {
		System.out.println("instance block is invoked");
		//System.exit(0);
	}
	static {
		System.out.println("static block is invoked");
		//System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println(10 + 20 + "Javatpoint");
		Demo1 demo1=new Demo1();
		Demo1 demo2=new Demo1();
		//System.exit(0);
		//System.out.println("Javatpoint" + 10 + 20);
	}

	@Override
	public int getSelectedIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSelectedIndex(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearSelection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addChangeListener(ChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeChangeListener(ChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
