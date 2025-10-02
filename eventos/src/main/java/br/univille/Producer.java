package br.univille;

import java.util.Queue;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class Producer {
    public static void main(String[] args) {
        var servidor = "sb-das1-2025.servicebus.windows.net";
        var chave = System.getenv("CHAVE");
        var queue = "queue-guilhermemiranda";

         ServiceBusSenderClient senderClient =
            new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(servidor)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                //.credential(credential)
                .connectionString(chave)
                .sender()
                .queueName(queue)
                .buildClient();

        senderClient.sendMessage(
            new ServiceBusMessage("1: Guilherme: Vai corinthians!"));
        senderClient.sendMessage(
            new ServiceBusMessage(
                "2: Fomos roubados"));
        senderClient.sendMessage(
            new ServiceBusMessage(
                "3: FAZ L"));
    }
}
