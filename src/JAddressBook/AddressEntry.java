/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAddressBook;

import java.util.Objects;

/**
 *
 * @author alessandrogiaquinto
 */
public class AddressEntry{

    public AddressEntry(String user, String telephone) {
        this.user = user;
        this.telephone = telephone;
    }

    public AddressEntry(String user, String telephone, String email) {
        this.user = user;
        this.telephone = telephone;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj instanceof AddressEntry) {
            return false;
        }
        
        AddressEntry t = (AddressEntry)obj;
        
        return t.getUser().equals(this.user) && t.getTelephone().equals(this.telephone);
    }
 
    
    
    private String user,telephone,email;
}
