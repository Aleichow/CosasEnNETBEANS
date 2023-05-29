package Entidades;

/**
 *
 * @author franco
 */
public final class Televisor extends Electrodomestico {
    private int pulgadas;
    private boolean TDT;

    public Televisor() {
        super();
    }

    public Televisor(int pulgadas, boolean TDT, Integer precio, String color, Integer peso, String letra) {
        super(precio, color, peso, letra);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + "pulgadas=" + pulgadas + ", TDT=" + TDT + '}';
    }
    

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
        crearElectrodomestico();
        System.out.println("Indique las pulgadas del televisor");
        pulgadas = leer.nextInt();
        
        System.out.println("Tiene sintonizador TDT? (S/N)");
        String var = leer.next().toUpperCase();
        
        if(var.equals("S")){
            TDT = true;
        }
    }

    @Override
    public int precioFinal() {
       int p = super.precioFinal(); 
       
       if(pulgadas >40){
           p = p * 30 /100;
       }
       if(TDT=true){
           p +=500;
       }
       return p;
    }
    
    
}