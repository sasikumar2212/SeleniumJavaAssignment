package abstractwithinheritance;

public class Automation extends MultipleLangauge implements TestTool {

	public static void main(String[] args) {
		Automation a = new Automation();
		a.Java();
		a.Selenium();
		a.python();
		a.ruby();
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Language");
	}

	@Override
	public void Java() {
		System.out.println("Java Language");
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium Frameword/ tool/api");
	}

	
}
