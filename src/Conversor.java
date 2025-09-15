import java.util.Scanner;

public class Conversor {

    String moedaOrigem;
    String moedaDestino;
    double cotação;
    double resultado;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Pronto, vamos calcular");
        System.out.println("Qual é a moeda de origem?");
        moedaOrigem = leitor.nextLine();

        System.out.println("Ótimo! Qual é a moeda de destino?");
        moedaDestino = leitor.nextLine();

        System.out.println("Beleza! Agora, me diga quanto custa 1 " + moedaDestino + " em " + moedaOrigem + "?");
        cotação = leitor.nextDouble();

        calcularMoeda();

    }
    public void calcularMoeda(){
        resultado = 1 / cotação;

        exibirResultados();

    }
    public void exibirResultados(){
        String valorCoversaoComDoisDecimais = String.format("%.2f", resultado);
        System.out.println("********************************");
        System.out.println("MOEDA DE ORIGEM: " + moedaOrigem);
        System.out.println("MOEDA DE DESTINO: " + moedaDestino);
        System.out.println("VALOR DE 1 " + moedaDestino + " em " + moedaOrigem + ": " + cotação);
        System.out.println("Que Bacana!!, 1 " + moedaOrigem + " equivale a " + valorCoversaoComDoisDecimais + " " + moedaDestino + ".");
        System.out.println("********************************");
    }



}