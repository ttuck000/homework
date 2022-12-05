package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class 주문됨 extends AbstractEvent {

    private Long orderid;
    private String address;
    private String customerid;
    private String productid;
    private Integer qty;
    private Date timestamp;
    private String customername;
}


