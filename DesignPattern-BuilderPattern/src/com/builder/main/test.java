package com.builder.main;

import com.builder.classes.Bulider;
import com.builder.classes.ConcreteBuilder1;
import com.builder.classes.ConcreteBuilder2;
import com.builder.classes.Director;
import com.builder.classes.Product;

class test{
	public static void main(String args[]){
		Director director = new Director();
		Bulider b1 = new ConcreteBuilder1();
		Bulider b2 = new ConcreteBuilder2();
		director.Construct(b1);
		Product p1 = b1.GetResult();
		p1.show();

		director.Construct(b2);
		Product p2 = b2.GetResult();
		p2.show();
	}
}