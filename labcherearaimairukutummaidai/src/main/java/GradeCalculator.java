/**
 * Created by Teepop on 13/3/2560.
 */
public class GradeCalculator {
    public char calculate(double... scores){

		double sum = 0;

		// A implement code to find summation of all scores to sum

		// B implement code to return right output from sum
		if(sum <= 100 && sum >= 0){
			if (sum > 95) return 'A';
			if (sum > 80) return 'B';
			if (sum > 60) return 'C';
			return 'F';
		}else {
			return 'x';
		}
	}
}
