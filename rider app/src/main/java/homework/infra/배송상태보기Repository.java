package homework.infra;

import homework.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="배송상태보기", path="배송상태보기")
public interface 배송상태보기Repository extends PagingAndSortingRepository<배송상태보기, Long> {

    

    
}
