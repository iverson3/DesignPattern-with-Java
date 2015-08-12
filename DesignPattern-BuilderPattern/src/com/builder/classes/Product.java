package com.builder.classes;

public class Product{
	//List<String> parts=new List(); 
	String[] s= new String[100];
    public void Add(String part)
    {
    	//将新内容添加到数组的队尾
    	AddToArray(part);
    }
    public void show()
    {
        System.out.println("\n产品 创建----");
        for(int i = 0; i < s.length; i++){
        	if(s[i] != null){
        		System.out.println(s[i]);
        	}
        }
    }
    private void AddToArray(String part){
    	for(int i = 0; i < s.length; i++){
        	if(s[i] == null){
        		s[i] = part;
        		break;
        	}
        }
    }
}