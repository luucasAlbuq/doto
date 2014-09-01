package util;

public enum Convenio {
	
	UNIMED("Unimed"),BRADESCO("Bradesco Saúde"),AMIL("Amil"),MEDIAL("Medial Saúde"),SULAMERICA("Sul América"),
	AMICO("Amico Saúde"),GOLDEN_CROSS("Golden Cross"),SIMLE("Smile");
	
	private final String conv;
	
    private Convenio(String conv) {
		this.conv=conv;
	} 

    @Override
    public String toString() {
        return conv;
    }
}
