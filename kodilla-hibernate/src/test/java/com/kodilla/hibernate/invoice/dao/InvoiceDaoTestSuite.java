package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product milk = new Product("milk");
        Product bread = new Product("bread");
        Product chocolate = new Product("chocolate");
        Product beer = new Product("beer");
        Product cheese = new Product("cheese");

        Item item1 = new Item(milk, new BigDecimal(3), 10, new BigDecimal(5));
        Item item2 = new Item(bread, new BigDecimal(4), 5, new BigDecimal(5));
        Item item3 = new Item(cheese, new BigDecimal(8), 6, new BigDecimal(5));
        Item item4 = new Item(chocolate, new BigDecimal(6), 10, new BigDecimal(5));
        Item item5 = new Item(beer, new BigDecimal(5), 20, new BigDecimal(5));

        Invoice invoice = new Invoice("12345");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        List<Invoice> invoiceList = invoiceDao.findByNumber("12345");
        int sizeInvoiceList = invoiceList.size();
        int invoiceId = invoice.getId();
        int invoiceItems = invoice.getItems().size();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(5, invoiceItems);
        Assert.assertEquals(1, sizeInvoiceList);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
