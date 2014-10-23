package restTemplate.blabla;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;

import javax.xml.transform.stream.StreamSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.oxm.Unmarshaller;

/**
 * Hello world!
 *
 */
public class App {
	private Unmarshaller unmarshaller;
	private String casa;
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/main/resources/spring/context.xml");
		App s = (App) ctx.getBean("springApp");
		System.out.println(s.getCasa());
		s.process();
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public void process() throws Exception {
		String name = "source.xml";
		File f = new File("src/main/resources/spring/" + name);
		FileInputStream fis = new FileInputStream(f);
		LicensePostResult lp = (LicensePostResult) getUnmarshaller().unmarshal(new StreamSource(fis));
		System.out.println(lp);
	}

	public Unmarshaller getUnmarshaller() {
		return unmarshaller;
	}

	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}
}
