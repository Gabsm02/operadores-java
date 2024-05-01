public class Operadores1 {
    public static void main(String[] args) throws Exception {
        //operador = serve para atribuir um valor a uma variável
            int a = 10;
            String nome = "Maria";
            double peso = 60.5;
        
        //operadores aritméticos
            int soma = 2 + 2;
            int subtracao = 2 - 2;
            int multiplicacao = 2 * 2;
            int divisao = 2 / 2;
            int resto = 2 % 2;

        //concatenacao
            String nomeCompleto = "Joao" + " Silva";

        //operadores unários

            int numero = 10;
            
            //tornando o valor negativo
                numero = -numero; //-10

            //tornando o valor positivo
                numero = numero * -1; //10

            //incremento
                numero++; //11

            //decremento
                numero--; //9

            //booleans
                boolean variavel = true;

                variavel = !variavel; //false

            //ternário
                int number1, number2;
                number1 = 10;
                number2 = 20;

            String resultado = number1==number2 ? "Iguais" : "Diferentes"; //Diferentes

        //operadores de comparação

            int valor1 = 10;
            int valor2 = 20;

            boolean resultado1 = valor1 == valor2; //false
            boolean resultado2 = valor1 != valor2; //true
            boolean resultado3 = valor1 > valor2; //false
            boolean resultado4 = valor1 < valor2; //true
            boolean resultado5 = valor1 >= valor2; //false
            boolean resultado6 = valor1 <= valor2; //true

        //operadores lógicos

            boolean condicao1 = true;
            boolean condicao2 = false;

            if(condicao1 && condicao2){
                System.out.println("as duas condicoes sao verdadeiras");
            }

            if(condicao1 || condicao2){
                System.out.println("uma das condicoes é verdadeira");
            }
    }
}
