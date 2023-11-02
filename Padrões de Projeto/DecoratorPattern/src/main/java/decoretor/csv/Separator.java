package decoretor.csv;

public enum Separator {
	
	COMMA(','), 
	SEMICOLON(';'), 
	COLON(':'), 
	TAB('\t'), 
	SPACE(' '), 
	PIPE('|');
    
	//--------------------------
	private char value = ',';
    
	
	//--------------------------
	private Separator(char value) {
		this.value = value;
	}

    //--------------------------
	public char asChar() {
		return this.value;
	}
	
	//------------------
	static public Separator getSeparatorFor(char symbol)
	{
		Separator[] values = Separator.values();
		for(Separator separator : values)
			if(separator.asChar() == symbol)
				return separator;
		throw new RuntimeException("Invalida Separator '" + symbol + "'");
	}
};
