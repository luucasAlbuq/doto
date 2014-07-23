package dao;

import java.util.ArrayList;
import java.util.List;

import exception.ProfissionalSaudeException;
import model.ProfissionalSaude;
import model.TipoProfissional;
import android.location.Criteria;

public interface DAOInterface {

	/**
	 * Persiste um entidade no BD
	 * 
	 * @param T
	 *            entity
	 */
	<T> void persistir(T entity) throws ProfissionalSaudeException;

	/**
	 * Atualiza uma instancia de uma entidade no BD
	 * 
	 * @param entity
	 */
	<T> void update(T entity);

	/**
	 * Remove de forma permanente uma instancia de uma entidade do BD
	 * 
	 * @param entity
	 * @throws ProfissionalSaudeException 
	 */
	<T> void remover(T entity) throws ProfissionalSaudeException;

	/**
	 * Retornar todas as instancias de uma entidade presentes no BD
	 * 
	 * @return List<T> resultados
	 * @throws ProfissionalSaudeException 
	 */
	List<ProfissionalSaude> findAll() throws ProfissionalSaudeException;

	/**
	 * Realiza uma busca por ID em todas as entidades que estão presentes no BD
	 * 
	 * @param id
	 * @return
	 */
	ProfissionalSaude findById(int id);

	/**
	 * Retorna uma lista de resultados de uma consulta passada como parámetro.
	 * Criteria funciona como uma consulta sql.
	 * 
	 * @param Criteria
	 *            consulta
	 * @return List<T> resultados
	 */
	List<ProfissionalSaude> findByCriteira(Criteria consulta);
	
	ArrayList<ProfissionalSaude> buscaSimples(String tipo,
			String especialidade, String convenio, String cidade) throws ProfissionalSaudeException;
	
	List<ProfissionalSaude> findByTipo(String tipo) throws ProfissionalSaudeException;
}
