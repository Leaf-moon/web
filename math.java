package num;
import ptolemy.plot.Plot;
import ptolemy.plot.PlotApplication;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f=0;
		double g=0;
		double t=0;
		double a=0.5;
		
		Plot courbe=new Plot();
		for(int i=0; i<500;i++){
		   t+=0.05;
		   f=t-a*Math.sin(t);
		   g=1-a*Math.cos(t);
		   	courbe.addPoint(0,f,g,true);
		   	
	}
	a=1;
	t=0;
	for(int i=0; i<500;i++){
		   t+=0.05;
		   f=t-a*Math.sin(t);
		   g=1-a*Math.cos(t);
		   	courbe.addPoint(2,f,g,true);
	}
	a=1.5;
	t=0;
	for(int i=0; i<500;i++){
		   t+=0.05;
		   f=t-a*Math.sin(t);
		   g=1-a*Math.cos(t);
		   	courbe.addPoint(3,f,g,true);
		   	
	}
	new PlotApplication(courbe);
	
}
}
