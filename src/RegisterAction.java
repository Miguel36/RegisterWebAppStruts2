import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;

	public String execute() {

		System.out.println("execute() method called");
		return "success";
	}
	
	
//	public void validate() {
//		if (firstName == null || firstName.equals("")) {
//			addFieldError("firstName", "First Name is required");
//		}
//		if (lastName == null || lastName.equals("")) {
//			addFieldError("lastName", "Last Name is required");
//		}
//		
//		if (gender == null) {
//			addFieldError("gender", "Gender is required");
//		}
//		
//		if (age == null) {
//			addFieldError("age", "Age is required");
//		}
//		else if (age <= 18) {
//			addFieldError("age", "Age should be above 18");
//		}
//		if (email == null || email.equals("")) {
//			addFieldError("email", "Email is required");
//		}
//	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
