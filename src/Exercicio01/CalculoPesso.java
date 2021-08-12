package Exercicio01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculoPesso {
    public void calculaIdade(Pessoa p) {
        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dateNasciInput = null;

        try {
            dateNasciInput = sdf.parse(p.getDateNasc());
        } catch (Exception e) { }

        Calendar dataAniversario = new GregorianCalendar();

        dataAniversario.setTime(dateNasciInput);

        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataAniversario.get((Calendar.YEAR));

        dataAniversario.add(Calendar.YEAR, idade);

        if (hoje.before(dataAniversario)) {
            p.setIdade(idade);
        }

        p.setIdade(idade--);
    }
}
