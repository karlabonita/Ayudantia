
import java.util.TimerTask;


public class Pelota extends TimerTask implements Constantes{
    public int posX;
    public int posY;
     public Escenario escenario;
    
    public Pelota(int _posX, int _posY, Escenario _escenario){
    
        posX= _posX;
        posY=_posY;
        escenario = _escenario;
        escenario.celdas[posX][posY].tipo='P';
    }
    
    
    
    @Override
    public void run() {
     
        
        escenario.celdas[posX][posY].tipo='V';
        if(++posY==NUMERO_CELDAS_LARGO){
            posY =0;
        
            
            
        escenario.celdas[posX][posY].tipo='P';
        escenario.dondeSeDibuja.repaint();
        }
        
    }
    
}
