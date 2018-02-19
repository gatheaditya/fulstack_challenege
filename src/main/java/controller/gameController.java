package controller;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	

	@GetMapping(path="/all")
	@CrossOrigin(origins = "https://gatheaditya.github.io", maxAge = 3600)
	public @ResponseBody Iterable<gameModel> fetchall()
	{
		return cr.findAll();
		}
	@GetMapping(path="/all/{pageid}")
	@CrossOrigin(origins = "https://gatheaditya.github.io", maxAge = 3600)
	public @ResponseBody Page<gameModel> fetch(@PathVariable("pageid") int pageid)
	{
		return cr.findAll(new PageRequest(pageid,20));
		
	}
	
//	@GetMapping(path="/platforms")
//	@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
//	public @ResponseBody List<gameModel> Platforms()
//	{
//		//return cr.findDistinctAllByPlatform();
//	}
}
