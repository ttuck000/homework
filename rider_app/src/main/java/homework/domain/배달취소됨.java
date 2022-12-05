package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 배달취소됨 extends AbstractEvent {

    private Long id;

    public 배달취소됨(배송관리 aggregate){
        super(aggregate);
    }
    public 배달취소됨(){
        super();
    }
}
