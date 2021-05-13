import java.io.IOException;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Aluno al1 = new Aluno("123424","2341234", "12/05", "qweqwe@gmais.com", "Rafael");
		System.out.println(al1);
	
		JSON ArmaJson = new JSON ();
		ArmaJson.ArmazenarJSON("123424","2341234", "12/05", "qweqwe@gmais.com", "Rafael");
		ArmaJson.toString();
	}
}
