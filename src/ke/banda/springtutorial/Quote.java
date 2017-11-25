package ke.banda.springtutorial;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class Quote {

	private String description;
	private Date sentOn;

	public Quote(){}

	public Quote(String description, Date sentOn) {
		this.description = description;
		this.sentOn = sentOn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getSentOn() {
		return sentOn;
	}

	public void setSentOn(Date sentOn) {
		this.sentOn = sentOn;
	}

}
