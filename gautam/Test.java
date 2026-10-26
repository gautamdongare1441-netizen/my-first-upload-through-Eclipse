package gautam;
import java.lang.*;
public class Test {

	public static void main(String[] args) {
		
student st= new student();
st.rNo= 11;
st.name= "Gautam";
st.mks= 75.60f;

st.study();
st.displymks();

student st2= new student();
st2.rNo=21;
st2.name="Jay";
st2.mks=80f;

st2.study();
st.displymks();
	}

}
