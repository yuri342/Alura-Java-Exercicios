 public class ConversaoMoeda {

    public static void main(String[] args) {
        double valorReais = 451.50;
        double taxaCambio = 5.25;

        double valorDolares = valorReais / taxaCambio;

        // Convertendo para int para exibir sem casas decimais, conforme exemplo
        int valorDolaresInteiro = (int) valorDolares;

        System.out.println("O valor em dólares é: US$ " + valorDolaresInteiro);
    }
}
