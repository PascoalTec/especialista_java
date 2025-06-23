package com.algaworks.desafio_nio.io;

import java.io.IOException;
import java.nio.file.Path;

import com.algaworks.desafio_io.io.UnificadorDeArquivo;

public class Principal2 {

    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivo(
                    Path.of("arquivos/fotos"),
                    Path.of("arquivos/fotos/picanha-unificado.jpg"),
                    "picanha.jpg");
            unificador.unificar();
        } catch (IOException e) {
            System.out.println("Erro ao unificar arquivos");
            e.printStackTrace();
        }
    }

}