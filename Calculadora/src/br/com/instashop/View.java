package br.com.instashop;
import javax.swing.JOptionPane;

/**
 * Classe com metods JOptionPane para apresentacao visual
 * @author Eduardo Airton
 *
 */
public class View {

	public static void exibirMensagem(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static String recebeString(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public static int recebeInt(String msg){
		return Integer.parseInt(recebeString(msg));
	}
	
	public static float recebeFloat(String msg){
		return Float.parseFloat(recebeString(msg));
	}
	
	public static void exibirErro(String msg){
		JOptionPane.showMessageDialog(null, msg, "Titulo", JOptionPane.ERROR_MESSAGE);
	}
}
