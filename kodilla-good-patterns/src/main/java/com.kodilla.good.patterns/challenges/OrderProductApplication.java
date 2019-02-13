package com.kodilla.good.patterns.challenges;

public class OrderProductApplication {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductInformationService(),
                new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
