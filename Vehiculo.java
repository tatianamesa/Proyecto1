public class Vehiculo
{
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano= 10;
    public static int posAnadir = 0;
    private int modelo;
    private double valorComercial;
    private String color;
    private String marca;
    

    public Vehiculo(){

    }

    public Vehiculo(int modelo , String marca, double valorComercial){

        this(modelo,marca,valorComercial,"verde");//invocacion sobre la clase

    }
    public Vehiculo(int modelo , String marca, double valorComercial,String color){
        this.modelo = modelo;
        this.marca = marca;
        this.valorComercial = valorComercial;
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString() {
        String caracteristicas  = "Modelo: "+ this.modelo + ", Marca: "+ this.marca + ",Valor Comercial: "+this.valorComercial + ",Color: "+ this.color;
        return caracteristicas;
    }

    public static void anadirVehiculo(Vehiculo vehiculoAnadir){
        vehiculos[posAnadir]=vehiculoAnadir;
        posAnadir = posAnadir + 1;
    }

    public static String toStringVehiculos(){
        String mensajeFinal = "";
        for(int i=0; i < vehiculos.length; i++){
         if (vehiculos[i]!=null){//tiene que ser diferente a null porque los arreglos van a iniciar como nulo
             mensajeFinal= mensajeFinal+ vehiculos[i].toString() + "\n";
         }

        }
        return mensajeFinal;
    }
    public  static int cantidadVehiculos(){
        return posAnadir;
    }

    public static String vehiculosVerdes() {
        String mensajeFinal = "";
        for(int i=0; i < vehiculos.length; i++){
            if (vehiculos[i]!=null && vehiculos[i].color.toLowerCase().equals("verde")){//tiene que ser diferente a null porque los arreglos van a iniciar como nulo
                mensajeFinal= mensajeFinal+ vehiculos[i].toString() ;//lo ultimo sirve para dar un enter por cada vehiculo
                
            }

        }
        return mensajeFinal;

        }
    
    public static String vehiculos2000a2021() {
        String mensajeFinal = "";
        for(int i=0; i < vehiculos.length; i++){
            if (vehiculos[i]!=null && vehiculos[i].modelo>=2000 && vehiculos[i].modelo<=2021){
                mensajeFinal= mensajeFinal+ vehiculos[i].toString() + "\n";
            }

        }
        return mensajeFinal;

}
}