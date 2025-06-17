package com.algaworks.io_arquivos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class Principal {
    
    public static void main(String[] args) {
        File arquivoOrigem = new File("C:\\repositorios\\especialista_java\\banco\\src\\com\\algaworks\\io_arquivos\\docs\\contrato.txt");

        try(InputStream inputStream = new FileInputStream(arquivoOrigem)) {

            int conteudo;
            while ((conteudo = inputStream.read()) != -1) {
                System.out.print((char) conteudo);
                
            }
        } catch(FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O ", e);
        }

    }
    
}
