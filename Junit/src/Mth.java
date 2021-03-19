
public class Mth {
public int add(int... numbers) {
	int result=0;
	int counter=0;
	while(counter<numbers.length) {
		result+=numbers[counter++];
	}
	return result;
}
/**
 * takes two number and multiply
 * @author Rinky
 */
 int multiply(int... numbers){
	 
	 int result1=1;
	 int c=0;
	 while(c<numbers.length) {
		 int currentNumber=numbers[c++];
		 if(currentNumber<0) {
			 throw new IllegalArgumentException();
		 }
		 result1*=currentNumber;
	 }
	return result1;
	 
}
}
//add should take any number of integers and return their sum