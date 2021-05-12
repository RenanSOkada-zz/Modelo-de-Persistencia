
public class Aluno {
	
	private String Matricula;
	private String CPF;
	private String DataNascimento;
	private String Email;
	
	public Aluno() {
		
	}
	
	public Aluno( String Matricula,	String CPF, String DataNascimento, String Email) {
		setMatricula(Matricula);
		setCPF(CPF);
		setDataNascimento(DataNascimento);
		setEmail(Email);
						
	}
	
	public String getMatricula() {
		return Matricula;
	}
	public String getCPF() {
		return CPF;
	}
	public String getDataNascimento() {
		return DataNascimento;
	}
	public String getEmail() {
		return Email;
	}
	public void setMatricula(String matricula) {
		if(matricula.length()>0)
		Matricula = matricula;
	}
	public void setCPF(String cPF) {
		if(cPF.length()>0)
		CPF = cPF;
	}
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.length()>0)
		DataNascimento = dataNascimento;
	}
	public void setEmail(String email) {
		if(email.length() > 0)
		Email = email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [Matricula=");
		builder.append(Matricula);
		builder.append(", CPF=");
		builder.append(CPF);
		builder.append(", DataNascimento=");
		builder.append(DataNascimento);
		builder.append(", Email=");
		builder.append(Email);
		builder.append("]");
		return builder.toString();
	}
	
	

}
