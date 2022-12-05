package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 배달시작됨 extends AbstractEvent {

    private Long id;

    public 배달시작됨(){
        super();
    }
}
