package controller;

public class UserController {
	
	private static UserController instance;
	private String idUser=null;
	
	private UserController(){
		
	}
	
	public static UserController getInstance(){
		if(instance==null){
			instance = new UserController();
		}
		
		return instance;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	
	
}
