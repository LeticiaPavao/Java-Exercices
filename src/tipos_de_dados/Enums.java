import java.time.DayOfWeek;
import java.time.LocalDate;

enum DiaSemana {
    SEGUNDA("Segunda-feira", "Seg"),
    TERCA("Terça-feira", "Ter"),
    QUARTA("Quarta-feira", "Qua"),
    QUINTA("Quinta-feira", "Qui"),
    SEXTA("Sexta-feira", "Sex"),
    SABADO("Sábado", "Sáb"),
    DOMINGO("Domingo", "Dom");

    private final String nomeCompleto;
    private final String abreviado;

    DiaSemana (String nomeCompleto, String abreviado) {
        this.nomeCompleto = nomeCompleto;
        this.abreviado = abreviado;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getAbreviado() {
        return abreviado;
    }

    public boolean isFimDeSemana() {
        return this == SABADO || this == DOMINGO;
    }

    public boolean isDiaUtil() {
        return !isFimDeSemana();
    }

    public static DiaSemana fromDayOfWeek(DayOfWeek dayOfWeek){
        return values()[dayOfWeek.getValue() - 1];
    }
}

public class Enums{
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        DayOfWeek diaJava = hoje.getDayOfWeek();

        DiaSemana dia = DiaSemana.fromDayOfWeek(diaJava);

        System.out.println("Hoje é: " + dia.getNomeCompleto());
        System.out.println("Abreviatura: " + dia.getAbreviado());
        System.out.println("É fim de semana? " + dia.isFimDeSemana());
    }
}
