package controller;

import java.util.List;

import exception.ProfissionalSaudeException;
import util.Convenio;
import util.Especialidade;
import model.Endereco;
import model.ProfissionalSaude;
import model.TipoProfissional;

/**
 * Interface de serviços basicos para manipulação de um Profissional, essa
 * interface deve servi como base para os serviços que serão implementados no
 * controller.
 * 
 * @author Lucas
 * 
 */
public interface ProfissionalInterface {

	/**
	 * Método responsavel por criar uma instancia da entidade Profissional e
	 * persisti-la no BD.
	 * 
	 * @param String nome
	 * @param TipoProfissinal tipoProfissinal
	 * @param int identificacao
	 * @param Especialidade especialidade
	 * @param Endereco endereco
	 * @param Convenio convenio
	 * @throws ProfissionalSaudeException 
	 */
	void cadastrarProfissionalSaude(String nome,String tipoProfissinal, String identificacao,String especialidade, String convenio) throws ProfissionalSaudeException;

	/**
	 * Método responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa o nome.
	 * 
	 * @param String nome
	 * @return ProfissionalSaude profissional
	 */
	List<ProfissionalSaude> buscarProfissionalPorNome(String nome);

	/**
	 * Método responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa a especialidade de um profissional.
	 * 
	 * @param Especialidade
	 *            especialidade
	 * @return ProfissionalSaude profissional
	 * @throws ProfissionalSaudeException 
	 */
	List<ProfissionalSaude> buscarProfissionalPorEspecialidade(
			Especialidade especialidade) throws ProfissionalSaudeException;

	/**
	 * Método responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa o número de identificação do profissional (ex: CRM).
	 * 
	 * @param int identificacao
	 * @return ProfissionalSaude profissional
	 */
	ProfissionalSaude buscarProfissionalPorIdentificacao(String identificacao);
	
	/**
	 * Método responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa é o tipo de profissional (ex: Médico)
	 * 
	 * @param TipoProfissinal tipo
	 * @return ProfissionalSaude profissionalSaude
	 */
	List<ProfissionalSaude> buscarProfissionalPorTipo(TipoProfissional tipo);

	/**
	 * Método responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa todos os atributos de Profissional. O fato de um
	 * atribuito a ser passado ser null implica em uma desconsideração do tal, a
	 * consuta deve considerar apenas atributos não nulos portanto deve haver ao
	 * menos um que não seja nulo.
	 * 
	 * @param String nome
	 * @param TipoProfissinal tipoProfissinal
	 * @param int identificacao
	 * @param Especialidade especialidade
	 * @param Endereco endereco
	 * @param Convenio convenio
	 * @return ProfissionalSaude profissional
	 */
	ProfissionalSaude buscarProfissional(String nome, TipoProfissional tipoProfissional,int identificacao,
			Especialidade especialidade,  Convenio convenio);

	/**
	 * Método responsavel por atualizar um entidade Profissional, após
	 * modificações em algum atributo de profissional o método deve ser chamado
	 * para consolidar a mudança no BD.
	 * 
	 * @param ProfissionalSaude profissional
	 */
	void atualizarProfissional(ProfissionalSaude profissional);

	/**
	 * Méotodo responsavel por remover uma entidade Profissional de forma
	 * permanente do BD.
	 * 
	 * @param ProfissionalSaude profissional
	 * @throws ProfissionalSaudeException 
	 */
	void removerProfissional(ProfissionalSaude profissional) throws ProfissionalSaudeException;

}
