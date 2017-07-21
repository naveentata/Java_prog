class Calc{
	float len,bre,hei;
	float v;
	void setData(){
		len=bre=hei=5;
	}
	void setData(int i){
		len=bre=hei=i;
	}
	void setData(float l, float b, float h)
	{
		len=l;
		bre=b;
		hei=h;
	}
	void CalcVolume()
	{
		v= len*bre*hei;
		System.out.println(v);
	}
}
 class Test{
	public static void main(String args[])
	{
		Calc B = new Calc();
		B.setData();
		B.CalcVolume();
		B.setData(7);
		B.CalcVolume();
		B.setData(1,2,3);
		B.CalcVolume();
	}
}