package homework.domain;

import homework.domain.배송시작됨;
import homework.domain.배달취소됨;
import homework.RiderAppApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="배송관리_table")
@Data

public class 배송관리  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        배송시작됨 배송시작됨 = new 배송시작됨(this);
        배송시작됨.publishAfterCommit();



        배달취소됨 배달취소됨 = new 배달취소됨(this);
        배달취소됨.publishAfterCommit();

    }

    public static 배송관리Repository repository(){
        배송관리Repository 배송관리Repository = RiderAppApplication.applicationContext.getBean(배송관리Repository.class);
        return 배송관리Repository;
    }




    public static void 배송정보받음(요리완료됨 요리완료됨){

        /** Example 1:  new item 
        배송관리 배송관리 = new 배송관리();
        repository().save(배송관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(요리완료됨.get???()).ifPresent(배송관리->{
            
            배송관리 // do something
            repository().save(배송관리);


         });
        */

        
    }


}
