package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 주문취소함 extends AbstractEvent {

    private Long id;

    public 주문취소함(주문 aggregate){
        super(aggregate);
    }
    public 주문취소함(){
        super();
    }
}
