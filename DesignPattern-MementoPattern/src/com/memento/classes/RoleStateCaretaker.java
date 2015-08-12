package com.memento.classes;

/**
 * 角色状态管理者类
 * 
 * @author ASUA
 */
public class RoleStateCaretaker {
	// 角色状态存储箱对象
	private RoleStateMemento memento;
	
	public void SetMemento(RoleStateMemento memento){
		this.memento = memento;
	}
	
	public RoleStateMemento GetMemento(){
		return this.memento;
	}
}
