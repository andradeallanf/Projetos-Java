package venda;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Curso Algoritmo");
		produto1.setValor(BigDecimal.valueOf(120));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Curso Html");
		produto2.setValor(BigDecimal.valueOf(128));

		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Curso Git");
		produto3.setValor(BigDecimal.valueOf(135));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Curso formação Java");
		venda.setEnderecoEntrega("Entrega pelo e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Allan Felipe de Andrade");

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);

		System.out.println("Descrição da venda: " 
		+ venda.getDescricaoVenda() + " valor total: " + venda.totalVenda());

	}

}
