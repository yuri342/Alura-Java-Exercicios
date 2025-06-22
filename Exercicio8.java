import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class HorarioInternacional {

    public static void main(String[] args) {
        // Define o fuso horário de Tóquio
        ZoneId fusoTokyo = ZoneId.of("Asia/Tokyo");

        // Captura o horário atual em Tóquio
        ZonedDateTime horarioTokyo = ZonedDateTime.now(fusoTokyo);

        // Formata para exibir horas, minutos e segundos
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Exibe o horário formatado
        System.out.println("Horário atual em Tóquio: " + horarioTokyo.format(formatoHora));
    }
}
