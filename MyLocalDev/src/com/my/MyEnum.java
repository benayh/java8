package com.my;

public enum MyEnum {

	A(1),
	B(2),
	C(3);
    
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
