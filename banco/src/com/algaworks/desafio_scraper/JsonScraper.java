package com.algaworks.desafio_scraper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonScraper {

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"id\": 1,\n" +
                "    \"nome\": \"João da Silva\"\n" +
                "},\n" +
                "{\n" +
                "    \"id\": 2,\n" +
                "    \"nome\":\"Maria Abadia\"\n" +
                "},\n" +
                "{\n" +
                "    \"id\": 3,\n" +
                "    \"nome\":\n" +
                "        \"Sebastião Carvalho\"\n" +
                "}";

        String regex = ".*?\"nome\":\\s*\"(?<nome>.*?)\".*?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(json);


        while (matcher.find()) {
            System.out.println(matcher.group("nome"));
        }
    }

}
