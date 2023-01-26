import java.util.Scanner; 
public class Banco { 
        public static void main(String[] args) { 

    String[] nomesFila = new String[3]; 
    Scanner nome = new Scanner(System.in); 
    
    int count = 0;
 
        for (String nomes : nomesFila) {
         nomes = nome.next();
        count ++;
    
        System.out.println(nomes + " - esta na posicao: " + count );
        }
    nome.close();
    } 
}
