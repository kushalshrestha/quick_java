/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.builder_design_pattern.practice;

class CodeBuilder {
    Class theClass = new Class();

    public CodeBuilder(String className) {
        theClass.name = className;
    }

    public CodeBuilder addField(String name, String type) {
        theClass.fields.add(new Field(name, type));
        return this;
    }

    @Override
    public String toString() {
        return theClass.toString();
    }
}