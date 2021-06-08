/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive (String itemID, String itemName) {
        this.identifier = itemID;
        this.name = itemName;
    }
    
    public String getID() {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedItem = (Archive) compared;
        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        }
        
        return false;
    }
    
}
