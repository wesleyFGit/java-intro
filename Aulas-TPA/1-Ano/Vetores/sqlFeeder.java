import java.util.*;
public class MyClass {
  public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    Random gerador = new Random();
    int linhasSql,Nnomes,Tnome,Tid,i,j,k,n,m;
    String TabelaSql,ColunasSql;
    
    //var para ativar as Tabelas
	Tnome = 0;
	Tid = 0;
	
	Nnomes = 6;
    int Nid=1;
    //nomes de pessoas possiveis
    String[] nomes = {"Ana","Maria","Lucas","Kevin","Thayani","Wesley"};
	
	//entradas
	System.out.println("digite o nome da sua tabela sql");
  	TabelaSql = ler.nextLine();
    System.out.println("digite o nome das colunas Ex(id,nome,cor,cidade,pais,estado,uf,rg,cpf,cnpj,numero)");
    ColunasSql = ler.nextLine();
    System.out.println("digite a quantidade de linhas da sua tabela sql");
	linhasSql = ler.nextInt();
	
	//saida
	System.out.println("insert into " + TabelaSql + " ("+ ColunasSql +")");
    
	for(i=0;i<=(linhasSql-1);i++){
	    int numero = gerador.nextInt(Nnomes);
	    System.out.print("(");
    	if (Nid < 10){
    	    System.out.print("0"+Nid);
    	}else{
    	    System.out.print(Nid);
    	}
    	Nid++;
    	System.out.print(",");
    	System.out.print("'"+nomes[numero]+"'");
	    System.out.println("),");
	}
	
	
	
	
	
    //crtl + z ...
    
    // saida nome 'nome' 
    System.out.println("'"+nomes[0]+"'");
    
    // saida id 01 - 99
    for (Nid=1;Nid<=(linhasSql);Nid++){
    	if (Nid < 10){
    	    System.out.print("0"+Nid);
    	}else{
    	    System.out.print(Nid);
    	}
    }
	
	
  }
}
