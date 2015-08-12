package com.memento.main;

import com.memento.classes.GameRole;
import com.memento.classes.RoleStateCaretaker;

/**
 * 测试类
 * @author ASUA
 */
public class test {

	public static void main(String[] args) {
		// 大战boss前  初始化角色
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.InitState();
		lixiaoyao.StateDisplay();
		// 保存游戏进度 (游戏初始状态)
		RoleStateCaretaker state1 = new RoleStateCaretaker();
		state1.SetMemento(lixiaoyao.SaveState());
		
		
		// 大战boss时，损耗严重
		lixiaoyao.Fight();
		lixiaoyao.StateDisplay();
		// 保存游戏进度 (角色与boss大战之后的受损状态)
		RoleStateCaretaker state2 = new RoleStateCaretaker();
		state2.SetMemento(lixiaoyao.SaveState());
		
		
		
		// 主角被boss击败，game over
		lixiaoyao.GameOver();
		lixiaoyao.StateDisplay();
		
		
		
		// 恢复到之前的状态2 (返回到game over的上一个状态)
		lixiaoyao.RecoveryState(state2.GetMemento());
		lixiaoyao.StateDisplay();
		// 恢复到之前的状态1 (重新再战 返回到游戏的初始状态)
		lixiaoyao.RecoveryState(state1.GetMemento());
		lixiaoyao.StateDisplay();
	}

}
