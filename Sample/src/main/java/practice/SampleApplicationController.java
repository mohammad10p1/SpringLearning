package practice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApplicationController {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greetings")
    public Greetings sayGreetings(@RequestParam(value="name", defaultValue="Mohammad") String name) 
    {
    	/*
    	 * The above example does not 
    	 * specify GET vs. PUT, POST, and so forth, because @RequestMapping 
    	 * maps all HTTP operations by default. 
    	 * Use @RequestMapping(method=GET) to narrow this mapping.
    	 */
    	return new Greetings(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/sampleclient")
    public SampleClient getSampleClientInfo(@RequestParam(value="clientid", required=false) Integer clientId) 
    {
    	if(clientId != null)
    	{
    		if(clientId == 1)
    		{
    			return new SampleClient(clientId, "Larry", "King", 81);
    		}
    		else if(clientId == 2)
    		{
    			return new SampleClient(clientId, "Tom", "Hanks", 58);
    		}
    		else if(clientId == 3)
    		{
    			return new SampleClient(clientId, "Jimmy", "Kimmel", 47);
    		}
    		else if(clientId == 4)
    		{
    			return new SampleClient(clientId, "Tina", "Fey", 45);
    		}
    		else if(clientId == 5)
    		{
    			return new SampleClient(clientId, "James", "Bond", 40);
    		}
    		else
    		{
    			return new SampleClient(null, "N/A", "N/A", null);
    		}
    	}
    	else
    	{
    		return new SampleClient();
    	}
    }
}
