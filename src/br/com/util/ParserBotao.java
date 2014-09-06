package br.com.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParserBotao {

    public void gravaListaCompleta() {

        List<Botao> botoes = new ArrayList<Botao>();
        XStream parser = new XStream(new DomDriver());
        parser.setMode(XStream.NO_REFERENCES);

        Botao botao1 = new Botao();
        botao1.setTexto("Andii");

        Botao botao2 = new Botao();
        botao2.setTexto("Maria");

        botoes.add(botao1);
        botoes.add(botao2);

        XStream xStream = new XStream();

        xStream.alias("botoes", List.class);
        xStream.alias("botao", Botao.class);

        File arquivo = new File("botoes.xml");
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xStream.toXML(botoes).getBytes());
            gravar.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void gravaCadastro(String id,String texto) {

        List<Botao> botoes = new ArrayList<Botao>();
        XStream parser = new XStream(new DomDriver());
        parser.setMode(XStream.NO_REFERENCES);

        botoes = listarBotoes();
        //botoes.size()
        for (int i = 0; i < 12; i++) {
            if (botoes.get(i).getId().equalsIgnoreCase(id)) {
                if(texto == null || texto.isEmpty()){
                    texto = "Sem texto";
                }
                botoes.get(i).setTexto(texto);
               
            }
        }

        XStream xStream = new XStream();

        xStream.alias("botoes", List.class);
        xStream.alias("botao", Botao.class);

        File arquivo = new File("botoes.xml");
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xStream.toXML(botoes).getBytes());
            gravar.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void lerArquivo() {
        String arquivoXML = "botoes.xml";
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(arquivoXML);

            Element raiz = doc.getDocumentElement();
            //System.out.println("O elemento raiz é: " + raiz.getNodeName());

            NodeList listaContatos = raiz.getElementsByTagName("botao");

            List<Botao> lista = new ArrayList<Botao>(listaContatos.getLength());

            //Passo 3: obter os elementos de cada elemento contato
            for (int i = 0; i < listaContatos.getLength(); i++) {
                //como cada elemento do NodeList é um nó, precisamos fazer o cast
                Element elementoContato = (Element) listaContatos.item(i);

                NodeList listaTextos = elementoContato.getElementsByTagName("texto");
                Node texto = listaTextos.item(0).getFirstChild();

                NodeList listaId = elementoContato.getElementsByTagName("id");
                Node id = listaId.item(0).getFirstChild();
                System.out.println("id: " + id.getNodeValue());

            }

        } catch (Exception e) {
        }
    }

    public int getUltimoId() {
        int id = 0;
        String arquivoXML = "pessoas.xml";
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(arquivoXML);

            //Passo 1: obter o elemento raiz
            Element raiz = doc.getDocumentElement();
            //System.out.println("O elemento raiz é: " + raiz.getNodeName());

            //Passo 2: localizar os elementos filhos da agenda
            NodeList listaContatos = raiz.getElementsByTagName("pessoa");

            List<Botao> lista = new ArrayList<Botao>(listaContatos.getLength());

            //Passo 3: obter os elementos de cada elemento contato
            for (int i = 0; i < listaContatos.getLength(); i++) {
                //como cada elemento do NodeList é um nó, precisamos fazer o cast
                Element elementoContato = (Element) listaContatos.item(i);

//                NodeList listaNomes = elementoContato.getElementsByTagName("nome");
//                Node nome = listaNomes.item(0).getFirstChild();
                NodeList listaId = elementoContato.getElementsByTagName("id");
                Node nodoId = listaId.item(0).getFirstChild();
                id = Integer.parseInt(nodoId.getNodeValue());

                //System.out.println("id: " + id.getNodeValue());
            }

        } catch (Exception e) {
        }

        return id;
    }

    public List<Botao> listarBotoes() {
        String arquivoXML = "botoes.xml";
        List<Botao> botoes = new ArrayList<Botao>();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(arquivoXML);

            Element raiz = doc.getDocumentElement();
            NodeList listaBotoes = raiz.getElementsByTagName("botao");

            List<Botao> lista = new ArrayList<Botao>(listaBotoes.getLength());
            for (int i = 0; i < listaBotoes.getLength(); i++) {
                Element elementoContato = (Element) listaBotoes.item(i);

                NodeList listaId = elementoContato.getElementsByTagName("id");
                Node nodoId = listaId.item(0).getFirstChild();

                NodeList listaTextos = elementoContato.getElementsByTagName("texto");
                Node nodoTexto = listaTextos.item(0).getFirstChild();

//                System.out.println("nome "+nodoNome.getNodeValue()+"\nlogin "+nodoLogin.getNodeValue()+"\nsenha "+nodoSenha.getNodeValue());
        
                Botao botao = new Botao();
                botao.setId(nodoId.getNodeValue());
                botao.setTexto((nodoTexto.getNodeValue().isEmpty()) ? "Sem texto" : nodoTexto.getNodeValue());
                botoes.add(botao);
            }
        } catch (Exception e) {
        }

        return botoes;
    }

}
