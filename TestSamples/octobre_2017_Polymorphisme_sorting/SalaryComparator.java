package prob1;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Payable>{

	@Override
	public int compare(Payable arg0, Payable arg1) {
		
		return Double.compare(arg0.calculatePay(), arg1.calculatePay());
	}
	
}