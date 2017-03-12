package utility;

/**
 * Created by CAMT on 6/3/2560.
 */
public class Currency {
    public double exchange (String sourceCurrency, double amount, String targetCurrency){
        return 0.0;
    }


//C
private double sourceIsUSD (String sourceCurrency, double amount, String targetCurrency){
	if(targetCurrency=="THB"){
		amount = amount * 33.0;
		return amount;
	}else{
		amount = amount * 1.01;
		return amount;
	}
}
}
