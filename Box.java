class Box{
	int l,b, h,v;
	Box()
	{
		l=10;
		b=20;
		h=30;
	}
	void putData()
	{
		System.out.println("len="+l+"bre="+b+"height="+h+"volume="+v);
	}
}
class Box_demo{
	public static void main(String [] args){
		Box b1 = new Box();
		b1.putData();
	}
}