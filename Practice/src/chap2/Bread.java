package chap2;

public class Bread {

	public static void main(String[] args) {
		// 빵 25개를 4명이 나눠가질 경우 각자의 몫과 남은 빵의 개수
		
		 int bread=25;
		 int person=4;
		 
		 int mok=bread/person;
		 int na=bread%person;
		 
		 System.out.println("몫:"+mok);
		 System.out.println("나머지:"+na);

	}

}
