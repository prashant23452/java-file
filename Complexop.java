class Complex{
	int real,imaginary;
	public Complex(){
		this.real=0;
		this.imaginary=0;
	}
	public Complex(int real,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	public Complex(Complex other){
		this.real=other.real;
		this.imaginary=other.imaginary;
	}
	public Complex add(Complex other){
		return new Complex(this.real+other.real,this.imaginary+other.imaginary);
	}
	public void display(){
		System.out.println(real+"i"+" + "+imaginary+"j");
	}

	
}
public class Complexop{
	public static void main(String [] args){
		Complex c1= new Complex(4,5);
		Complex c2= new Complex(7,8);
		Complex c3= c1.add(c2);
		c3.display();
	}
}


