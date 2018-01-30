/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.user;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless(mappedName="userbean")
public class UserBean implements UserBeanRemote {
    
    @PersistenceContext
    EntityManager em;

    @Override
    public void addUser(user user) {
       em.persist(user);
        em.flush();
    }

    
    
}
