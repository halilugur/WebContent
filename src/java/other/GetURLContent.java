/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import model.Otels;
import model.WebUrl;

/**
 *
 * @author Halil
 */
public class GetURLContent {

    private String webUrl;
    private URL url;

    public GetURLContent(String webUrl) {
        this.webUrl = webUrl;
    }

    public List<Otels> getContent() {
        String inputLine;
        String bufString = "";
        
        List<Otels> otels = new ArrayList<Otels>();
        
        try {
            url = new URL(webUrl);
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()))) {
                boolean getTitle = false;
                boolean getValue = false;
                
                String title = null;
                String value = null;
                
                while ((inputLine = in.readLine()) != null) {
                    inputLine = inputLine.trim();
                    if (getTitle && inputLine != "") {
                        title = inputLine;
                        getTitle = false;
                    }
                    if (inputLine.indexOf("<div class=\"title\">") >= 0) {
                        getTitle = true;
                    }
                    if (getValue && inputLine.indexOf("Puan") >= 0) {
                        value = inputLine;
                        getValue = false;
                    }
                    if (inputLine.indexOf("<div class=\"val\">") >= 0) {
                        getValue = true;
                    }
                    
                    if (title != null && value != null) {
                        Otels otel = new Otels(title, value);
                        title = null;
                        value = null;
                        otels.add(otel);
                    }
                    
                }

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return otels;
    }

}
