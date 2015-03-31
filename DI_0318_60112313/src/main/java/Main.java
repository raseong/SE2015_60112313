import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Professor professor = new Professor("choi");
		//Lecture lecture = new Lecture("소프트웨어 공학");
		//Student student = new Student("기라성");


		ApplicationContext factory = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		
		DAO dao = (DAO)factory.getBean("dao");
		CGwamokManager gwamokManager = (CGwamokManager)factory.getBean("gwamokManager");
		EGwamok gwamok = (EGwamok)factory.getBean("gwamok");
	
		gwamokManager.gaeseol(gwamok);
		// 과목개설 되었습니다.
		/* 숙제 : 강의에 학생 추가하는 것
		Professor professor = (Professor)factory.getBean("professor");
		Lecture lecture2 = (Lecture)factory.getBean("lecture2");
		Student student = (Student)factory.getBean("student");

		professor.addLecture(lecture2);
		professor.showLecture();
		lecture2.Register(student);
		lecture2.showStudent();
		 */


	}

}
