package controller;

import java.awt.Color;

/**
 *
 * @author Cesar A. Villamizar C.
 */
public class Block {

    private int hora;
    private int horaFin;
    private int dia;
    private String clsRoom;
    private Color[] colors;
    private String Asignatura;

    public Color[] getColors() {
        return colors;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }  

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }   
    
    public String getSalon(){
        return this.clsRoom;
    }
    
    public int getHora() {
        return hora;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public int getDia() {
        return dia;
    }
        
    public Block(int hora, int horaFin, int dia, String salon) {
        this.hora = hora;
        this.horaFin = horaFin;
        this.dia = dia;
        this.clsRoom=salon;
    }

    public boolean isOverlappedWith(Block block) {
            if (block.dia != this.dia) {
                return false;
            }
            int inf = this.hora;
            int sup = this.horaFin;
            int ini = block.getHora();
            int fin = block.getHoraFin();
            if ((ini >= inf) && (ini < sup) || (fin > inf) && (fin <= sup)) {
                return true;
            }
        return false;
    }
        
    @Override
    public String toString(){
        return this.clsRoom+":"+this.Asignatura;
    }
}
