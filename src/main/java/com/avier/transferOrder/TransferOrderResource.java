package com.avier.transferOrder;

import com.avier.transferOrder.dto.TransferOrderDto;
import com.avier.transferOrder.service.TransferOrderService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/api/v1/transfer/")
public class TransferOrderResource {

    @Inject
    Logger logger;

    @Inject
    TransferOrderService transferOrderService;

    @Inject
    TransferOrderProducer transferOrderProducer;

    @POST
    @Path("/publish")
    @Consumes(MediaType.APPLICATION_JSON)
    public void publishMessage(TransferOrderDto payload) {
        // TransferOrderDto to = transferOrderService.handle(payload);
        logger.info(payload);
        transferOrderProducer.publish(payload);
    }

}
