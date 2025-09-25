package entities;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueDeProdutos;

    public EstoqueProdutos(){
        this.estoqueDeProdutos = new HashMap<>();
    }

    public void adicionarProduto(final Long cod, final String nome, final int quantidade, final double preco){
        this.estoqueDeProdutos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        for (Map.Entry<Long, Produto> produtoEntry : this.estoqueDeProdutos.entrySet()){
            System.out.println("Chave: " + produtoEntry.getKey() + ", Produto: " + produtoEntry.getValue());
        }
    }

    public Double calcularValorTotalEstoque(){
        Double valorTotalDoEstoque = 0.0;
        for (Produto produto : this.estoqueDeProdutos.values()){
            valorTotalDoEstoque += produto.getQuantidade() * produto.getPreco();
        }
        return valorTotalDoEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double valor = Double.MIN_VALUE;
        for (Produto produto : this.estoqueDeProdutos.values()){
            if (valor < produto.getPreco()){
                valor = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double valor = Double.MAX_VALUE;
        for (Produto produto : this.estoqueDeProdutos.values()){
            if (valor > produto.getPreco()){
                valor = produto.getPreco();
                produtoMaisBarato = produto;
            }
            else {
                valor = produto.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0.0;
        for (Map.Entry<Long, Produto> entry : this.estoqueDeProdutos.entrySet()){
            double valorDoProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorDoProdutoEmEstoque > maiorValorTotalProdutoEstoque){
                maiorValorTotalProdutoEstoque = valorDoProdutoEmEstoque;
                produtoMaiorQuantidadeNoEstoque = entry.getValue();
            }
        }
        return produtoMaiorQuantidadeNoEstoque;
    }
}
