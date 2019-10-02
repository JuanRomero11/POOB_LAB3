
package aplicacion;
import java.util.*;

/**
 * @author ECI 2014
 * 
 */
/**
 * @author ECI
 *
 */
public class Teatro{
    public static final int MAXIMO = 500;
    private static Teatro teatro = null;
    public static Teatro demeTeatro() {
        if (teatro==null){
            teatro=new Teatro();
        }
        return teatro;
    }

    private static void nuevoTeatro() {
        teatro=new Teatro();
    }   

    public static void cambieTeatro(Teatro d) {
        teatro=d;
    }       

    private ArrayList<EnEscena> elementos;
    private Teatro() {
        elementos= new ArrayList<EnEscena>();
    }

    public void algunosEnEscena(){
        Actor romeo = new Actor(teatro,"romeo",100,100);
        Actor julieta = new Actor(teatro,"julieta",200,100);
        Actor homer = new Actor(teatro,"homer",300,100);
        Actor bard = new Actor(teatro,"bard",400,100);
        adicione(romeo);
        adicione(julieta);
        adicione(homer);
        adicione(bard);
    }  

    public EnEscena demeEnEscena(int n){
        EnEscena h=null;
        if (1<=n && n<=elementos.size()){
            h=elementos.get(n-1);
        }    
        return h; 
    }

    public void adicione(EnEscena e){
        elementos.add(e);
    }

    public int numeroEnEscena(){
        return elementos.size();
    }

    public void accion(){
        for(int i=0;i<elementos.size();i++){
            if(i<2){
                elementos.get(i).actue();
            }else{
                elementos.get(i).corte();
            }   
        }
    }

    public void corten(){
        for(int i=0;i<elementos.size();i++){
            if(i<2){
                elementos.get(i).corte();
            }else{
                elementos.get(i).actue();
            }   
        }
    }   

    public void decidan(){
        for(EnEscena t: elementos){
            t.decida();
        }
    }  

}
