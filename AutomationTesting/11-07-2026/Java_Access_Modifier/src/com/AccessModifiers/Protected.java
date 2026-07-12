package com.AccessModifiers;

public class Protected extend B{
	Protected obj = new protected();
	int output = obj.z();
	System.out.println("value of z is : " + output);
	obj.protectedMethod();
}
