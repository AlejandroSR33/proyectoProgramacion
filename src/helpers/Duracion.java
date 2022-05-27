package helpers;

public class Duracion {
    private static vista.reservas.InterfazReserva vista;

    public static boolean insertarDuracion(String duracion){
        if (Integer.parseInt(vista.getTextoDuracion().getText()) < 1 && Integer.parseInt((vista.getTextoDuracion().getText()))> 7){
            return false;
        }
        return true;
    }
}
