import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import org.jdom.output.XMLOutputter;

public class AlunoXML {

	public void gravar(Aluno alu) {
		XMLOutputter xout = new XMLOutputter();	
		FileWriter writer;
		try {
			DocumentBuilderFactory dbf =DocumentBuilderFactory. newInstance();

	        DocumentBuilder dc = dbf.newDocumentBuilder();

	        Document d = dc. newDocument();

	           writer = new FileWriter("aluno.xml ");
	           writer.write(xout.);
	           writer.close();
	        
			
		} catch (IOException e) {
			e.printStackTrace();
	}
}
	
}
