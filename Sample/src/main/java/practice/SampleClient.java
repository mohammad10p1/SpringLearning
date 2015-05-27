package practice;

public class SampleClient {
	
	private final Integer clientId;
    private final String firstName;
    private final String lastName;
    private final Integer age;

    public SampleClient() {
        this.clientId = null;
        this.firstName = "Not Provided";
        this.lastName = "Not Provided";
        this.age = null;
    }
    
    public SampleClient(Integer clientId, String firstName, String lastName, Integer age) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public Integer getClientId() {
		return clientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	
}
