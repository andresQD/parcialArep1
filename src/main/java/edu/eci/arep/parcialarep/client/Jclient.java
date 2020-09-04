/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep.parcialarep.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Andrés Quintero
 */
public class Jclient {
    public static void main(String[] args) throws Exception {

        URL url1 = new URL("https://arepparc1.herokuapp.com/");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream()))) {

            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }

        System.out.println("JSON RESULTADO:");
        URL url2 = new URL("https://arepparc1.herokuapp.com/results?num=1%2C2.0%2C6%2C0");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url2.openStream()))) {

            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }

}

