package lambdas;

@FunctionalInterface
public interface Calculo {

	//método abstrato por padrão
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
