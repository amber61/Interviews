
public class FizzBuzz {

    public static void main(String[] args) {  	
    	System.out.println(FizzBuzz(100));
    }

    private static String FizzBuzz(int i) {
	StringBuilder sb = new StringBuilder();
	for(int j=1; j<=100; j++) {
	    String s = j%3==0?(j%5==0?"FizzBuzz":"Fizz"):(j%5==0?"Buzz":""+j);
	    sb.append(s);
	}
        return sb.toString();
    }

    private static void FizzBuzz1() {
	for(int i=1; i<=100; i++) {
	    if(i%3==0&&i%5==0)
		System.out.print("FizzBuzz");
	    else if(i%3==0)
		System.out.print("Fizz");
	    else if(i%5==0)
		System.out.print("Buzz");
	   else
		System.out.print(i);
	} 
    }
}
