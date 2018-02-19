package controller;







import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface gameRepository  extends CrudRepository<gameModel,Integer>  {

	List<gameModel> findByPlatform(String genre,Pageable pageable);
	Page<gameModel> findAll(Pageable pageable);
	

	

}
