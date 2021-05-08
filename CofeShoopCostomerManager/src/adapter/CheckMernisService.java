
package adapter;

import abstracts.CostumerCheckService;
import entities.Costumer;


public class CheckMernisService implements CostumerCheckService{

    @Override
    public boolean checkRealPerson(Costumer costumer) {
        System.out.println("Cheked with Mernis Service");
        return true;
     }
    
}
