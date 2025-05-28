package com.algaworks.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Principal {
    
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.parse("2023-10-04");

        // System.out.println(ChronoField.DAY_OF_MONTH.getFrom(dataVencimento));
        //System.out.println(ChronoField.HOUR_OF_DAY.getFrom(dataVencimento));
        //System.out.println(dataVencimento.getLong(ChronoField.DAY_OF_MONTH));

        System.out.println(dataVencimento.getDayOfMonth());
        System.out.println(dataVencimento.getMonthValue());
        System.out.println(dataVencimento.getYear());
    }
}
