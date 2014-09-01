package util;

public enum Convenio {
	
	UNIMED("Unimed"),BRADESCO("Bradesco Sa�de"),AMIL("Amil"),MEDIAL("Medial Sa�de"),SULAMERICA("Sul Am�rica"),
	AMICO("Amico Sa�de"),GOLDEN_CROSS("Golden Cross"),SIMLE("Smile");
	
	private final String conv;
	
    private Convenio(String conv) {
		this.conv=conv;
	} 

    @Override
    public String toString() {
        return conv;
    }
}
