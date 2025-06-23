package com.algaworks.nio;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    
    public static void main(String[] args) throws IOException {
        String caminho = "C:\\repositorios\\especialista_java\\banco\\src\\com\\algaworks\\n" + //
                        "io\\docs\\poema.txt";

        Path path = Path.of(caminho);

        try (var stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }

        // try (BufferedReader reader = Files.newBufferedReader(path)) {
        //     reader.lines()
        //         .forEach(System.out::println);
        // }

        // ByteBuffer buffer = ByteBuffer.allocate(40);
        // try (var inputStream = new FileInputStream(path.toFile());
        //     var channel = inputStream.getChannel()) {
        //         while (channel.read(buffer) > 0) {
        //             buffer.flip(); // Prepare the buffer for reading
        //             CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
        //             System.out.println(charBuffer);
        //             buffer.clear(); // Clear the buffer for the next read
        //         }
        // }
    }
}
