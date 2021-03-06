
import javax.swing.JOptionPane;


public class Jugador implements Constantes {
    public int posicionX;
    public int posicionY;
    public Escenario escenario;
   
    
    public Jugador(Escenario escenario){
    
        posicionX=0;
        posicionY=0;
        this.escenario=escenario;
        
    
    }
    
     public boolean puedeMoverse(int posicionX, int posicionY){
       if(posicionX<NUMERO_CELDAS_ANCHO && posicionX>-1 && posicionY<NUMERO_CELDAS_LARGO && posicionY>-1 && escenario.celdas[posicionX][posicionY].tipo!='O'){
           return true;
           
       }    
       return false;
   }
    
    public void moverArriba(){
        if(posicionY>-1 && puedeMoverse (posicionX, posicionY-1 )){
           if(escenario.celdas[posicionX][posicionY-1].tipo=='P'){
               JOptionPane.showMessageDialog(null, "Perdiste", "Mensaje", JOptionPane.WARNING_MESSAGE);
               escenario.dondeSeDibuja.ventana.dispose();
        }
           if(escenario.celdas[posicionX][posicionY-1].tipo=='F'){
               escenario.celdas[posicionX][posicionY].tipo
           
           
           }
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[posicionX][--posicionY].tipo='J';
        }
    }
    
    public void moverAbajo(){
        if(posicionY<NUMERO_CELDAS_LARGO && puedeMoverse(posicionX,posicionY +1)){  
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[posicionX][++posicionY].tipo='J';
    
        }
    }
    
    public void moverIzquierda(){
        if(posicionX>0 && puedeMoverse(posicionX -1,posicionY)){
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[--posicionX][posicionY].tipo='J';
            
        }
    }
    
    public void moverDerecha(){
        if(posicionX< NUMERO_CELDAS_ANCHO && puedeMoverse(posicionX +1,posicionY)){
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[++posicionX][posicionY].tipo='J';
   
        }
    }
    
    
}
