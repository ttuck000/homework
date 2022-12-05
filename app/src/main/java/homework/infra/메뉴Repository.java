package homework.infra;

import homework.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="메뉴", path="메뉴")
public interface 메뉴Repository extends PagingAndSortingRepository<메뉴, Long> {

    

    
}
