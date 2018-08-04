# ehTois
SÓ OS PARÇA
public class Main{

    public static void main(String[] args){
        Operacao operacao = new Operacao();
        Scanner input = new Scanner(System.in);
        
        operacao.soma();
        
        double n1,n2;
        System.out.println("Digite o primeiro numero inteiro");
        n1 = input.nextInt();  
        System.out.println("Digite o segundo numero inteiro");
        n2 = input.nextInt(); 
        operacao.calculaMedia(n1,n2);
        double x = input.nextDouble();
        
        int resposta;
        resposta = operacao.multiplicacao();
        System.out.println("O produto dos numeros e " + resposta);
        
        double num1,num2, resposta2;
        System.out.println("Digite o dividendo");
        num1 = input.nextInt();  
        System.out.println("Digite o divisor");
        num2 = input.nextInt(); 
        resposta2 = operacao.divisao(num1, num2);
        System.out.println("O resultado da divisao dos numeros e " + resposta2);
    }
    
}
class Operacao {
    public double soma () {
        return 0;
    }
    
    public double calculaMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }
    
    public int multiplicacao () { 
        return 1;
    }
    
    public double divisao (double n1, double n2) {
        return n1/n2;
    }
    
    public double subtracao () {
        return 0; 
    }
    
    public double mediaPonderada (double n1, double n2) {
        return (n1 + n2)/ 1 + 2;
    }
    
    public double fatorial (double fat) {                                                                                           
        double f = 0;
        while (fat > 1){  
             f *=(fat-1); 
             fat--; 
        }
        return f;
    }
       
}
