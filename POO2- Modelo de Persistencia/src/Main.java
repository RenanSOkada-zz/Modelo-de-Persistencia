import java.io.IOException;
import java.util.Iterator;



public class Main {

	public static void main(String[] args) {
		
		
		Aluno alu = new Aluno("123424","2341234", "12/05", "qweqwe@gmais.com", "Rafael");
		
		AlunoCSV a_csv = new AlunoCSV();
		AlunoPersist persist = new AlunoPersist(a_csv);
		persist.gravar(alu);
		
		AlunoJSON a_json = new AlunoJSON();
		persist = new AlunoPersist(a_json);
		persist.gravar(alu);
		
		AlunoXML a_xml = new AlunoXML();
		persist = new AlunoPersist(a_xml);
		persist.gravar(alu);
		
	}
}
