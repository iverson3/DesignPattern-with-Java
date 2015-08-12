package com.mediator.main;

import com.mediator.classes.ConcreteColleague1;
import com.mediator.classes.ConcreteColleague2;
import com.mediator.classes.ConcreteMediator;

/**
 * 测试类
 * @author ASUA
 */
public class test {

	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		
		m.SetConcreteColleague1(c1);
		m.SetConcreteColleague2(c2);
		
		c1.Send("同事1呼叫同事2");
		c2.Send("同事2呼叫同事1");
	}

}
