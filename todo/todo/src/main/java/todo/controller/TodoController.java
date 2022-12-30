package todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.model.Todo;
import todo.repositories.TodoRepo;

@RestController
@RequestMapping(path = "/todo")
public class TodoController {
	@Autowired
	TodoRepo todoRepository;

	@GetMapping("/findall")
	public List<Todo> fetchAll() {
		return this.todoRepository.findAll();
	}
	
	@PostMapping(path = "/addTask",value = "{task}")
	public void addTask(String task) {
		
	}

}
