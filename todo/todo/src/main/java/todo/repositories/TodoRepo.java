package todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todo.model.Todo;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Integer> {
	
	
}
