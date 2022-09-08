package dbodbo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ctenar {
String jmeno;
String prijmeni;
String mesto;
String ulice;
String cp;
String psc;
String email;
String tel;



public Ctenar (String jmeno, String prijmeni, String mesto, String ulice, String cp, String psc, String email, String tel){
	this.jmeno = jmeno;
	this.prijmeni = prijmeni;
	this.mesto = mesto;
	this.ulice = ulice;
	this.cp = cp;
	this.psc = psc;
	this.email = email;
	this.tel = tel;
}





public void InsertCtenareZPole(){
	
	

}





@Override
public String toString() {
	return "Ctenar [jmeno=" + jmeno + ", prijmeni=" + prijmeni + ", mesto="
			+ mesto + ", ulice=" + ulice + ", cp=" + cp + ", psc=" + psc
			+ ", email=" + email + ", tel=" + tel + "]";
}






}
