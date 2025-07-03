import com.algaworks.comercial.repositorio.mysql.MySQLVendaRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface FabricaDeRepositorio extends AutoCloseable {

    public static FabricaDeRepositorio obterInstancia() {
        var properties = new Properties();
        try (var is = FabricaDeRepositorio.class
                .getResourceAsStream("/persistencia.properties")) {
            properties.load(is);
        } catch (IOException e) {
            throw new PersistenciaException("Erro carregando configurações", e);
        }

        if ("mysql".equals(properties.getProperty("repositorio"))) {
            return new MySQLFabricaDeRepositorio(properties);
        } else if ("memoria".equals(properties.getProperty("repositorio"))) {
            return new MemoriaFabricaDeRepositorio();
        }

        throw new PersistenciaException("Implementação de repositório não existe");
    }

    VendaRepositorio criarVendaRepositorio();

    @Override
    void close();

}
