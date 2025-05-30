public class Operadores {

    public static void main(String[] args) {
        /*
         * int numero = 5;
         * numero++;
         * System.out.println(numero ++);
         * System.out.println(numero);
         * System.out.println(++numero);
         * System.out.println(numero);
         * boolean variavel = true;
         * variavel = !variavel;
         * System.out.println(variavel);
         * 
         * int a, b;
         * 
         * a = 6;
         * b = 6;
         * 
         * // String resultado = (a==b) ? "verdadeiro" : "falso";
         * int resultado = a == b ? 1 : 0;
         * 
         * System.out.println(resultado);
         */
        // int numero1 = 1;
        // int numero2 = 2;

        /*
         * boolean simNao = numero1 == numero2;
         * 
         * System.out.println("numeroUm é igual a numeroDois? " + simNao);
         * 
         * simNao = numero1 != numero2;
         * 
         * System.out.println("numeroUm é diferente de numeroDois? " + simNao);
         * 
         * simNao = numero1 > numero2;
         * 
         * System.out.println("numeroUm é maior que numeroDois? " + simNao);
         * 
         * if (numero1 > numero2)
         * System.out.print("Numero 1 maior que numero 2");
         * 
         * if (numero1 < numero2)
         * System.out.print("Numero 1 menor que numero 2");
         * 
         * if (numero1 >= numero2)
         * System.out.print("Numero 1 maior ou igual que numero 2");
         * 
         * if (numero1 <= numero2)
         * System.out.print("Numero 1 menor ou igual que numero 2");
         * 
         * if (numero1 != numero2)
         * System.out.print("Numero 1 é diferente de numero 2");
         */
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("uma das condições são verdadeiras");
        }

        System.out.println("fim");
    }
}
