package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utility {
		
	/**  Unimplemented Method -1 
	 * Prepares and returns a list of all employees in the organization, obtained by combining
	 * the list of all Faculties and the list of all staffs (the inputs to the
	 * method), to form a list having a type common to (generalized from) the two 
	 * input types.
	 */
	public static List<Payable>/*<implement>*/ MakePayableList(List<Faculty> faculty, List<Staff> staff) {
		/* implement */
		List<Payable> temp= new ArrayList();
		temp.addAll(faculty);
		temp.addAll(staff);
		return temp;
	}
	
	/** Unimplemented Method - 2
         *  Returns the sum of the calculatePay() of all employees in the organization, including
	 *  Faculty and staff
	 */
	public static double computeTotalSalary(List<Payable>/*<implement>*/ list) {
		/*implement */
		double tot = 0.0;
		for(Payable ob : list){
			tot+=ob.calculatePay();
		}
		return tot;
	}
        
	/** Unimplemented Method -3 
         * Print the Payable objects in the sorted order based on the SortType,
	 * if SortType is NAME then sort the list using getName()
	 * if SortType is SALARY then sort the list using calculatePay() 
        */
	public static void sort(List<Payable> list,SortType type){
		if(type==SortType.NAME)
			Collections.sort(list,new NameComparator());
		else
			Collections.sort(list,new SalaryComparator());
		for(Payable x:list)
			System.out.println(x);
	}
	/** Unimplemented Method -4
         * return the count of MALE or FEMALE based the input argument.
	 * if Gender type is MALE then return the MALE count using getGender()
	 * if Gender type is FEMALE then return the FEMALE count using getGender()*/
	public static int GenderCount(List<Payable> list,Gender type){
		int temp= 0;
		  for(int i=0;i<list.size();i++){
        	if(list.get(i).getGender()==type) temp++;
               }
     	return temp;
	}
}
