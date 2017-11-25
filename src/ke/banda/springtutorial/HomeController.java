package ke.banda.springtutorial;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//mark class as a controller class, it is a specialization of the @Component which means
//<context:component-scan> will pickup and register @Controller annotated classes as beans just
//as if they were annotated with @Component
@Controller
public class HomeController {

	public static final int QUOTES_PER_PAGE = 30;

	//automatically inject QuotesService when controller is created
	@Autowired
	private QuotesService quotesService;

	//inject the quotes service

	public HomeController(){}

	public  HomeController(QuotesService quoteService){
		this.quotesService = quoteService;
	}

	//handle requests for home page (urls: "/" or "/home") uses 'DefaultAnnotationHandlerMapping'
	@RequestMapping({"/","/home"})
	public String showHomePage(Map<String, Object> model){
		//place returned quotes into the model
		model.put("quotes",quotesService.getRecentQuotes(QUOTES_PER_PAGE));
		return "home"; //return the logical view name to a configured Spring ViewResolver
	}
}
