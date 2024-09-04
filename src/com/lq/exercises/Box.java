package com.lq.exercises;

public class Box {
	private double height;
	private double width;
	private double length;

	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	Box (double side){
		this(side, side, side);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getVolume() {
		return length*width*height;
	}
	
	public double getSurfaceArea() {
		return ((length*width+length*height+width*length)*2);
	}
	
	void printBox() {
		if (length<=0 || width<=0 || height<=0) {
			System.out.println("Wrong");
		}
		else {
			System.out.println("Length = " + length);
			System.out.println("Width = " + width);
			System.out.println("Height = " + height);
			System.out.println("Volume = " + getVolume());
			System.out.println("Surface Area = " + getSurfaceArea());
		}
	}

}
