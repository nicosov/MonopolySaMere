/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Jeu.Message;
import Jeu.Observateur;

/**
 *
 * @author girina
 */
public abstract class Carte {
    private TypeCarte typeCarte;
    private String description;
    private Observateur observateur;

    public Carte(TypeCarte typeCarte, String description) {
        this.typeCarte = typeCarte;
        this.description = description;
    }
    
    public abstract Message actionCarte(Joueur aJ);
    
    public TypeCarte getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(TypeCarte typeCarte) {
        this.typeCarte = typeCarte;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
