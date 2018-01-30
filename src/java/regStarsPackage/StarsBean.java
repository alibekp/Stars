/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regStarsPackage;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author user
 */
@Stateless(mappedName="starbean")
public class StarsBean implements StarsBeanRemote {
    
    @PersistenceContext
    EntityManager em;
        
    @Override
    public void changeStar() {
        
    }
   
    //@Override
      //public void addStar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    @Override
    public void addStar(star s) {
        em.persist(s);
        em.flush();
    }
    
    @Override
    public void deleteStar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

          
}
