package decoretor.csv;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class CSVWriter extends Writer {

	private BufferedWriter buffWriter = null;
	private Separator separator = Separator.COMMA;

	//----------------------------------------
	public CSVWriter(Writer out) 
	{
		super(out);
		
		if (!(out instanceof BufferedWriter))
			out = new BufferedWriter(out);

		this.buffWriter = (BufferedWriter) out;
	}
	//----------------------------------------
	@Override
	public void flush() throws IOException {
		this.buffWriter.flush();
		
	}
	//----------------------------------------
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		this.buffWriter.write(cbuf,off,len);
		
	}

	
	//----------------------------------------
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	//----------------------------------------
	public void newLine() throws IOException
	{
		this.buffWriter.close();
	}
	
	//----------------------------------------
	public void setSeparator(Separator newSeparator) {
		separator =  newSeparator;
	}
	//----------------------------------------
	public void writeSeparator() throws IOException {
		buffWriter.append(separator.asChar());
	}
	
	//----------------------------------------
	
	public void writeToken(String token) throws IOException
	{
		buffWriter.append(token);
	}
	
	//----------------------------------------
	public void writeTokenAndSeparator(String token) throws IOException{
		buffWriter.append(token);
		buffWriter.append(separator.asChar());
	}
	//----------------------------------------
	public void writeTokens(String[] tokens) throws IOException{
		for (int i = 0; i < tokens.length;) {
			buffWriter.append(tokens[i]);
			if(++i < tokens.length)
				buffWriter.append(separator.asChar());
		}
	}
	//----------------------------------------
	public void writeLine(String[] tokens) throws IOException{
		writeTokens(tokens);
		buffWriter.newLine();
	}
}
