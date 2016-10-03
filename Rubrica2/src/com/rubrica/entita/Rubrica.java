package com.rubrica.entita;

import java.util.Map;
import java.util.TreeMap;

import com.rubrica.eccezione.VoceGiaEsiste;

public class Rubrica {
	
	//ATTRIBUTI
	private String nome;
	private Map<String, Voce> voci = new TreeMap<String, Voce>();
		
	
	public Voce addVoce(String nome, String cognome, int telefono) throws VoceGiaEsiste {
		
		if (voci.containsKey(nome+" "+cognome)) {
			//Voce a = getVoci().get(nome+cognome);
			//if(a.getTelefono()==telefono) {
				throw new VoceGiaEsiste("Nome gia esiste");
			//}
		}
		Voce v = new Voce(nome, cognome, telefono);
		voci.put(nome+" "+cognome, v);
		
		return v;
	}
	
	//COSTRUTTORE
	public Rubrica(){}
	
	public Rubrica(String nome){
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String, Voce> getVoci() {
		return voci;
	}

	public void setVoci(Map<String, Voce> voci) {
		this.voci = voci;
	}
	
			
}
