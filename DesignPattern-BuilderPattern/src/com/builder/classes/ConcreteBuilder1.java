package com.builder.classes;

public class ConcreteBuilder1 extends Bulider
{
     private Product product =new Product();

     public void BulidPartA()
     {
         product.Add("部件A");
     }
     public void BulidPartB()
     {
         product.Add("部件B");
     }

     public Product GetResult()
     {
         return product;
     }
}
