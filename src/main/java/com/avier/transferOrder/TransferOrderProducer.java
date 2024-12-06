package com.avier.transferOrder;

import com.avier.IProducer;
import com.avier.transferOrder.dto.TransferOrderDto;
import com.avier.transferOrder.service.TransferOrderService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class TransferOrderProducer {
    private final String TRANSFER_ORDER_PRODUCER_CHANNEL = "transfer-order-pub";

    @Inject
    TransferOrderService transferOrderService;

    @Inject
    @Channel(TRANSFER_ORDER_PRODUCER_CHANNEL)
    Emitter<TransferOrderDto> emitter;

    public void publish(TransferOrderDto payload) {
        emitter.send(payload);
    }
}
