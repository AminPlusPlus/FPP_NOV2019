package prog_12_1;

import java.util.logging.Logger;

abstract public class ClosedCurve {
	public static final Logger LOG = Logger.getLogger(ClosedCurve.class.getPackage().getName());
	abstract double computeArea();
	

}
