package com.memento.classes;

/**
 * 角色状态存储箱类
 * 
 * @author ASUA
 */
public class RoleStateMemento {
	// 生命力 攻击力 防御力 (需要存储的状态信息)
	private int vit;
	private int atk;
	private int def;
	
	public RoleStateMemento(int vit, int atk, int def){
		this.vit = vit;
		this.atk = atk;
		this.def = def;
	}
	
	public void SetVit(int vit){
		this.vit = vit;
	}
	public int GetVit(){
		return this.vit;
	}
	
	public void SetAtk(int atk){
		this.atk = atk;
	}
	public int GetAtk(){
		return this.atk;
	}
	
	public void SetDef(int def){
		this.def = def;
	}
	public int GetDef(){
		return this.def;
	}
	
}
