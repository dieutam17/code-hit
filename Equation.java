package Refactoring;

public class Equation {
	public String linearEquation(int a, int b) {
		if (a == 0)
			if (b == 0)
				return "any number";
			else
				return "no number";
		else
			return "one number";
	}

	public String quadraticEquation(int a, int b, int c){
		 if(a==0){
		 linearEquation(b, c);
		 } else { 
		int delta = b*b - 4*a*c;
		 if(delta < 0) 
		return "no number"; 
		else if(delta == 0) 
		return "one number"; 
		else return "two numbers"; 
		}
		return null;
	}
}
