import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();
	
	public void addConta(Conta conta) {
		contas.add(conta);
	}
	
	public Conta apagarConta(int agencia, int numero) {
		Conta lixo = null;
		for(Conta c: contas) {
			if(c.getAgencia() == agencia && c.getNumero() == numero) {
				contas.remove(lixo);
				lixo = c;
				break;
			}
		}
		
		return lixo;
	}
	
	public void imprimirContas() {
		for(Conta c: contas) {
			c.imprimirExtrato();
		}
	}
	
	public void imprimirContasCorrente() {
		for(Conta c: contas) {
			if(c instanceof ContaCorrente) {
				c.imprimirExtrato();
			}
		}
	}
	
	public void imprimirContasPoupancas() {
		for(Conta c: contas) {
			if(c instanceof ContaPoupanca) {
				c.imprimirExtrato();
			}
		}
	}

}
