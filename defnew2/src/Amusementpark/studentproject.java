package Amusementpark;

import java.util.ArrayList;

public class studentproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Studentinfo> stuInfoarray = new ArrayList<Studentinfo>(); 
		
		Studentinfo st = new Studentinfo();
		st.name = "kopo";
		st.id= 123123;
		st.birth=960404;
		st.address ="서울특별시 분당구 성북동";
		st.score = 4.5;
		st.bloodtype ='B';
		
		stuInfoarray.add(st);
		
		st = new Studentinfo();
		st.name = "kopo";
		st.id= 123123;
		st.birth=960404;
		st.address ="서울특별시 분당구 성북동";
		st.score = 4.5;
		st.bloodtype ='B';
		
		stuInfoarray.add(st);
		
		
		
	}

}
