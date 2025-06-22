import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConversorDeHorario {

    public static void main(String[] args) {
        // Captura o horário atual do sistema com fuso local
        ZonedDateTime horarioLocal = ZonedDateTime.now();

        // Define o fuso horário de Sydney
        ZoneId fusoSydney = ZoneId.of("Australia/Sydney");

        // Converte para o horário de Sydney mantendo o instante exato
        ZonedDateTime horarioSydney = horarioLocal.withZoneSameInstant(fusoSydney);

        // Formata apenas horas e minutos
        DateTimeFormatter formatoHoraMinuto = DateTimeFormatter.ofPattern("HH:mm");

        // Exibe os horários
        System.out.println("Horário atual no sistema: " + horarioLocal.format(formatoHoraMinuto));
        System.out.println("Horário atual em Sydney: " + horarioSydney.format(formatoHoraMinuto));
    }
}
