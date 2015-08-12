package com.builder.classes;

public class ConcreteBuilder2 extends Bulider
{
    private Product product = new Product();

    public void BulidPartA()
    {
        product.Add("部件X");
    }
    public void BulidPartB()
    {
        product.Add("部件Y");
    }

    public Product GetResult()
    {
        return product;
    }
}
