import java.util.*;
public class MyClass {
  public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    Random gerador = new Random();
    int linhasSql,Nnomes,i,j,k,n,m;
    String TabelaSql,ColunasSql;

    Nnomes = 6;
	  String[] nomes = new String[Nnomes];
    
    //nomes de pessoas possiveis
    nomes[0] = "Ana";
    nomes[1] = "Maria";
	  nomes[2] = "Lucas";
    nomes[3] = "Kevin";
    nomes[4] = "Thayani";
	  nomes[5] = "Wesley";
	  
	  //entradas
	  System.out.println("digite o nome da sua tabela sql");
  	TabelaSql = ler.nextLine();
    System.out.println("digite o nome das colunas Ex(id,nome)");
    ColunasSql = ler.nextLine();
    System.out.println("digite a quantidade de linhas da sua tabela sql (max "+Nnomes+")");
	  linhasSql = ler.nextInt();
	  
	  //saida
	  System.out.println("insert into " + TabelaSql + " ("+ ColunasSql +")");
	  
	  for(i=0;i<=(linhasSql-1);i++){  
	      int numero = gerador.nextInt(Nnomes);
	      System.out.print("(");
	      System.out.print("'"+nomes[numero]+"'");
	      System.out.println("),");
	    
	  }
 		
  }
}
