
import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Timer;


public class Lienzo extends Canvas implements Constantes {
    public Escenario escenario;
    public Timer lanzadorTareas;
    public VentanaPrincipal ventana;
    
    public Lienzo(VentanaPrincipal vtn){
            ventana = vtn;
        
            escenario = new Escenario(this);
           
            lanzadorTareas=new Timer();
            
            for(int i=0;i< NUMERO_CELDAS_ANCHO-3;i++){
            lanzadorTareas.scheduleAtFixedRate(escenario.pelotas[i], 0, 1000);
             }
            }
    
    @Override
    public void paint(Graphics g){
        escenario.paintComponent(g);
    
    }
}
