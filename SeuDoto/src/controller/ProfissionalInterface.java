package controller;

import java.util.List;

import exception.ProfissionalSaudeException;
import util.Convenio;
import util.Especialidade;
import model.Endereco;
import model.ProfissionalSaude;
import model.TipoProfissional;

/**
 * Interface de servi�os basicos para manipula��o de um Profissional, essa
 * interface deve servi como base para os servi�os que ser�o implementados no
 * controller.
 * 
 * @author Lucas
 * 
 */
public interface ProfissionalInterface {

	/**
	 * M�todo responsavel por criar uma instancia da entidade Profissional e
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
	 * M�todo responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa o nome.
	 * 
	 * @param String nome
	 * @return ProfissionalSaude profissional
	 */
	List<ProfissionalSaude> buscarProfissionalPorNome(String nome);

	/**
	 * M�todo responsavel por realizar uma busca de Profissionais tendo como
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
	 * M�todo responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa o n�mero de identifica��o do profissional (ex: CRM).
	 * 
	 * @param int identificacao
	 * @return ProfissionalSaude profissional
	 */
	ProfissionalSaude buscarProfissionalPorIdentificacao(String identificacao);
	
	/**
	 * M�todo responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa � o tipo de profissional (ex: M�dico)
	 * 
	 * @param TipoProfissinal tipo
	 * @return ProfissionalSaude profissionalSaude
	 */
	List<ProfissionalSaude> buscarProfissionalPorTipo(TipoProfissional tipo);

	/**
	 * M�todo responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa todos os atributos de Profissional. O fato de um
	 * atribuito a ser passado ser null implica em uma desconsidera��o do tal, a
	 * consuta deve considerar apenas atributos n�o nulos portanto deve haver ao
	 * menos um que n�o seja nulo.
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
	 * M�todo responsavel por atualizar um entidade Profissional, ap�s
	 * modifica��es em algum atributo de profissional o m�todo deve ser chamado
	 * para consolidar a mudan�a no BD.
	 * 
	 * @param ProfissionalSaude profissional
	 */
	void atualizarProfissional(ProfissionalSaude profissional);

	/**
	 * M�otodo responsavel por remover uma entidade Profissional de forma
	 * permanente do BD.
	 * 
	 * @param ProfissionalSaude profissional
	 * @throws ProfissionalSaudeException 
	 */
	void removerProfissional(ProfissionalSaude profissional) throws ProfissionalSaudeException;

}
