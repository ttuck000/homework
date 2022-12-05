package homework.infra;

import homework.domain.*;
import homework.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class 통합주문상태ViewHandler {

    @Autowired
    private 통합주문상태Repository 통합주문상태Repository;





}

