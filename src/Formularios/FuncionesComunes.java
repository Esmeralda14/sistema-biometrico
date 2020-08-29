package Formularios;

public class FuncionesComunes {
    
    public boolean validarHora(String Hora){
        boolean respuesta = false;
        try{
            char[] a = Hora.toString().toCharArray();
            String[] c = Hora.split(":");
            if(   (a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ') || (a[3] == ' ') || (a[4] == ' ')  ||
                   (getEntero(c[0])>24) || (getEntero(c[1])>59)   ){
                    return respuesta;
            }
            else{
                respuesta = true;
            }
        }catch(Exception ex){
           return respuesta;  
       }
        
        return respuesta;
    }
    private int getEntero(String valor){
        int entero = Integer.parseInt(valor);
        return entero;
    }
    
}
