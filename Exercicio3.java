import java.time.LocalTime;
import java.time.Duration;

public class ControleDeTempo {

    public static void main(String[] args) {
        // Horários de início e término da atividade
        LocalTime inicio = LocalTime.of(14, 30, 0);
        LocalTime termino = LocalTime.of(16, 45, 0);

        // Cálculo da duração entre os horários
        Duration duracao = Duration.between(inicio, termino);

        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;

        // Exibição do resultado
        System.out.println("Diferença de tempo: " + horas + " horas e " + minutos + " minutos");
    }
}
