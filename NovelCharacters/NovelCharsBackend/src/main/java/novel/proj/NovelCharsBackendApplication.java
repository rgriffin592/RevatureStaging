package novel.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@SpringBootApplication
public class NovelCharsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovelCharsBackendApplication.class, args);
	}
	
	/*
	 * Use your backend (your Java application) to make this request to the 3rd party API and
	 * then expose an endpoint to your client to pass the data to the client. In order to achieve
	 * this, we can use what is known as RestTemplate. RestTemplate allows us to make HTTP requests
	 * from within our Spring applications.
	 * 
	 * Yes, we're going to add the RestTemplate as a bean.
	 */

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		/*
		 * This step is optional but useful if you're using your RestTemplate to make a request to the exact
		 * same API each time as it allows us to specify a base URL that we can append to later.
		 */
		restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("https://novelchars.co/api/v2/"));
		return restTemplate;
	}

}
