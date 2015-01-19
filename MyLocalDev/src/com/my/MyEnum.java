package com.my;

public enum MyEnum {

	A(1),
	B(2),
	C(3),
	D(4),
	E(5),
	F(6);
    
	private int value;
	
	MyEnum(int a) {
	  
		this.value=a;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
