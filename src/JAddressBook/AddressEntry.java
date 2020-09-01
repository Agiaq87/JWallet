/*
Copyright (C) 2020  Alessandro Giaquinto agiaquinto87@gmail.com
This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

    @Override
    public String toString() {
        return "AddressEntry{" + "user=" + user + ", telephone=" + telephone + ", email=" + email + '}';
    }
 
    
    
    private String user,telephone,email;
}
