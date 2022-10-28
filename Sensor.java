public class Sensor
{
    public static Sensor[] sensores = new Sensor[8];
    public int tamaño = 8;
    public static  int posAnadir = 0;
    private String tipo;
    private double valor;
    
    
    public Sensor(){
        
    }
    public Sensor(String ti, double va){
        this.tipo = ti;
        this.valor = va;
    }
    public String getTipo(){
        return this.tipo;
    }
    public double getValor(){
        return this.valor;
    }
    public void setTipo(String n){
    this.tipo = n;
    }
    public void setValor(double n){
        this.valor = n;
    }
    public  String toString(){
        String mensaje = "Tipo: " + this.tipo + ", Valor: "+ this.valor;
        return mensaje; 
    }
    public static void nuevoSensor(Sensor sensorx){
        sensores[posAnadir] = sensorx;
        posAnadir = posAnadir +1;
    }
    public static String toStringSensores(Sensor[] sensor){
        String mensajeFinal = "";
        for(int i=0; i<sensor.length; i++){
            if (sensor[i]!=null){
            mensajeFinal = mensajeFinal + sensor[i].toString() +"\n";
            
            }
        }
        return mensajeFinal;
    }
    public static int cantidadSensores(){
        return posAnadir;
        
    }
    public static String infSensoresTipoTemp(Sensor[] sensor){
        String mensajeFinal = "";
        for(int i =0; i<sensor.length; i++){
            if(sensor[i]!=null && sensor[i].tipo.toLowerCase().equals("temperatura")){
                mensajeFinal = mensajeFinal + sensor[i].toString()+"\n";
                
            }
        }
        return mensajeFinal;
    }
    public static Sensor[] nuevoArreglo(){
        Sensor[] nuevoArregloSensor =  new Sensor[posAnadir];
        int pos = 0;
        
        for(int i=0; i<sensores.length; i++){
            if( sensores[i]!=null && sensores[i].tipo.toLowerCase().equals("temperatura")){
                nuevoArregloSensor[pos] = sensores[i];
                pos++;
                
            }
            
        }
        
        for(int i=0; i<nuevoArregloSensor.length -1 ; i++){
            int pos_menor = i;
            for(int j =i+1; j<nuevoArregloSensor.length; j++){
                if(nuevoArregloSensor[i] != null && nuevoArregloSensor[j]!=null && nuevoArregloSensor[j].valor<nuevoArregloSensor[pos_menor].valor){
                    pos_menor = j;
                    
                }
            }
            Sensor temp = nuevoArregloSensor[i];
            nuevoArregloSensor[i] = nuevoArregloSensor[pos_menor];
            nuevoArregloSensor[pos_menor] = temp;
        }
        return nuevoArregloSensor;
    }
    
}