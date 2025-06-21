package core;

import java.util.HashMap;
import java.util.Map;

import services.CompteServiceBD;
import services.CompteServiceList;
import views.CompteViewConsole;

public class Container {
    private Map<DependanceName,Object> container=new HashMap<>();

    public Container(){
        container.put(DependanceName.CompteService, new CompteServiceBD());
          container.put(DependanceName.CompteView, new CompteViewConsole());
    }
    public Object getDependency(DependanceName key){
          return container.get(key);
    }

}
