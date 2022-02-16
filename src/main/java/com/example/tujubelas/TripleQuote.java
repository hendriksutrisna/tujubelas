package com.example.tujubelas;

public class TripleQuote {

    public static void oldStyle() {
        String text = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 45,\n" +
                "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                "}";
        System.out.println(text);
    }

    public static void jsonBlock() {
        String text = """
            {
              "name": "John Doe",
              "age": 45,
              "address": "Doe Street, 23, Java Town"
            }
            """;
        System.out.println(text);
    }

    public static void jsonMovedBracketsBlock() {
        String text = """
              {
                "name": "John Doe",
                "age": 45,
                "address": "Doe Street, 23, Java Town"
              }
            """;
        System.out.println(text);
        System.out.println("123");
    }

    public static void jsonMovedEndQuoteBlock() {
        String text = """
              {
                "name": "John Doe",
                "age": 45,
                "address": "Doe Street, 23, Java Town"
              }
                   """;
        System.out.println(text);
    }
}
