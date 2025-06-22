import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GerenciadorDeFaturas {

    public static void main(String[] args) {
        // Data de vencimento original
        LocalDate vencimentoOriginal = LocalDate.of(2025, 3, 20);

        // Número de meses de adiamento
        int mesesAdicionais = 1;

        // Cálculo da nova data de vencimento
        LocalDate novoVencimento = vencimentoOriginal.plusMonths(mesesAdicionais);

        // Formatação da nova data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String novaDataFormatada = novoVencimento.format(formato);

        // Exibição do resultado
        System.out.println("Nova data de vencimento: " + novaDataFormatada);
    }
}
