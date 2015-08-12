package com.factory.classes;

/**
 * 付费处理 工厂类
 * @author ASUA
 */
public class CashFactory {
	/**
	 * 根据付费方式 实例化对应的付费处理类
	 * 并返回该对象实例
	 * @param type 付费方式
	 * @return CashSuper 对象实例
	 */
	public static CashSuper createCashAccept(CashType type)
    {
		CashSuper cs = null;
        switch (type)
        { 
            case CashNormal:
                cs = new CashNormal();
                break;
            case CashRebate:
                cs = new CashReturn("300","100");
                break;
            case CashReturn:
                cs = new CashRebate("0.8");
                break;
            default:
            	break;
        } 
        return cs;
    }
}
