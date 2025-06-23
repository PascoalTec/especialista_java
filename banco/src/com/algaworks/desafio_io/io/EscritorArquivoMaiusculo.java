package com.algaworks.desafio_io.io;

import java.io.*;
import java.nio.file.Path;
import java.util.Objects;

public class EscritorArquivoMaiusculo {

    private final File arquivoOrigem;
    private final File arquivoDestino;

    public EscritorArquivoMaiusculo(File arquivoOrigem, File arquivoDestino) {
        Objects.requireNonNull(arquivoOrigem);
        Objects.requireNonNull(arquivoDestino);
        this.arquivoOrigem = arquivoOrigem;
        this.arquivoDestino = arquivoDestino;
    }

    public EscritorArquivoMaiusculo(Path of, Path of2) {
        Objects.requireNonNull(of);
        Objects.requireNonNull(of2);
        this.arquivoOrigem = of.toFile();
        this.arquivoDestino = of2.toFile();
    }

    public void processar() throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                escritor.write(linha.toUpperCase());
                escritor.newLine();
            }
        }
    }

}