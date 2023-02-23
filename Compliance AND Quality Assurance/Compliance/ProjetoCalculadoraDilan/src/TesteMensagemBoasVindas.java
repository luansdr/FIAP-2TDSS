
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteMensagemBoasVindas {

	private final MensagemBoasVindas mensagens = new MensagemBoasVindas("Luan Reis");

	@Test
	public void testeMensagemPadrao() {
		assertEquals(mensagens.mensagemPadrao(), "Seja bem vindo á sua calculadora digital");
	}

	@Test
	public void testeMensagemPadraoComNome() {
		assertEquals(mensagens.mensagemPadraoComNome(),
				"Luan Reis" + "!\n" + "Confira os resultados dos testes no painel da JUNIT!");
	}

}
