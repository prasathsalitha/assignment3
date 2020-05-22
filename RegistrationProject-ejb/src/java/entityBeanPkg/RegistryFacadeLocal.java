/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityBeanPkg;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hp
 */
@Local
public interface RegistryFacadeLocal {

    void create(Registry registry);

    //void edit(Registry registry);

   // void remove(Registry registry);

    //Registry find(Object id);

    List<Registry> findAll();

   // List<Registry> findRange(int[] range);

   // int count();
    
}
