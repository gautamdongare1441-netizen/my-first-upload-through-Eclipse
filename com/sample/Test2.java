package com.sample;

public class Test2 {

	public static void main(String[] args) {
		Student2 st= new Student2();
		st.rNo= 11;
		st.name= "Gautam";
		st.mks= 75.60f;

		st.study();
		st.displymks();

		Student2 st2= new Student2();
		st2.rNo=21;
		st2.name="Jay";
		st2.mks=80f;

		st2.study();
		st.displymks();
		
		Student2 st3= new Student2();
		st3.rNo=31;
		st3.name="Ram";
		st3.mks=91.03f;
		
		st3.study();
		st.displymks();
		
		Student2 st4= new Student2();
		st4.rNo=40;
		st4.name="Amol";
		st4.mks=85f;
		
		
		st4.study();
		st.displymks();
				
		

	}

}
