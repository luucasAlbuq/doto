package dao;

import java.util.List;

import model.ProfissionalSaude;
import android.location.Criteria;

public interface DAOInterface {

	/**
	 * Persiste um entidade no BD
	 * 
	 * @param T
	 *            entity
	 */
	<T> void persistir(T entity);

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
	 */
	<T> void remover(T entity);

	/**
	 * Retornar todas as instancias de uma entidade presentes no BD
	 * 
	 * @return List<T> resultados
	 */
	List<ProfissionalSaude> findAll();

	/**
	 * Realiza uma busca por ID em todas as entidades que est�o presentes no BD
	 * 
	 * @param id
	 * @return
	 */
	ProfissionalSaude findById(int id);

	/**
	 * Retorna uma lista de resultados de uma consulta passada como par�metro.
	 * Criteria funciona como uma consulta sql.
	 * 
	 * @param Criteria
	 *            consulta
	 * @return List<T> resultados
	 */
	List<ProfissionalSaude> findByCriteira(Criteria consulta);
}
