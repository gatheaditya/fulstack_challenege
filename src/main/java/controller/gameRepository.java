package controller;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface gameRepository  extends CrudRepository<gameModel,Long>  {
	
	List<gameModel> findAllByname(Pageable Pageable);
	

	

}
