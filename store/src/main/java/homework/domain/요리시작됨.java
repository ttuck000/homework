package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 요리시작됨 extends AbstractEvent {

    private Long id;
    private String cookingid;
    private String orderid;

    public 요리시작됨(주문관리 aggregate){
        super(aggregate);
    }
    public 요리시작됨(){
        super();
    }
}
