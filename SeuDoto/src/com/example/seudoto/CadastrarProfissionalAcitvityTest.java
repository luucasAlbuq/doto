package com.example.seudoto;



import activity.CadastrarProfissionalActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.example.seudoto.R;
import com.robotium.solo.Solo;

public class CadastrarProfissionalAcitvityTest extends ActivityInstrumentationTestCase2<CadastrarProfissionalActivity> {
	
	private Solo mSolo;
	private final String ERRO = "Os campos Tipo, Nome, Identificação e Especialidade são obrigatórios";
	private final String SUCESSO = "Profissional Cadastrado com Sucesso";

	public CadastrarProfissionalAcitvityTest(){
		super(CadastrarProfissionalActivity.class);
	}
	
	protected void setUp() throws Exception {
		mSolo = new Solo(getInstrumentation(), getActivity());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testeCadastrarComSucesso(){
	
		EditText nome = (EditText) mSolo.getView(R.id.cadastrar_put_nome);
		EditText crm = (EditText) mSolo.getView(R.id.cadastrar_put_crm);
		
		
		mSolo.enterText(nome, "House Record");
		mSolo.enterText(crm, "2223-PB");
		
		//Selecionando Convênio - Unimed
		mSolo.pressSpinnerItem(0, 2);
		
		//Selecioando Especialidade - Cardio
		mSolo.pressSpinnerItem(1, 2);
		
		//Selecioando Tipo Profissional - Medico
		mSolo.pressSpinnerItem(2, 1);
		
		//Clicando no Botao Salvar
		mSolo.clickOnImageButton(0);
		
		mSolo.sleep(100);
		
		mSolo.waitForText(SUCESSO);
		
	}
	
	
	public void testeCadastrarProfissionalSemCamposObrigatorios(){
		
		//Clicando no Botao Salvar
		mSolo.clickOnImageButton(0);
		mSolo.waitForText("Os campos Tipo, Nome, Identificação e Especialidade são obrigatórios");
		
		EditText nome = (EditText) mSolo.getView(R.id.cadastrar_put_nome);
		mSolo.enterText(nome, "House Record");
		
		//Clicando no Botao Salvar
		mSolo.clickOnImageButton(0);
		mSolo.waitForText("Os campos Tipo, Nome, Identificação e Especialidade são obrigatórios");
				
		EditText crm = (EditText) mSolo.getView(R.id.cadastrar_put_crm);
		mSolo.enterText(crm, "2223-PB");
		
		//Clicando no Botao Salvar
		mSolo.clickOnImageButton(0);
		mSolo.waitForText(ERRO);
	}
}