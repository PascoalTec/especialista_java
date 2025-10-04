package com.algaworks.gerador_csv.arquivo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

public class GeradorCSV {
    
    public static <T> void imprimir(Class<T> clazz, List<T> objetos) {
        Field[] propriedades = clazz.getDeclaredFields();

        System.out.println(Arrays.stream(propriedades)
        .filter(field -> field.isAnnotationPresent(Campo.class))
        .map(Field::getName)
        .collect(Collectors.joining(";")));
        // System.out.println("codigo;nome;dataNascimento");
        objetos.forEach(t -> {
            try {
                GeradorCSV.imprimir(t);
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    public static void imprimir(Object cliente) throws IllegalAccessException {
        Field[] propriedades = cliente.getClass().getDeclaredFields();
        List<String> valores = new ArrayList<>();

        try {
            for (Field propriedade : propriedades) {
            propriedade.setAccessible(true);
            Object resultado = propriedade.get(cliente);
            valores.add(resultado == null ? "" : resultado.toString());
            }

            System.out.println(String.join(";", valores));
        }
        catch (Error e) {
            throw new RuntimeErrorException(e);
        }
    }
}
