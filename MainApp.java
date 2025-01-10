package com.innerclasses;

public class MainApp {
 public static void main(String[] args) {
	OuterClass o=new OuterClass();
	o.funOuter();
	
	OuterClass.InnerClass in=o.new InnerClass();
	in.funInner();
}
}
