package com.algaworks.desario_serializacao;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import com.algaworks.desario_serializacao.crm.Cliente;
import com.algaworks.desario_serializacao.crm.Endereco;

import static java.nio.file.StandardOpenOption.*;

public class Serializacao {
    
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        System.out.println(cliente);

        Path path = Path.of("objetos/cliente.ser");

        try (var outPutStream = new ObjectOutputStream(Files.newOutputStream(path, CREATE, WRITE))) {
            outPutStream.writeObject(cliente);
            System.out.println("Cliente serializado com sucesso!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
