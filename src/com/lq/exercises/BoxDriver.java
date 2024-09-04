package com.lq.exercises;

public class BoxDriver {

	public BoxDriver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Box box1 = new Box (5,6,7);
		Box box2 = new Box (10,10,10);
		
		System.out.println("Box 1 length is " + box1.getLength());
		System.out.println("Box 1 width is " + box1.getWidth());
		System.out.println("Box 1 height is " + box1.getHeight());	
		System.out.println("Box 2 length is " + box2.getLength());
		System.out.println("Box 2 width is " + box2.getWidth());
		System.out.println("Box 2 height is " + box2.getHeight());
		
		box1.setLength(3);
		box1.setWidth(4);
		box1.setHeight(5);
		
		System.out.println("Now box 1 length is " + box1.getLength());
		System.out.println("Now box 1 width is " + box1.getWidth());
		System.out.println("Now box 1 height is " + box1.getHeight());
		
		System.out.println("Now box 1 volume is " + box1.getVolume());
		System.out.println("Now box 1 surface area is " + box1.getSurfaceArea());
		
		box1.printBox();
		
		box1.setLength(-5);
		box1.printBox();
	}

}
