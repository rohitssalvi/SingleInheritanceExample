package singleinheritanceexample;

import java.io.ObjectInputStream.GetField;


public class SingleInheritanceExample {
	public static void main(String[] args)
	{
		float area1,area2;
	   	  getRectangleAndTriangle area=new getRectangleAndTriangle(54,24);
	   	  area1=area.calculateRectangleArea();
	   	  area2=area.calculateTriangleArea();
	   	  System.out.println("Rectangle Area:"+area1);
	   	System.out.println("Rectangle Area:"+area2);
	   	  
	}

	
}

class getAreaExample
{
   float length,breath;
   
  public getAreaExample(float l,float b)
   {
	   length=l;
	   breath=b;
   }
   
   
  
}
class getRectangleAndTriangle extends getAreaExample
{  
	float areaRectangle,areaTriangle;

	public getRectangleAndTriangle(float l, float b) {
		super(l, b);
		// TODO Auto-generated constructor stub
	}
   
	
	public float calculateRectangleArea(){
		
		areaRectangle=length*breath;
		
		return areaRectangle;
	}
	
	public float calculateTriangleArea()
	{
		
		areaTriangle=(length*breath)/2;
		
		return areaTriangle;
	}
	  
}

