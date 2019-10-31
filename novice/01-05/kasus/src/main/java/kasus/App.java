/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kasus;

import java.io.*;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * perbadingan membaca data dari format xml dan json
 * pada kasus ini membaca data dari xml lebih cepat dari sisi performa
 */


public class App {

    private static void parseEmployeeObject(JSONObject employee){
        // JSONObject employeeObject = (JSONObject)employee.get("employe"); pakai jsonObject dulu jika json nya punya object di awal
        
        String nama = (String)employee.get("nama");
        System.out.println(nama);

        String alamat = (String)employee.get("alamat");
        System.out.println(alamat);

        String noHp = (String)employee.get("no_hp");
        System.out.println(noHp);
    }

    public static void main(String[] args) {

        // membaca file xml
        try {
            File xmlFile = new File("input.xml");
            DocumentBuilderFactory dBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dBuilderFactory.newDocumentBuilder();
            Document document = dBuilder.parse(xmlFile);

            System.out.println("Root element : " + document.getDocumentElement().getNodeName());
            NodeList nodeList = document.getElementsByTagName("class");

            System.out.println("--------------------------");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nCurrent Element : "+ node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element)node;

                    System.out.println("Nama atribut xml : " + element.getAttribute("studen"));
                    System.out.println("Nama depan : " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Nama belakang : " + element.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Umur : " + element.getElementsByTagName("marks").item(0).getTextContent());

                }
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        
        // membaca file json
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("data.json")){
            
            Object object = jsonParser.parse(reader);

            JSONArray dataEmploye = (JSONArray) object;
            System.out.println(dataEmploye);

            dataEmploye.forEach( emp -> parseEmployeeObject((JSONObject) emp));

        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

        // Membuat file json
        JSONObject employeDetails = new JSONObject();
        employeDetails.put("FirstName", "Lokesh");
        employeDetails.put("lastName", "Gupta");
        employeDetails.put("website", "howtodoinjava.com");

        JSONObject employeObject = new JSONObject();
        employeObject.put("employe", employeDetails);

        JSONObject employeDetails2 = new JSONObject();
        employeDetails2.put("firstName", "Brian");
        employeDetails2.put("lastName", "Schultz");
        employeDetails2.put("website", "example.com");

        JSONObject employeObject2 = new JSONObject();
        employeObject2.put("employe", employeDetails2);

        JSONArray employeList = new JSONArray();
        employeList.add(employeObject);
        employeList.add(employeObject2);

        try (FileWriter file = new FileWriter("employees.json")){
            file.write(employeList.toJSONString());
            file.flush();
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
