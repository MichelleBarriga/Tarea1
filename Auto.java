
/**
 * Write a description of class Auto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Auto
{
    private String modelo;
    private String color;
    private String placa;
    private String pais;

    public Auto(String modelo, String color, String placa,String pais)
    {
        this.modelo=modelo;
        this.color=color;
        this.placa=placa;
        this.pais=pais;
    }   
    private String getModelo(){
        return modelo;
    }
    private void setModelo(String nuevo){
        modelo=nuevo;
    }
    private String getColor(){
        return color;
    }
    private void setColor(String nuevo){
        color=nuevo;
    }
    private String getPlaca(){
        return placa;
    }
    private void setPlaca(String nuevo){
        placa=nuevo;
    }
    private String getPais(){
        return pais;
    }
    private void setPais(String nuevo){
        pais=nuevo;
    }
    
    Auto cambiarColor(Auto auto,String nuevo_color)
    {
        setColor(nuevo_color);
        return auto;
    }
    Auto cambiarPais(Auto auto, String nuevo_pais)
    {
        setPais(nuevo_pais);
        return auto;
    }
}
