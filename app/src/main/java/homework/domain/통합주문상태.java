package homework.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="통합주문상태_table")
@Data
public class 통합주문상태 {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
