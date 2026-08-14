class box{
	double width,height,depth;

box(){
width=1.0;height=1.0;depth=1.0;
}
box(double len){
	width=height=depth=len;
}

box (double w,double h,double d){
	width=w; height=h; depth=d;
}

double volume(){
	return width*height*depth;
}
}
public class constructor{
	public static void main(String args[]){
		box b1=new box();
		box b2=new box(5.0);
		box b3=new box(2.0,3.0,4.0);
		
		double vol;
		vol=b1.volume();
		System.out.println(vol);
		
		vol=b2.volume();
		System.out.println(vol);
		
		vol=b3.volume();
		System.out.println(vol);
		
		
	}
}