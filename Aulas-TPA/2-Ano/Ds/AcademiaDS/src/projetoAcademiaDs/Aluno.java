package projetoAcademiaDs;
import heranca.Pessoa;

public class Aluno extends Pessoa {
	public int id;
	private String email;
	private String telefone;
	private String statusAluno;
	
    //publico
    public void setId(int id) {
		this.id = id;
	}
	//privados
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getStatusAluno() {
		return statusAluno;
	}
	public void setStatusAluno(String statusAluno) {
		this.statusAluno = statusAluno;
	}
}
