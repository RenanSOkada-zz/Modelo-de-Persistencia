import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AlunoCSV {
	
	public void gravar(Aluno alu) {
		FileWriter arq;
		PrintWriter gravarArq;
		try {
			arq = new FileWriter("aluno.csv");
			gravarArq = new PrintWriter(arq);
			gravarArq.printf("%d;%s\n", alu.getCPF(), alu.getDataNascimento(), alu.getEmail(), alu.getMatricula(), alu.getNome());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
