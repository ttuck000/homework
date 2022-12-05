package homework.domain;

import homework.domain.주문됨;
import homework.AppApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="주문_table")
@Data

public class 주문  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        homework.external.결제이력 결제이력 = new homework.external.결제이력();
        // mappings goes here
        AppApplication.applicationContext.getBean(homework.external.결제이력Service.class)
            .결제(결제이력);


        주문됨 주문됨 = new 주문됨(this);
        주문됨.publishAfterCommit();

    }

    public static 주문Repository repository(){
        주문Repository 주문Repository = AppApplication.applicationContext.getBean(주문Repository.class);
        return 주문Repository;
    }






}
