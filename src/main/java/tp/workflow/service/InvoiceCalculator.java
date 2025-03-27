package tp.workflow.service;

import tp.workflow.bo.Article;

import java.util.List;

public class InvoiceCalculator {

    public static double calculateTotalInvoice(List<Article> articles, double discountThreshold, double discountRate) {
        double total = 0;

        for (Article article : articles) {
            total += article.getUnitPrice() * article.getQuantity();
        }

        // Appliquer une réduction si le total dépasse le seuil
        if (total > discountThreshold) {
            total = total - (total * discountRate);
        }

        return total;
    }}
