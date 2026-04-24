package projetoAcademiaDs;
import heranca.Pessoa;

public class Instrutor extends Pessoa {
	public int id;
    private String especialidade;
    private String email;
    private String telefone;
    private String periodo;

    //publico
    public void setId(int id) {
		this.id = id;
	}
	//privados
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
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
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


}