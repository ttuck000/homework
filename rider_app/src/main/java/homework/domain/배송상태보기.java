package homework.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="배송상태보기_table")
@Data
public class 배송상태보기 {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
