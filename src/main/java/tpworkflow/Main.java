package tpworkflow;

import tp.workflow.bo.Article;
import tp.workflow.service.InvoiceCalculator;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       final  List<Article> articles = new ArrayList<>();
        articles.add(new Article("Clavier", 30.0, 2));
        articles.add(new Article("Souris", 15.0, 1));
        articles.add(new Article("Écran", 200.0, 1));

        final double total = InvoiceCalculator.calculateTotalInvoice(articles, 100.0, 0.10); // 10% de réduction si > 100€
        System.out.printf("Montant total à payer : %.2f €%n", total);
    }
    public static int square(int x) {
        return x * x;
    }
}