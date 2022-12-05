package homework.infra;

import homework.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="통합주문상태", path="통합주문상태")
public interface 통합주문상태Repository extends PagingAndSortingRepository<통합주문상태, Long> {

    

    
}
