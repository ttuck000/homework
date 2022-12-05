package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class 배송시작됨 extends AbstractEvent {

    private Long id;
    private String deliveryid;
    private String orderid;
    private String productid;
    private String qty;
    private String deliverystate;
}


