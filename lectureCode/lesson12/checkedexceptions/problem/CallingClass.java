package lesson12.checkedexceptions.problem;

public class CallingClass {
	void callingMethod() {
		Employee e = new Employee();
//		e.makeCopy(); // compiler error – must enclose in try/catch
		// or declare that the method throws CloneNotSupportedException
	}
}
