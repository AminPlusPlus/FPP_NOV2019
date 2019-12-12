package prob_new;

public class Driver {
	public static void main(String[] args) {
		
		Figure[] figArr = {new HatMaker(),
							new HatMaker(),
							new VeeMaker(),
							new ParallelMaker(),
							new FaceMaker()};		
		
		new Driver(figArr);
	}
	
	public Driver(Figure[] figures){
		
		for (Figure f : figures)
		System.out.print(f.getFigure()+ ' ');
		}

}
