package class_usage.programas;

public class Auto {
    String marca;
    private String modelo;
    int año;
    String transmitiontype;
    String color;
    boolean metalic;
    
    public void getAll(){
        System.out.print("Marca: "+marca+"\n");
        System.out.print("Modelo: "+modelo+"\n");
        System.out.print("Año: "+año+"\n");
        System.out.print("Tipo de transmición: "+transmitiontype+"\n");
        System.out.print("Color: "+color+"\n");
        System.out.print("Metalizado: "+((metalic)?"si":"no")+"\n");
    }
}
