package homework.domain;

import homework.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="주문관리_table")
@Data

public class 주문관리  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){
    }

    public static 주문관리Repository repository(){
        주문관리Repository 주문관리Repository = StoreApplication.applicationContext.getBean(주문관리Repository.class);
        return 주문관리Repository;
    }






}
