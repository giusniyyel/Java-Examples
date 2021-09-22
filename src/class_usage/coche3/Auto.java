package class_usage.coche3;

public class Auto {
    String marca;
    String modelo;
    int año;
    String placa;
    String transmitiontype;
    String color;
    boolean metalic;
    
    public Auto(String marca, String modelo, int año, String placa, String type, String color, boolean metalic){
      this.marca=marca;
      this.modelo=modelo;
      this.año=año;
      this.placa=placa;
      this.transmitiontype=type;
      this.color=color;
      this.metalic=metalic;
    }
    
    public void getAll(){
        System.out.print("Marca: "+marca+"\n");
        System.out.print("Modelo: "+modelo+"\n");
        System.out.print("Año: "+año+"\n");
        System.out.print("Placa: "+placa+"\n");
        System.out.print("Tipo de transmición: "+transmitiontype+"\n");
        System.out.print("Color: "+color+"\n");
        System.out.print("Metalizado: "+((metalic)?"Si":"No")+"\n");
    }
}