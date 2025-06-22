public class CalculadoraDeAutonomia {

    public static void main(String[] args) {
        double consumoMedio = 12.5;       // km por litro
        double capacidadeTanque = 50;     // litros
        double combustivelAtual = 20;     // litros disponíveis
        double distanciaViagem = 200;     // km

        // Cálculo da autonomia máxima
        double autonomiaMaxima = consumoMedio * capacidadeTanque;

        // Cálculo da autonomia atual
        double autonomiaAtual = consumoMedio * combustivelAtual;

        // Exibição dos valores
        System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km");
        System.out.println("Autonomia atual: " + autonomiaAtual + " km");

        // Verificação se a autonomia atual é suficiente para a viagem
        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Você precisará abastecer antes de completar a viagem.");
        }
    }
}
