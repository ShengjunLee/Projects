package triangle;

public class triangle {
	int a;
	int b;
	int c;
	public  boolean equilateral(int a,int b, int c){
		return (a==b)&&(b==c);	
	}
	public  boolean isosceles(int a,int b, int c){
		return ((a==b)&&(a!=c))||((b==c)&&(a!=c))||((a==c)&&(b!=c));	
	}
	public  boolean scalene(int a,int b, int c){
		return (a!=b)&&(a!=c)&&(b!=c);	
	}
}
