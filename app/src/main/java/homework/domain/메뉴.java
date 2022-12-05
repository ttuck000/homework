package homework.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="메뉴_table")
@Data
public class 메뉴 {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
