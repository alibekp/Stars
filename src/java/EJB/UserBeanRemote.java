/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.user;
import javax.ejb.Remote;

/**
 *
 * @author user
 */
@Remote
public interface UserBeanRemote {
  
   public void addUser(user user);
   }
