package com.template.main;

import com.template.abstractclass.Animal;
import com.template.classes.Cat;
import com.template.classes.Dog;

/**
 * 测试类
 * @author ASUA
 */
class test{
	public static void main(String args[]){
		Animal animal=new Cat(); 
		System.out.println(animal.Shout());

		animal = new Dog(); 
		System.out.println(animal.Shout());
	}
}