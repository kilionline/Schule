/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schuleinfounterricht;

import javafx.scene.paint.Color;


/**
 *
 * @author ki.matheis
 */
public class Mensch {
    //Attribute
    private int age;
    private int heightinCM;
    private String name;
    private String herkunft;
    private Color  color;

    
    //Konstruktor
    Mensch(int agePara, int heightinCMPara, String namePara, String herkunftPara, Color colorPara){
        age = agePara;
        heightinCM = heightinCMPara;
        name = namePara;
        herkunft = herkunftPara;
        color = colorPara;
    }
   
    //Methoden
    void Erzeugen(){
        System.out.println("Der Mensch " + name + " wurde erstellt.");
    }
    
    
}
