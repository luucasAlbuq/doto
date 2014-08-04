package br.com.restful.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.restful.controller.ClienteController;
import br.com.restful.controller.ProfissionalController;
import br.com.restful.exception.ProfissionalSaudeException;
import br.com.restful.model.Cliente;
import br.com.restful.model.ProfissionalSaude;

/**
 * 
 * Classe responsável por conter os metodos REST de acesso ao webservice
 *
 * @author Lucas
 * @version 1.0
 */

@Path("/profissional")
public class ProfissionalResource {
	
	ProfissionalController controller = ProfissionalController.getInstance();
	
	/**
	 * 
	 * Método responsável por fazer chamada ao controller
	 *
	 * @return ArrayList<Cliente> 
	 * @author Lucas
	 * @version 1.0
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<ProfissionalSaude> listarTodos(){
		ArrayList<ProfissionalSaude> todos=null;
		try {
			todos = controller.buscarTodos();
		} catch (ProfissionalSaudeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return todos;
	}
}
