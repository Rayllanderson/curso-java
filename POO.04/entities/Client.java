package entities;

import java.util.Date;

public class Client {
    
    private String name;
    private String email;
    private Date birthDate;
    public Client(String name, Date birthDate) {
	this.name = name;
	//nao quero ficar inventando email
	this.email = name + "@gmail.com";
	this.birthDate = birthDate;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    
    
    

}
