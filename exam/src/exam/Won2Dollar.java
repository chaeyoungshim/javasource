package exam;

public class Won2Dollar extends Converter {

	
	@Override
	protected double convert(double src) {
		//1달러 = 1200원
		src = src * 1200;
		return src;
	}

	@Override
	protected String getSrcString() {
		return null;
	}

	@Override
	protected String getDestString() {
		return null;
	}

	
	
}
