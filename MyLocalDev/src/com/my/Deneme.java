package com.my;

public class Deneme {

	public static void main(String[] args) {
		
		System.out.println("Deneme");

		System.out.println(MyEnum.A);
		
		MyEnum x = MyEnum.A;
		
		if (MyEnum.A == x)
			System.out.println("equal");
		
		for (MyEnum e : MyEnum.values())
			System.out.println(e.name() + " : " + e.getValue());
			
	}

}
