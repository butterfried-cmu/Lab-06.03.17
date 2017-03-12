/**
 * Created by Teepop on 13/3/2560.
 */
public class GradeCalculator {
    public char calculate(double... scores){
		double sum = 0;
		for (int i = 0 ; i < scores.length ; i++){
			sum = sum + scores[i];
		}
		if (sum > 100){
			return 'x';
		}else if (sum > 95){
			return 'A';
		}else if (sum >80){
			return 'B';
		}else if (sum >60){
			return 'C';
		}else if (sum <=60){
			return 'F';
		}
	}
}
