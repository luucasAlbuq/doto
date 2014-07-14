package controller;

public class ProfissionalController {
	
	private static ProfissionalController instance;
	
	private ProfissionalController() {
		// TODO Auto-generated constructor stub
	}

	public static ProfissionalController getInstance() {
		if (instance == null)
			instance = new ProfissionalController();
		return instance;
	}

}
