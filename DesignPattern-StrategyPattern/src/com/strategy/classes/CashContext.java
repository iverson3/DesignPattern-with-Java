package com.strategy.classes;

/**
 * 付费处理类
 * @author ASUA
 */
public class CashContext {
	private CashSuper cs;
	public CashContext(CashType type)
    {
        switch (type)
        { 
            case CashNormal:
                CashNormal cs0 = new CashNormal();
                cs = cs0;
                break;
            case CashRebate:
                CashReturn cr1 = new CashReturn("300","100");
                cs = cr1;
                break;
            case CashReturn:
                CashRebate cr2 = new CashRebate("0.8");
                cs = cr2;
                break;
            default:
            	break;
        }            
    }
	
	public double GetResult(double money)
    {
        return cs.acceptCash(money);
    }
}
