package com.algaworks.desafio_io.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

public class FragmentadorDeArquivo {
    
    private final File arquivo;
    private final int tamanhoFragmento;


    public FragmentadorDeArquivo(File arquivo, int tamanhoFragmento) {
        Objects.requireNonNull(arquivo);

        if (tamanhoFragmento < 1) {
            throw new IllegalArgumentException("O tamanho do fragmento deve ser a partir de 1 byte.");
        }

        this.arquivo = arquivo;
        this.tamanhoFragmento = tamanhoFragmento;
    }

    public void fragmentar() throws IOException {
        try (InputStream inputStream = new FileInputStream(arquivo)) {
            int numeroFragmento = 1;
            byte[] conteudoFragmento = new byte[tamanhoFragmento];
            int quantidadeBytesLidos;

            while ((quantidadeBytesLidos = lerFragmento(inputStream, conteudoFragmento)) > 0) {
                File arquivoFragmento = criarArquivoFragmento(numeroFragmento++);
                escreverFragmento(arquivoFragmento, conteudoFragmento, quantidadeBytesLidos);
            }
        }
    }


    private int lerFragmento(InputStream inputStream, byte[] conteudo) throws IOException {
        return inputStream.read(conteudo);
    }

    private File criarArquivoFragmento(int numeroFragmento) {
        return new File(arquivo.getAbsolutePath() + "." + numeroFragmento);
    }

    private void escreverFragmento(File arquivoFragmento, byte[] conteudo, int quantidadeBytes) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(arquivoFragmento)) {
            outputStream.write(conteudo, 0, quantidadeBytes);
        }
    }

}
