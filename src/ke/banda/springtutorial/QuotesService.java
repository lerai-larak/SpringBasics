package ke.banda.springtutorial;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class QuotesService {
		List <Quote> results;

	public QuotesService(){
		 results =  new ArrayList<>();
		 addQuotes();
	}

	private static Date convertToDate(String dateString){
		Date date = null;
		DateFormat df = new SimpleDateFormat("dd/mm/YYYY");
		try {
			 date =  df.parse(dateString);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public void addQuotes(){

		Quote quote1 = new Quote("sema wee kami han", convertToDate("13/12/2017"));
		Quote quote2 = new Quote("Life is a countdown of events", convertToDate("15/02/2017"));
		Quote quote3 = new Quote("Its wrong to be right when the govt is wrong", convertToDate("09/02/2016"));
		results.add(quote1);
		results.add(quote2);
		results.add(quote3);
	}

	public  List<Quote> getRecentQuotes(int defaultNumOfQuotes){
		return results;
	}

}
