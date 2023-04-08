package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filastring.Fila;
import controller.ImpressoraController;

public class Principal {
	
	public static void main(String[] args) {
		Fila filaImpressao = new Fila();
		ImpressoraController impressora = new ImpressoraController();
		
		String opcao = "";
		do {
			opcao = JOptionPane.showInputDialog("Escolha uma opção:\n" +
												"1. Inserir documento na fila de impressão\n" +
												"2. Imprimir documento\n" +
												"0. Sair");
			try {
				switch(opcao) {
				case "1":
					String documento = JOptionPane.showInputDialog("Informe o documento no formato ID_PC;Nome_Arquivo:");
					impressora.insereDocumento(filaImpressao, documento);
					break;
				case "2":
					impressora.imprime(filaImpressao);
					break;
				case "0":
					JOptionPane.showMessageDialog(null, "Encerrando aplicação.");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
				}
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
		} while(!opcao.equals("0"));
	}
	
}
