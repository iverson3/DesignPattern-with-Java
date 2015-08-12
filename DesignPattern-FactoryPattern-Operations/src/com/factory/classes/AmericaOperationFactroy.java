package com.factory.classes;

import com.factory.abstractclass.AbstractFactory;
import com.factory.abstractclass.Operation;

public class AmericaOperationFactroy extends AbstractFactory{
	public Operation AddOperation()
    {
        return new AmericaOperationAdd();
    }

    public Operation SubOperation()
    {
        return new AmericaOperationSub();
    }
}
