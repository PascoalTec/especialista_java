package com.algaworks.desafio_io;

import java.io.File;
import java.io.IOException;

import com.algaworks.desafio_io.io.FragmentadorDeArquivo;

public class Principal1 {
    
    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivo(
                    new File("C:\\repositorios\\especialista_java\\banco\\src\\com\\algaworks\\desafio_io\\arquivos\\fotos\\picanha.jpg"),
                    1024 * 50);
            fragmentador.fragmentar();
        } catch (IOException e) {
            System.out.println("Erro fragmentando arquivo");
            e.printStackTrace();
        }
    }
}
