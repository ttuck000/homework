package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class 요리시작됨 extends AbstractEvent {

    private Long id;
    private String cookingid;
    private String orderid;
}


