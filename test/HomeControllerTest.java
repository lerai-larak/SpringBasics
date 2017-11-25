import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import java.util.List;
import ke.banda.springtutorial.HomeController;
import ke.banda.springtutorial.Quote;
import ke.banda.springtutorial.QuotesService;
import org.junit.Before;
import org.junit.Test;

public class HomeControllerTest {

	public static final int DEFAULT_QUOTES_PER_PAGE = 3;

	@Before
	public void prepareForTests(){}

	@Test
	public void shouldDisplayRecentQuotes(){
		List<Quote> expectedQuotes = asList(new Quote(), new Quote(), new Quote());

		QuotesService service = mock(QuotesService.class);
		service.addQuotes();
		when(service.getRecentQuotes(DEFAULT_QUOTES_PER_PAGE)).thenReturn(expectedQuotes);

		HomeController controller = new HomeController(service);

		HashMap<String,Object> model = new HashMap<>();

		String viewName = controller.showHomePage(model);

		assertEquals("home",viewName);

		assertSame(expectedQuotes.size(),model.size());
	}

}
