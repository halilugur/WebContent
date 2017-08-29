/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Halil
 */
public class WebUrl {
    private String url;
    private String istekSayisi;

    public WebUrl() {
    }

    public WebUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIstekSayisi() {
        return istekSayisi;
    }

    public void setIstekSayisi(String istekSayisi) {
        this.istekSayisi = istekSayisi;
    }
    
}
