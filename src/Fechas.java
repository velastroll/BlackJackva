public class Fechas {
    
    public Fechas(){
        
    }
    
    public void setInicio(String date){
            String mes = date.substring(0, 3);
            System.out.println(mes);
    }
    
    public static void main (String args[]){
        
        String date = "Juan 20, 2017";
        String mes = date.substring(0, 3);
        System.out.println(mes);
    }
}