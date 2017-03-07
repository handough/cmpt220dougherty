
public class LinearEquation {
	int a, b, c, d, e, f;
	int x;
	int y;
	public LinearEquation(){
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
	}
	public LinearEquation(int a, int b, int c, int d, int e, int f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;	
	}
	public int getA(int newA){
		a = newA;
		return a;
	}
	public int getB(int newB){
		b = newB;
		return b;
	}
	public int getC(int newC){
		c = newC;
		return c;
	}
	public int getD(int newD){
		d = newD;
		return d;
	}
	public int getE(int newE){
		e = newE;
		return e;
	}
	public int getF(int newF){
		f = newF;
		return f;
	}
	public boolean isSolvable(){
		if (a * d - b * c == 0){
			return true;
		}
		return false;
	}
	public int getX(int x){
		
		return x;
	}
	public int getY(int y){
		
		return y;
	}
}
