/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import regStarsPackage.star;

/**
 *
 * @author user
 */
@Entity
@Stateless
@Table (name="user")

//@Inheritance( strategy = InheritanceType.JOINED )
@SequenceGenerator(name="seqq", initialValue=1, allocationSize=1)


public class user implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqq")
    private Long id;
    
   
    private String name;
   
    private String password;
    
    
    
    /*@OneToMany(mappedBy = "user",cascade = {CascadeType.ALL}, fetch = FetchType.EAGER )
    private List<star> star;

    public List<star> getStar() {
        return star;
    }

    public void setStar(List<star> star) {
        this.star = star;
    }  */

    public user() {
    }

    public user(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof user)) {
            return false;
        }
        user other = (user) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.User[ id=" + id + " ]";
    }
    
}
