import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class AlunoJSON {
	
public void gravar(Aluno alu) {
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer;
		try {
			writer = new FileWriter("aluno.json ");
			writer.write(gson.toJson(alu));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
