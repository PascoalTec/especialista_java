package com.algaworks.desario_serializacao;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import com.algaworks.desario_serializacao.crm.Cliente;

import static java.nio.file.StandardOpenOption.*;

public class Desserializacao {
    
    public static void main(String[] args) {
        
        Path path = Path.of("objetos/joao.ser");

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Cliente cliente = (Cliente) inputStream.readObject();
            System.out.println(cliente);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
