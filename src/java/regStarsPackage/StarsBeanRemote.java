/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regStarsPackage;

import java.util.List;

/**
 *
 * @author user
 */
public interface StarsBeanRemote {
    //void addStar ();
    void changeStar();
    void deleteStar();
        
    public void addStar(star s);
}
