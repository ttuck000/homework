package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 배송시작됨 extends AbstractEvent {

    private Long id;
    private String deliveryid;
    private String orderid;
    private String productid;
    private String qty;
    private String deliverystate;

    public 배송시작됨(배송관리 aggregate){
        super(aggregate);
    }
    public 배송시작됨(){
        super();
    }
}
