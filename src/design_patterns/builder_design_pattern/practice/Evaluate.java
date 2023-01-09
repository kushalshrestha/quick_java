/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.builder_design_pattern.practice;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Evaluate
{
    private String preprocess(String text)
    {
        return text.replace("\r\n", "\n").trim();
    }

//    @Test
//    public void emptyTest() {
//        CodeBuilder cb = new CodeBuilder("Foo");
//        assertEquals("public class Foo\n{\n}",
//                preprocess(cb.toString()));
//    }
//
//    @Test
//    public void personTest()
//    {
//        CodeBuilder cb = new CodeBuilder("Person")
//                .addField("name", "String")
//                .addField("age", "int");
//        assertEquals("public class Person\n{\n" +
//                        "  public String name;\n" +
//                        "  public int age;\n}",
//                preprocess(cb.toString()));
//    }
}
