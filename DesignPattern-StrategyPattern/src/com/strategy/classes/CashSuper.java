package com.strategy.classes;

/**
 * 抽象类
 * 收费父类
 * @author ASUA
 *
 */
abstract class CashSuper{
	public abstract double acceptCash(double money);
}


/**
 * 正常收费子类
 * @author ASUA
 */
class CashNormal extends CashSuper
{
    public double acceptCash(double money)
    {
        return money;
    }
}

/**
 * 打折收费子类
 * @author ASUA
 */
class CashRebate extends CashSuper
{
    private double moneyRebate = 1d;
    public CashRebate(String moneyRebate)
    {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }
    public double acceptCash(double money)
    {
        return money*moneyRebate;
    }
}

/**
 * 返利收费子类
 * @author ASUA
 */
class CashReturn extends CashSuper
{
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;
    public CashReturn (String moneyCondition,String moneyReturn)
    {
        this.moneyCondition=Double.parseDouble(moneyCondition);
        this.moneyReturn=Double.parseDouble(moneyReturn);
    }

    public double acceptCash(double money)
    {
        double result = money;
        if (money >= moneyCondition)
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        return result;
    }
}