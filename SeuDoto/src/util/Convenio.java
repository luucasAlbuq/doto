package util;

public enum Convenio {
	
	UNIMED("Unimed"), SMILE("Smiles"), UNIDENTES("Unidestes");
	
	private final String conv;
	
    private Convenio(String conv) {
		this.conv=conv;
	} 

    @Override
    public String toString() {
        return conv;
    }
}
