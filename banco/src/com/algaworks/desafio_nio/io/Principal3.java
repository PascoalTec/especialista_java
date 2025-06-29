package com.algaworks.desafio_nio.io;

import java.io.IOException;
import java.nio.file.Path;

import com.algaworks.desafio_io.io.EscritorArquivoMaiusculo;

public class Principal3 {

    public static void main(String[] args) {
        try {
            var escritor = new EscritorArquivoMaiusculo(
                    Path.of("arquivos/textos/poema1.txt"),
                    Path.of("arquivos/textos/poema2.txt"));

            escritor.processar();
        } catch (IOException e) {
            System.out.println("Erro processando e escrevendo novo arquivo");
            e.printStackTrace();
        }
    }

}
