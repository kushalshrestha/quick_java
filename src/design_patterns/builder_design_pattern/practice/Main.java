/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.builder_design_pattern.practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person").addField("name","String").addField("age", "int");
        System.out.println(cb);
    }
}
class Field{
    String name;
    String type;

    public Field(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public  String toString(){
        return String.format("public %s %s;",type,name);
    }
}

class Class{
    public String name;
    public List<Field> fields = new ArrayList<>();

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String ls = System.lineSeparator();
        sb.append("public class "+name).append(ls)
                .append("{\n");
        for(Field f: fields)
            sb.append(" "+f).append(ls);
        sb.append("}"+ls);

        return sb.toString();
    }
}

