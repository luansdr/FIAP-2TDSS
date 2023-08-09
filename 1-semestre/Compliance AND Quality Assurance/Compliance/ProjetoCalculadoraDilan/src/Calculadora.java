public class Calculadora {

	private int resultadoCalculo;

	public int somar(int n1, int n2) {
		return this.resultadoCalculo = n1 + n2;
	}

	public int substrair(int n1, int n2) {
		return this.resultadoCalculo = n1 - n2;
	}

	public int dividir(int n1, int n2) {
		if (n2 == 0) {
			return -1;
		} else {
			return this.resultadoCalculo = Math.round(n1 / n2);
		}
	}

	public int multiplicar(int n1, int n2) {
		return this.resultadoCalculo = n1 * n2;
	}

	public int getResultadoCalculo() {
		return resultadoCalculo;
	}

	public void setResultadoCalculo(int resultadoCalculo) {
		this.resultadoCalculo = resultadoCalculo;
	}

}
