package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class gameController {
	
	@Autowired
	private gameRepository cr;
	
	@GetMapping(path="/")	
	public@ResponseBody String greeting()
	{
		return "Welcome to game REST  ";
	}
	
//	@GetMapping(path="/add")	
//	public @ResponseBody String  add()
//	{
//		
//		gameModel cm = new gameModel();		
//		cm.setUsername("aditya");
//		cm.setPassword("password");
//		cr.save(cm);
//		return "added";
//	}

	@GetMapping(path="/all")
	
	public @ResponseBody Iterable<gameModel> fetch()
	{
		return cr.findAll();
	}
}
