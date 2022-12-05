package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 배송확인함 extends AbstractEvent {

    private Long id;
    private String deliveryid;
    private String orderid;

    public 배송확인함(주문 aggregate){
        super(aggregate);
    }
    public 배송확인함(){
        super();
    }
}
