package com.my;

public class Deneme {

	public static void main(String[] args) {
		
		//print all enum values
		
		for (MyEnum e : MyEnum.values())
			System.out.println(e.name() + " : " + e.getValue());
			
	}

}
