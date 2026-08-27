package in.co.oop.encapsulation;

public class Teststudent {
	public static void main(String[] args) {
  Student st = new Student();
  
  st.setName("Saharsh chouhan");
  st.setStudentId(101);
  st.setMobileNo("9770743605");
  st.setEmail("schouhan@email.com");
  st.setCourse("BBA");
  
  System.out.println("Name = "+st.getName());
  System.out.println("Student id = "+st.getStudentId());
  System.out.println("Mobile no = "+st.getMobileNo());
  System.out.println("Email id = "+st.getEmail());
  System.out.println("Course = "+st.getCourse());
}
}
