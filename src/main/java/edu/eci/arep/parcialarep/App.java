/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep.parcialarep;


import edu.eci.arep.parcialarep.operations.Operations;
import spark.Request;
import spark.Response;

import java.util.ArrayList;

import static spark.Spark.*;

/**
 *
 * @author Andrés Quintero
 */
public class App {
    public static void main(String[] args) {
        double arr[] ={60,43.2,89,3,5,45,1720,10,9,1,3,5,7,9,5,5};
        arr = Operations.ordenar(arr);
        Operations.mostrar(arr);
        port(getPort());
        
        get("/", (req, res) -> VistaInicial(req, res));
        get("/results", (req, res) -> respuesta(req, res));
   
        get("/calc", (req, res) -> VistaInicial(req, res));
        
        
    }
    
    private static String respuesta(Request req, Response res) {
        String[] arrs=req.queryParams("num").split(",");
        String ans ="" ;
        double[] data = new double[arrs.length];
        for(int i=0;i<arrs.length;i++){
            data[i] = Double.parseDouble(arrs[i]);
        }
        double[] aux = Operations.ordenar(data);
        ans = String.valueOf(aux[0]);
        for(int i = 1; i<aux.length;i++){
            ans = ans +" , "+ String.valueOf(aux[i]);
        }
        
        
        String pagina
                = "<!DOCTYPE html>" 
                + "<html>" 
                + "<body>"
                + "<center>" 
                + "<h3> ordenamiento: " + ans + "</h3>"
                + "</center>" 
                + "</body>" 
                + "</html>";
        return pagina;
    }
    

    private static  String VistaInicial(Request req, Response res){
        String content = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<center>"
                + "<h2>Taller de verificación de conocimientos técnicos </h2>"
                + "<h3>Ingrese los numeros que quiere ordenar</h3>"
                + "<form action=\"/results\">"
                + "<br>"
                + "<input type=\"text\" name=\"num\" placeholder=\"Ej. 1,2.0,3\">"
                + "<br>"
                + " br> <br>"
                + "<input type=\"submit\" value=\"Calcular\">"
                + "</form>"
                + "</center>"
                + "</body>"
                + "</html>";
        return content;
    }

    
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }

}

