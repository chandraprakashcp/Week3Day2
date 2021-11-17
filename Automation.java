package week3.day2;

public class Automation extends MultipleLangauge implements TestTool,Language{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation aut=new Automation();
		aut.python();
		aut.ruby();
		aut.Java();
		aut.Selenium();
	}

	@Override
	void ruby() {
		// TODO Auto-generated method stub
		System.out.println("The unimplemented method or abstract class has been extends to Automation class");
	}


}
