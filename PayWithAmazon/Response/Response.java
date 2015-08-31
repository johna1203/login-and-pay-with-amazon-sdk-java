/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PayWithAmazon.Response;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.jsoup.nodes.Document;
import org.xml.sax.InputSource;
/**
 *
 * @author nehaa
 */
public class Response {
    
    private int statusCode;
    private String xmlString;
    private Document documentResponse;

    public void setXmlString(String xmlString) {
        this.xmlString = xmlString;
    }
    
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    
    public void setDocumentResponse(Document document) {
        this.documentResponse = document;
    }
    
    public int getStatusCode() {
        return statusCode;
    }
    public String getString() {
        return xmlString;
    }
}

