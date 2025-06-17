package com.algaworks.desafio_io;

import java.io.File;
import java.io.IOException;
import com.algaworks.desafio_io.io.UnificadorDeArquivo;


public class Principal2 {
    

    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivo(
                    new File("arquivos/fotos"),
                    new File("arquivos/fotos/picanha-unificado.jpg"),
                    "picanha.jpg");
            unificador.unificar();
        } catch (IOException e) {
            System.out.println("Erro ao unificar arquivos");
            e.printStackTrace();
        }
    }
}
