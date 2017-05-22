
package parcial;

import Excepciones.EstacionesException;

public class Ciudad {
    
    private EstacionMeteor[] estaciones;

    public Ciudad(EstacionMeteor[] estaciones) throws EstacionesException{
        this.estaciones = estaciones;
        
        if(estaciones.length<3){
            throw new EstacionesException();
        }
    }
    
}
