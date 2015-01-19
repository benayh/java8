package com.my;

public class Deneme {

	public static void main(String[] args) {
		
		//enum iteration
		
		for (MyEnum e : MyEnum.values())
			System.out.println(e + " : " + e.getValue());
			
	}

}
