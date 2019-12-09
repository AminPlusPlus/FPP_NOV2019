package prog_2_9_ver2;

public class Test2 {
	public static void main(String[] args) {

		Polygon[] objects = {new Square(3),
							 new Triangle(4,5,6),
							 new Rectangle(3,4)};
		//compute areas
		for(Polygon p : objects) {
			String nameOfCurve = getClassNameNoPackage(p.getClass());

			System.out.println("For this "+
								nameOfCurve+ 
								"\n  Number of sides = "+p.getNumberOfSides()+
							   "\n  Perimeter = "+p.computePerimeter());
			
		}
    
	}
public static String getClassNameNoPackage(Class aClass){ 
    String fullClassName = aClass.getName();
    int index = fullClassName.lastIndexOf('.');
    String className = null;
    String packageName = null;
    
    
    //in this case, there is no package name
    if(index==-1) {
        return fullClassName;
    }
    else {
			  //for other apps, may be useful to have this
        packageName = fullClassName.substring(0,index);

        className = fullClassName.substring(index+1);
        return className;
    }    
    	

}
}
