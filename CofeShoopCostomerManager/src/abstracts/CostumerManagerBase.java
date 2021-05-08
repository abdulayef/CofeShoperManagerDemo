
package abstracts;

import entities.Costumer;

public abstract class CostumerManagerBase implements CostumerService{
    
    @Override
    public void save(Costumer costumer) {
        System.out.println(costumer.firstName+" saved");
      }
    
}
