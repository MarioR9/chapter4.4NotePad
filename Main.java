public class Main{
public static void main(String args[]){
	double conversion , piToAngle, angleInDegrees,result;
	conversion=(Math.PI)/7;
	
	piToAngle=Math.sin(conversion);
	angleInDegrees=Math.toDegrees(piToAngle);

	//var result its equal to the angle.
	result=angleInDegrees;
	

	System.out.println("The angle is: " + Math.round(result));
}
}