package com.avier.transferOrder;

import com.avier.Helper;
import com.avier.transferOrder.dto.TransferOrderDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

public class TransferOrderConsumer {
    private final String TRANSFER_ORDER_CONSUMER_CHANNEL = "transfer-order-sub";

    @Inject
    Logger logger;

    @Inject
    Helper helper;


    @Incoming(TRANSFER_ORDER_CONSUMER_CHANNEL)
    public void consume(String message) throws JsonProcessingException {
        TransferOrderDto transferOrder = helper.deserialize(message, TransferOrderDto.class);

        logger.info("Received Transfer Order# " + transferOrder.getOrderNumber());

    }
}
