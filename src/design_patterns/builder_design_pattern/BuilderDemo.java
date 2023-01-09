/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.builder_design_pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("StringBuilder - an example of Builder Pattern================================");
        String[] words = {"We", "all", "live", "in", "a", "yellow", "submarine!!"};
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word : words) {
            sb.append(String.format("  <li>%s</li>\n", word));
        }
        sb.append("</ul>\n");
        System.out.println(sb);

        System.out.println("===== Now Creating and Using our own Builder================================");

        HtmlBuilder builder = new HtmlBuilder("ul");

        //fluent interface - helps to write long chains. How? addChild method returns 'this' i.e return type is the classname
        builder.addChild("li", "hello").addChild("li", "hello");

        System.out.println(builder);

    }
}


class HtmlElement {
    public String tag, text;
    public ArrayList<HtmlElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement() {

    }

    public HtmlElement(String tag, String text) {
        this.tag = tag;
        this.text = text;
    }

    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * indentSize, " "));
        sb.append(String.format("%s<%s>%s", i, tag, newLine));
        if (text != null && !text.isEmpty()) {
            sb.append(String.join("", Collections.nCopies(indentSize * (indent + 1), " ")))
                    .append(text)
                    .append(newLine);

        }

        for (HtmlElement e : elements) {
            sb.append(e.toStringImpl(indent + 1));
        }

        sb.append(String.format("%s</%s>%s", i, tag, newLine));
        return sb.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}

class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootTagName) {
        this.rootName = rootTagName;
        root.tag = rootTagName;
    }

    public HtmlBuilder addChild(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);
        return this;
    }

    public void clear() {
        root = new HtmlElement();
        root.tag = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}



