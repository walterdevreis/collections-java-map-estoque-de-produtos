import entities.Produto;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Produto produto = new Produto("Iphone 17", 10, 8000.00);

        System.out.println(produto);
    }
}