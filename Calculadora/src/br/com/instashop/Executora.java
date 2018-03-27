package br.com.instashop;

/***
 * Programa para realizar operações dadas pelo usuario
 * @author eduardo.airton
 */
public class Executora {

	public static void main(String[] args) {
		Calculadora calculadora = null;
		try {
			calculadora = new Calculadora();
		} catch (Exception e) {
			View.exibirErro(e.getMessage());
		}
		
		menu(calculadora);
		View.exibirMensagem("Calculadora encerrada!");
	}
	
	public static void menu(Calculadora calculadora) {
		
		String opc;
		
		do{
			
			calculadora.setNumero1(View.recebeFloat("Digite o primeiro numero"));
			calculadora.setNumero2(View.recebeFloat("Digite o segundo numero"));
			opc = View.recebeString("Digite a opcao desejada \n\n"
					+ "-> +\n"
					+ "-> -\n"
					+ "-> *\n"
					+ "-> /\n");
			calculadora.setOperacao(opc);
			switch (opc) {
			case "+":
				calculadora.setResultado(calculadora.getNumero1() + calculadora.getNumero2());
				View.exibirMensagem(calculadora.apresenta());
				break;
			case "-":
				calculadora.setResultado(calculadora.getNumero1() - calculadora.getNumero2()); 
				View.exibirMensagem(calculadora.apresenta());
				break;
			case "*":
				calculadora.setResultado(calculadora.getNumero1() * calculadora.getNumero2()); 
				View.exibirMensagem(calculadora.apresenta());
				break;
			case "/":
				calculadora.setResultado(calculadora.getNumero1() / calculadora.getNumero2()); 
				View.exibirMensagem(calculadora.apresenta());
				break;
			default:
				System.out.println("Operação invalida!");
			}
			
			opc = View.recebeString("Deseja realizar outra operacao? \n\n"
					+ "-> SIM\n"
					+ "-> NAO");
				
		}while(!opc.equalsIgnoreCase("nao"));
	}

}

