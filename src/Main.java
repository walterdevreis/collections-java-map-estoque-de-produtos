import entities.EstoqueProdutos;
import entities.Produto;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        System.out.println();
        System.out.println("Exibe os produtos no estoque");
        estoque.exibirProdutos();

        System.out.println();
        System.out.println("Calcula e exibe o valor total do estoque");
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        System.out.println();
        System.out.println("Obtém e exibe o produto mais caro");
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        System.out.println();
        System.out.println("Obtém e exibe o produto mais barato");
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        System.out.println();
        System.out.println("Obtém e exibe o produto com a maior quantidade em valor no estoque");
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}