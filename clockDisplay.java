/**
 * Imaginemos que tenemos un amigo programador en Java como nosotros 
 * que quiere hacer una aplicación para teléfonos Android 
 * consistente en un reloj en formato 24 horas, 
 * que muestre las horas y minutos desde las 00:00 hasta las 23:59.
 */
public class clockDisplay
{
    // Atributo para controlar las horas
    private int horas;
    // Atributo para controlar los minutos
    private int minutos;
 
    /**
     * Constructor for objects of class clockDisplay
     */
    public clockDisplay()
    {
        horas = 0;
        minutos = 0;
    }

    /**
     * Metodo que permite fijar la hora y los minutos.
     */
    public void setTime(int hora,int min)
    {
        if (hora <= 23 & hora >= 0 & min >= 0 & min <= 59){
            horas = hora;
            minutos = min;
        }
        else{
            System.out.println("La hora introducida no es válida");
        }
    }
    
    /**
     * Metodo que permite avanzar un minuto.
     */
    public void timeTick()
    {
        horas = horas;
        minutos = minutos + 1;
        if (minutos == 60){
            horas = horas + 1;
            minutos = 0;
        }
        if (horas == 24){
            horas = 0;
        }
    }
    
    /**
     * Metodo que devuelve la hora y los minutos separados por dos puntos
     * Siempre con formato "hh:mm" de 5 dígitos
     */
    public String getTime()
    {
        String time = horas + ":" + minutos;
        if (time.length() == 3){
            time = "0" + horas + ":" + "0" + minutos;
        }
        else if (time.length() == 4){
            if (horas < 10){
                time = "0" + horas + ":" + minutos;
            }
            else{
                time = horas + ":" + "0" + minutos;
            }
        }    
        return time;
    }
}
