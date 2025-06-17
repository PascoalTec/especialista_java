package com.algaworks.desafio_io;

import java.io.File;
import java.io.IOException;
import com.algaworks.desafio_io.io.EscritorArquivoMaiusculo;


public class Principal3 {
    

    public static void main(String[] args) {
        try {
            var escritor = new EscritorArquivoMaiusculo(
                    new File("C:\\repositorios\\especialista_java\\banco\\src\\com\\algaworks\\desafio_io\\arquivos\\textos\\poema1.txt"),
                    new File("C:\\repositorios\\especialista_java\\banco\\src\\com\\algaworks\\desafio_io\\arquivos\\textos\\poema2.txt"));
            escritor.processar();
        } catch (IOException e) {
            System.out.println("Erro ao processar arquivo e escrevendo novo arquivo");
            e.printStackTrace();
        }
    }
}
