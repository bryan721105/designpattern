package design.stragety;

/**
 *  Name: ReturnTradeStragety.java
 * Description :  退貨拋帳
 * Created by bryant on 2017/1/14.
 */
public class ReturnTradeStragety implements  TradeStragety{
    @Override
    public boolean doTrade() {
        System.out.println("退貨拋帳成功");
        return true;
    }
}
