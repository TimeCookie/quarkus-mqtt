package com.avier.purchaseOrder;

import com.avier.Helper;
import com.avier.purchaseOrder.dto.PurchaseOrderDto;
import com.avier.purchaseOrder.service.PurchaseOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

@ApplicationScoped
public class PurchaseOrderConsumer {
    private final String PO_CONSUMER_CHANNEL = "purchase-order-sub";

    @Inject
    Helper helper;

    @Inject
    Logger logger;

    @Inject
    PurchaseOrderService poService;

    @Incoming(PO_CONSUMER_CHANNEL)
    public void consume(String a) throws JsonProcessingException {
        PurchaseOrderDto po = helper.deserialize(a, PurchaseOrderDto.class);
        // poService.handle(po);
        logger.info(po.getOrderNumber());
    }
}
