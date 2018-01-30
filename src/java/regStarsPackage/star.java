/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regStarsPackage;

import Entity.user;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Stateless
@Table (name="star")

@SequenceGenerator(name="seq", initialValue=1, allocationSize=1)
public class star implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //по умолчанию
    
    
    private String starName;
    private String starCoordinateX;
    private String starCoordinateY;
    
              
   /*@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    public user user;    

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }  */
   
   
     public star() {
        super();
    }
      public star(String starName, String starCoordinateX, String starCoordinateY) {
        this.starName = starName;
        this.starCoordinateX = starCoordinateX;
        this.starCoordinateY = starCoordinateY;
      }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public String getStarCoordinateX() {
        return starCoordinateX;
    }

    public void setStarCoordinateX(String starCoordinateX) {
        this.starCoordinateX = starCoordinateX;
    }

    public String getStarCoordinateY() {
        return starCoordinateY;
    }

    public void setStarCoordinateY(String starCoordinateY) {
        this.starCoordinateY = starCoordinateY;
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
        if (!(object instanceof star)) {
            return false;
        }
        star other = (star) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "regStarsPackage.StarsEntity[ id=" + id + " ]";
    }
    
}
