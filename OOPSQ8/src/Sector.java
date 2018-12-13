
public class Sector extends Circle{
double angle;
Sector(double r,double angle)
{
	super(r);
	this.angle=angle;                                          //in radians
}
double Area_Sector()
{
	return 0.5*rad*rad*angle;
}

}
