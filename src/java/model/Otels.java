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
public class Otels {
    private String text;
    private String values;

    public Otels() {
    }

    public Otels(String text, String values) {
        this.text = text;
        this.values = values;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
    
    
    
}
