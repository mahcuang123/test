package com.woniu.demo;

public enum Color  {
	Red,Yello,Blue;
	public static void select(Guides g) {
		switch(g) {
		case One:
			System.out.println("成绩为100-90等");
			break;
		case Two:
			System.out.println("成绩为90-85等");
			break;
		case Tree:
			System.out.println("成绩为85-70等");
			break;
		case Four:
			System.out.println("成绩为60下等");
			break;
		}
	}
}
