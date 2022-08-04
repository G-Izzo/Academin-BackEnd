package it.ibs.registro.model;

import java.util.HashMap;
import java.util.Map;

enum Rating {	
	
	
	ASSENTE("Assente",0),
	INSUFFICIENTE("Insufficiente", 1),
	DISCRETO("Discreto", 2),
	BUONO("Buono",3),
	MOLTO_BUONO("Molto buono",4),
	OTTIMO("Ottimo",5);
	
	private static final Map<String, Rating> BY_LABEL = new HashMap<>();
    private static final Map<Integer, Rating> BY_VOTE = new HashMap<>();
    
    static {
        for (Rating r : values()) {
            BY_LABEL.put(r.label, r);
            BY_VOTE.put(r.vote, r);            
        }
    }
	
	private String label;
	private int vote;
	private Rating(String label, int vote) {
		this.label = label;
		this.vote = vote;
	}


	  public static Rating valueOfLabel(String label) {
	        return BY_LABEL.get(label);
	    }

	    public static Rating valueOfVote(int number) {
	        return BY_VOTE.get(number);
	    }
	
	
	
	
	
	};
	


	
	