package prob1;

import java.util.Comparator;

public class NameComparator implements Comparator<Payable>{

	@Override
	public int compare(Payable arg0, Payable arg1) {
		
		return arg0.getName().compareTo(arg1.getName());
	}
	
}