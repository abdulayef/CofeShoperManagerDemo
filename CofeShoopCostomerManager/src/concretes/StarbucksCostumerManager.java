package concretes;

import abstracts.CostumerCheckService;
import abstracts.CostumerManagerBase;
import entities.Costumer;

public class StarbucksCostumerManager extends CostumerManagerBase {
    
    public CostumerCheckService costumerCheckService;
    
    public StarbucksCostumerManager(CostumerCheckService costumerCheckService) {
        this.costumerCheckService = costumerCheckService;
    }
    
    @Override
    public void save(Costumer costumer) {
        if (costumerCheckService.checkRealPerson(costumer)) {
            super.save(costumer);
        } else {
            throw new IllegalArgumentException();
        }
        
    }
    
}
