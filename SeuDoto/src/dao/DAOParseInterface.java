package dao;

import java.util.ArrayList;
import java.util.List;

import model.ProfissionalSaude;
import model.TipoProfissional;
import util.Convenio;
import util.Especialidade;
import controller.ProfissionalController;
import exception.ProfissionalSaudeException;

public interface DAOParseInterface<T> {
	
public void cadastrarProfissionalSaude(String nome,String tipoProfissinal, String identificacao,String especialidade, String convenio) throws ProfissionalSaudeException;
	
	public void persistir(String nomeClasse, T entity);
}
