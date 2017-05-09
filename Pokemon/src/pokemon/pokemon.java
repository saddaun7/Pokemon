/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author User
 */
public class pokemon {
    public JSONArray name,ch,iv,bu,Ek,pi,ra;
    public String lv;
	public  int heal,heal1,heal2,heal3,heal4,heal5;
	public  int atk,atk2,atk3,atk4,atk5,atk6;
    public pokemon(){
        this.heal = 0;	  
         this.heal1 = 0;
	    this.heal2 = 0;
	    this.heal3 = 0;
	    this.heal4 = 0;
	    this.heal5 = 0;
	    this.atk = 0;
	    this.atk2 = 0;
	    this.atk3 = 0;
	    this.atk4 = 0;
	    this.atk5 = 0;
	    this.atk6 = 0;
        JSONParser parser = new JSONParser();
        
        try {
            Object obj = parser.parse(new FileReader("D:\\Pokedex.json"));
            JSONObject json = (JSONObject) obj;
            lv = (String) json.get("Lv");
		       name = (JSONArray)json.get("name");
		       ch = (JSONArray)json.get("Charmeleon");
		       iv = (JSONArray)json.get("Ivysaur");
		       bu = (JSONArray)json.get("Butterfree");
		       Ek = (JSONArray)json.get("Ekans");
		       pi = (JSONArray)json.get("Pidgeotto");
		       ra = (JSONArray)json.get("Rattata");	
            } catch(Exception e) {
           JOptionPane.showMessageDialog(null,"Dowload JSON in GITHUB to Drive D Only !!!!");
        }
       
    }
}
