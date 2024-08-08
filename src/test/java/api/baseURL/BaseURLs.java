package api.baseURL;

public  class BaseURLs {
	
/*Reqres Automation framework
	Create -- https://reqres.in/api/users 
	Get -- https://reqres.in/api/users/id
	Update -- https://reqres.in/api/users/id
	Delete --https://reqres.in/api/users/id */
	
// Base URL
	public static String base_url = "https://reqres.in/api";

// Base URL for User module
	public static String createuser = base_url +"/users";
	public static String getuser = base_url +"/users/id";
	public static String updateuser = base_url +"/users/id";
	public static String deleteuser = base_url +"/users/id";
	
		


}
