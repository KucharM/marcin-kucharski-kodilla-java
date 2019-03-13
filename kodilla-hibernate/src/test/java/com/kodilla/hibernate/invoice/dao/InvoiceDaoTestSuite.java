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

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product milk = new Product("milk");
        productDao.save(milk);
        Product bread = new Product("bread");
        productDao.save(bread);
        Product chocolate = new Product("chocolate");
        productDao.save(chocolate);
        Product beer = new Product("beer");
        productDao.save(beer);
        Product cheese = new Product("cheese");
        productDao.save(cheese);

        Item item1 = new Item(milk, new BigDecimal(3), 10, new BigDecimal(5));
        itemDao.save(item1);
        Item item2 = new Item(bread, new BigDecimal(4), 5, new BigDecimal(5));
        itemDao.save(item2);
        Item item3 = new Item(cheese, new BigDecimal(8), 6, new BigDecimal(5));
        itemDao.save(item3);
        Item item4 = new Item(chocolate, new BigDecimal(6), 10, new BigDecimal(5));
        itemDao.save(item4);
        Item item5 = new Item(beer, new BigDecimal(5), 20, new BigDecimal(5));
        itemDao.save(item5);

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
        int invoiceId = invoice.getId();
        int invoiceItems = invoice.getItems().size();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(5, invoiceItems);

        //CleanUp
        invoiceDao.deleteById(invoiceId);

    }
}
