public class EX3_3 {
    public static void main(String []args) {
     //declarando  
     int numero, fatorial;     
     //entrada de dados
     numero = Integer.parseInt("entre com algum número inteiro");
     //operações
     for (fatorial = 1; numero >1; numero--)
        fatorial = fatorial * numero;
     //imprimindo
     System.out.printf("o fatorial deste número é: \n%d", fatorial);
    }
}
