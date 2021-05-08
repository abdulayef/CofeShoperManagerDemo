/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretes;

import abstracts.CostumerCheckService;
import entities.Costumer;

public class CostumerCheckManager implements CostumerCheckService {

    @Override
    public boolean checkRealPerson(Costumer costumer) {
        return true;
    }

}
