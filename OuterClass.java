package com.innerclasses;

public class OuterClass {
 private int old;
  public void funOuter() {
	 System.out.println("Fuction from outer class");
 }
 public class InnerClass {
	 private int inId;
	 public void funInner() {
		 System.out.println("Outer Class Variable"+old);
		 System.out.println("Inner Class Variable"+inId);
	 }
 }
}
