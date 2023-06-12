import java.util.Scanner;
class ConversorTemperatura {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double temperatura;
        int opcao;
        
        System.out.println("Selecione o tipo de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Digite sua opção: ");
        opcao = sc.nextInt();
        
        System.out.print("Digite a temperatura: ");
        temperatura = sc.nextDouble();
        
        if(opcao == 1) {
            double resultado = (temperatura * 1.8) + 32;
            System.out.println("Temperatura em Fahrenheit: " + resultado);
        } else if(opcao == 2) {
            double resultado = (temperatura - 32) / 1.8;
            System.out.println("Temperatura em Celsius: " + resultado);
        } else {
            System.out.println("Opção inválida!");
        }
        
        sc.close();

    }
}

