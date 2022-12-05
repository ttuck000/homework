package homework.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import homework.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import homework.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired 주문관리Repository 주문관리Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='결제취소됨'")
    public void whenever결제취소됨_주문취소관리(@Payload 결제취소됨 결제취소됨){

        결제취소됨 event = 결제취소됨;
        System.out.println("\n\n##### listener 주문취소관리 : " + 결제취소됨 + "\n\n");


        

        // Sample Logic //

        

    }

}


