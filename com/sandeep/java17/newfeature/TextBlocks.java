package com.sandeep.java17.newfeature;

public class TextBlocks {

	public static void main(String[] args) {
		String text = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 45,\n" +
                "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                "}";
		String json = """
				{
				  "name": "John Doe",
				  "age": 45,
				  "address": "Doe Street, 23, Java Town"
				}
				""";
  System.out.println(text);
  System.out.println(json);
	}

}
