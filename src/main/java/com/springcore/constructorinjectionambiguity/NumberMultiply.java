package com.springcore.constructorinjectionambiguity;

public class NumberMultiply {

	private int num1;
	private int num2;

	public NumberMultiply(double num1, double num2) {

		System.out.println("Double constructor is called");

		this.num1 = (int) num1;
		this.num2 = (int) num2;

	}

	public NumberMultiply(int num1, int num2) {

		System.out.println("Integer constructor is called");

		this.num1 = num1;
		this.num2 = num2;

	}

	public NumberMultiply(String num1, String num2) {

		System.out.println("String constructor is called");

		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);

	}

	@Override
	public String toString() {
		return "NumberMultiply [num1=" + num1 + ", num2=" + num2 + "]";
	}

}
