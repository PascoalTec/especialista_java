package com.algaworks.desafio_logback;

import java.nio.file.Path;
import java.util.logging.Logger;

//import com.algaworks.desafio_logback.fragmentador.FragmentadorDeArquivo;


/* 
public class Principal {

    private static final Logger logger = LoggerFactory.getLogger(Principal.class);

    public static void main(String[] args) {
        try {
            logger.info("Iniciando programa de fragmentação...");
            var fragmentador = new FragmentadorDeArquivo(
                    Path.of("fotos/picanha.jpg"),
                    1024 * 50);
            fragmentador.fragmentar();
            logger.info("Fragmentação concluída com sucesso!");
        } catch (Exception e) {
            logger.error("Erro fragmentando arquivo", e);
        }
    }
}

*/