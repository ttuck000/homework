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
public class 배송상태보기ViewHandler {

    @Autowired
    private 배송상태보기Repository 배송상태보기Repository;





}

