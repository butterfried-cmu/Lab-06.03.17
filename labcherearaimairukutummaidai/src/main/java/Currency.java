package utility;

/**
 * Created by CAMT on 6/3/2560.
 */
public class Currency {
    public double exchange (String sourceCurrency, double amount, String targetCurrency){
        return 0.0;
    }

<<<<<<< HEAD
private double targetIsUSD (String sourceCurrency, double amount, String targetCurrency){
	if(sourceCurrency=="THB"){
		amount = amount/33.0;
		return amount;
	}else{
		amount = amount / 1.01;
		return amount;
	}
}
=======
    private double bothIsNotUSD (String sourceCurrency, double amount, String targetCurrency) {
        if (sourceCurrency == "THB") {
            // THB -> USD
            amount = amount / 33.0;
            // USD -> EUR
            amount = amount * 1.01;
            return amount;
        } else if (sourceCurrency == "EUR") {
            amount = amount / 1.01;
            amount = amount * 33;
            return amount;
        }
    }

    private double sourceIsUSD (String sourceCurrency, double amount, String targetCurrency){
	    if(targetCurrency=="THB"){
		    amount = amount * 33.0;
		    return amount;
	    }else{
		    amount = amount * 1.01;
		    return amount;
	    }
    }
>>>>>>> 03527529b8256c32769987fcae29ae0d5fd103c6
}
