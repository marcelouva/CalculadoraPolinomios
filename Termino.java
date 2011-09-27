//package calcupol;

/**
 *
 * @author Marcelo Uva
 */
public class Termino {
    private int valor=0;
    private int exponente=0;

    public Termino(int v , int e){
        this.exponente=e;
        this.valor=v;
    }
    public Termino(){}
    public int getValor(){
        return valor;

    }
    public int getExponente(){
        return exponente;
    }
    public void  setExponente(int e){
        this.exponente = e;
    }
    public void  setValor(int v){
        this.valor = v;
    }


}
