import java.util.*;
public class MyClass {
  public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    final int TAM = 10;
    int a[],i,k,primo;
    a = new int[TAM];
    primo = 0;
    
    
    // lendo vetor//
    
    for (i=0;i<TAM;i++){
        System.out.println("Digite o " + (i+1)+" valor do vetor a");
        a[i] = ler.nextInt();
    }
    
    // atividade //
    for (i=0;i<TAM;i++){
        primo = 0;
        for (k=1;k<=a[i];k++){
            if(a[i]%k==0){
                primo++;
            }
        }
        if(primo == 2){
            System.out.println(a[i]+" é primo");
        }else{
            System.out.println(a[i]+" não é primo");
        }
    }
    
  }
}
