package controller;

import java.util.ArrayList;
import java.util.List;

import com.parse.ParseException;

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
	 * Metodo responsavel por criar uma instancia da entidade Profissional e
	 * persisti-la no BD.
	 * 
	 * @param String
	 *            nome
	 * @param TipoProfissinal
	 *            tipoProfissinal
	 * @param int identificacao
	 * @param Especialidade
	 *            especialidade
	 * @param Endereco
	 *            endereco
	 * @param Convenio
	 *            convenio
	 * @throws ProfissionalSaudeException
	 */
	void cadastrarProfissionalSaude(ProfissionalSaude prof)
			throws ProfissionalSaudeException, ParseException;

	/**
	 * Metodo responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa o nome.
	 * 
	 * @param String
	 *            nome
	 * @return ProfissionalSaude profissional
	 */
	List<ProfissionalSaude> buscarProfissionalPorNome(String nome);

	/**
	 * Metodo responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa a especialidade de um profissional.
	 * 
	 * @param Especialidade
	 *            especialidade
	 * @return ProfissionalSaude profissional
	 * @throws ProfissionalSaudeException
	 * @throws ParseException
	 */
	List<ProfissionalSaude> buscarProfissionalPorEspecialidade(
			Especialidade especialidade) throws ProfissionalSaudeException,
			ParseException;

	/**
	 * Metodo responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa o n�mero de identifica��o do profissional (ex: CRM).
	 * 
	 * @param int identificacao
	 * @return ProfissionalSaude profissional
	 */
	ProfissionalSaude buscarProfissionalPorIdentificacao(String identificacao);

	/**
	 * Metodo responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa � o tipo de profissional (ex: M�dico)
	 * 
	 * @param TipoProfissinal
	 *            tipo
	 * @return ProfissionalSaude profissionalSaude
	 */
	List<ProfissionalSaude> buscarProfissionalPorTipo(TipoProfissional tipo);

	/**
	 * Metodo responsavel por realizar uma busca de Profissionais tendo como
	 * atributo de pesquisa todos os atributos de Profissional. O fato de um
	 * atribuito a ser passado ser null implica em uma desconsidera��o do tal, a
	 * consuta deve considerar apenas atributos n�o nulos portanto deve haver ao
	 * menos um que n�o seja nulo.
	 * 
	 * @param String
	 *            nome
	 * @param TipoProfissinal
	 *            tipoProfissinal
	 * @param int identificacao
	 * @param Especialidade
	 *            especialidade
	 * @param Endereco
	 *            endereco
	 * @param Convenio
	 *            convenio
	 * @return ProfissionalSaude profissional
	 */
	ProfissionalSaude buscarProfissional(String nome,
			TipoProfissional tipoProfissional, int identificacao,
			Especialidade especialidade, Convenio convenio);

	/**
	 * M�todo responsavel por atualizar um entidade Profissional, apos
	 * modifica��es em algum atributo de profissional o m�todo deve ser chamado
	 * para consolidar a mudan�a no BD.
	 * 
	 * @param ProfissionalSaude
	 *            profissional
	 */
	void atualizarProfissional(ProfissionalSaude profissional);

	/**
	 * Meotodo responsavel por remover uma entidade Profissional de forma
	 * permanente do BD.
	 * 
	 * @param ProfissionalSaude
	 *            profissional
	 * @throws ProfissionalSaudeException
	 * @throws ParseException
	 */
	void removerProfissional(String profissional)
			throws ProfissionalSaudeException, ParseException;

	
}
