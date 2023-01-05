/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.solid_design_principles;

import java.util.List;
import java.util.stream.Stream;

public class OCPExample {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product strawberry = new Product("Strawberry", Color.RED, Size.SMALL);
        Product grapes = new Product("Grapes", Color.GREEN, Size.SMALL);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        List<Product> productList = List.of(apple, strawberry, grapes, house);


        System.out.println("================================================");
        System.out.println("WITHOUT OCP -------> Green products list : ");
        System.out.println("================================================");
        ProductFilter pf = new ProductFilter();
        pf.filterByColor(productList, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("========================CODE OPTIMIZATION USING OCP =================================");
        CustomFilter cf = new CustomFilter();
        System.out.println("===================Using OCP - Products having Red Color=============================");
        cf.filter(productList, new ColorSpecification(Color.RED))
                .forEach(product -> System.out.println(product.name + " has a color : " + Color.RED));

        System.out.println("===================Using OCP - Products having Size Large=============================");
        cf.filter(productList, new SizeSpecification(Size.LARGE))
                .forEach(product -> System.out.println(product.name + " has a size : " + Size.LARGE));

        System.out.println("===================Using OCP - Products having Color Red and Size Small=============================");
        cf.filter(productList,
                        new MultipleSpecification<>(
                                new ColorSpecification(Color.BLUE),
                                new SizeSpecification(Size.LARGE)
                        ))
                .forEach(product -> System.out.println(product.name + " has a color " + Color.RED + " and size " + Size.SMALL));
    }
}

enum Color {
    RED,
    GREEN,
    BLUE
}

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}

class Product {
    public String name;
    public Color color;
    ;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}


class ProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.size == size);
    }

    public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) {
        return products.stream().filter(p -> p.size == size && p.color == color);
    }
    // state space explosion...goes on increasing when factors like color, size are added
}

// creating two interfaces that are open for extension : Specification, Filter
interface Specification<T> {
    boolean isSatisfied(T item);
}

interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> specification);
}

class CustomFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> productList, Specification<Product> specification) {
        return productList.stream().filter(product -> specification.isSatisfied(product));
    }
}

class ColorSpecification implements Specification<Product> {
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}

class SizeSpecification implements Specification<Product> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}

class MultipleSpecification<T> implements Specification<T> {
    private Specification<T> first, second;

    public MultipleSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}