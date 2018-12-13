
public class Segment extends Circle{
	double len;			//length of the segment in the circle
	Segment(double rad,double len)
	{
		super(rad);
		this.len=len;
	}
	double Area_Segment()
	{
		return ((rad*rad*(rad-len)/rad)-(rad-len)*(Math.sqrt(2*rad*len-(len*len))));
	}

}
