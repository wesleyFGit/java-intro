package projetoAcademiaDs;
import java.util.*;

public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//Aluno 
		Aluno a1 = new Aluno();
		
		a1.setId(1);
		a1.setNome("Lucas Maciel Garcia Oliveira");
		a1.setIdade(16);
		a1.setGenero("Masculino");
		a1.setCpf("123.123.123-12");
		a1.setEmail("lulm@gmail.com");
		a1.setTelefone("55+ (11) 94523-4244");
		a1.setEndereco("nãosei");
		a1.setStatusAluno("Ativo");

		//Instrutor 
		Instrutor i1 = new Instrutor();
		
		i1.setId(1);
		i1.setNome("Fortim");
		i1.setEspecialidade("Musculação");
		i1.setPeriodo("Manhã");
		i1.setGenero("Masculino");
		i1.setIdade(41);
		i1.setTelefone("14+ (14) 91414-1414");
		i1.setEmail("Fortim@gamil.com");;
		i1.setCpf("141.414.141-14");
		
		
		// matricula 
		Matricula m1 = new Matricula();
		
		m1.setId(1);
		m1.setPlano("Mensal");
		m1.setValorPlano("RS 75,00");
		m1.setIdAluno(1);
		m1.setidInstrutor(1);
		
		
		// fim banco de dados
		System.out.println("Novo aluno");
        System.out.println("digite o nome do novo(a) aluno");
        String nome = ler.next();
        System.out.println("digite o gênero do novo(a) aluno");
        String genero = ler.next();
        System.out.println("digite a idade do novo(a) aluno");
        int idade = ler.nextInt();
        System.out.println("digite o CPF do novo(a) aluno");
        String cpf = ler.next();
        System.out.println("digite o email do novo(a) aluno");
        String email = ler.next();
        System.out.println("digite o telefone do novo(a) aluno");
        String telefone = ler.next();
        System.out.println("digite o endereço do novo(a) aluno");
        String endereco = ler.next();
        

        Aluno aNovo = new Aluno();

        aNovo.setId(2);
        aNovo.setNome(nome);
        aNovo.setIdade(idade);
        aNovo.setGenero(genero);
        aNovo.setCpf(cpf);
        aNovo.setEmail(email);
        aNovo.setTelefone(telefone);
        aNovo.setEndereco(endereco);
        aNovo.setStatusAluno("Ativo");
        
        System.out.println("digite o Plano do novo(a) aluno");
        System.out.println("Planos disoniveis: 1 - Mensal - 75,00, 2 - Trimestral - 210,00, 3 - Anual - 635,00");
        int plano = ler.nextInt();
        int j = 0;
        String planoNovo = "a";
        for(int i = 0; j < 1; i ++) {
            if(plano == 1) {
            	planoNovo = "Mensal";
            	j = 1;
            }else if (plano == 2) {
            	planoNovo = "Trimestral";
            	j = 1;
            }else if (plano == 3) {
            	planoNovo = "Anual";
            	j = 1;
            }else if (plano > 3) {
            	System.err.println("Digite um numero de 1 a 3");
            	plano = ler.nextInt();
            }
        }
        j = 0;
        String precoNovo = "a";
        if(plano == 1) {
        	precoNovo = "R$ 75,00";
        	j = 1;
        }else if (plano == 2) {
        	precoNovo = "R$ 210,00";
        	j = 1;
        }else if (plano == 3) {
        	precoNovo = "R$ 635,00";
        	j = 1;
        }
        
        Matricula mNovo = new Matricula();
        
        mNovo.setId(2);
        mNovo.setPlano(planoNovo);
        mNovo.setValorPlano(precoNovo);
        mNovo.setIdAluno(2);
		mNovo.setidInstrutor(1);
		

        System.out.println("Seu novo(a) aluno(a) Foi cadastrado com sucesso!");
        System.out.print("plano - "+planoNovo+", ");
        System.out.print("valor - "+precoNovo);
		
		
		
	}

}
