package com.memento.classes;

/**
 * 游戏角色类
 * 
 * 用来存储角色的生命力、攻击力、防御力的数据
 * @author ASUA
 */
public class GameRole {
	// 生命力 攻击力 防御力
	private int vit;
	private int atk;
	private int def;
	
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
	
	
	// 状态显示
	public void StateDisplay(){
		System.out.println("角色当前状态：");
		System.out.println("体力：" + this.vit);
		System.out.println("攻击力：" + this.atk);
		System.out.println("防御力：" + this.def);
	}
	
	// 初始化角色的状态
	public void InitState(){
		// 数据通常来自本机磁盘或远程数据库
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}
	
	// 战斗 掉血受损
	public void Fight(){
		this.vit = 40;
		this.atk = 40;
		this.def = 40;
	}
	
	// 角色死了，game over
	public void GameOver(){
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}
	
	// 保存角色状态
	public RoleStateMemento SaveState(){
		return (new RoleStateMemento(this.vit, this.atk, this.def));
	}
	
	// 恢复角色状态
	public void RecoveryState(RoleStateMemento memento){
		this.vit = memento.GetVit();
		this.atk = memento.GetAtk();
		this.def = memento.GetDef();
	}
	
}
