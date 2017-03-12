package utility;

/**
 * Created by CAMT on 6/3/2560.
 */
public class Currency {
    public double exchange (String sourceCurrency, double amount, String targetCurrency){
        return 0.0;
    }
    private double bothIsNotUSD (String sourceCurrency, double amount, String targetCurrency){
        if(sourceCurrency=="THB"){
            // THB -> USD
            amount = amount/33.0;
            // USD -> EUR
            amount = amount * 1.01;
            return amount;
        }else if(sourceCurrency=="EUR"){
            amount = amount / 1.01;
            amount = amount * 33;
            return amount;
        }
    }
}
