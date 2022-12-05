package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class 배송확인함 extends AbstractEvent {

    private Long id;
    private String deliveryid;
    private String orderid;
}


