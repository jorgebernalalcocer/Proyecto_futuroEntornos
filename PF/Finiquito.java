public class Finiquito {

    private static int salarioBase;
    private static int diasMes=30;
    private String nombre;
    private int plusSalarial;
    private int plusExtrasalarial;
    private int vacacionesDisfrutadas;
    private int diaInicio;
    private int diaFinalizar;
    private int mesInicio;
    private int mesFinalizar;
    

//Constructor

 public Finiquito(String nombre, int salarioBase, int plusSalarial, int plusExtrasalarial, int vacacionesDisfrutadas){
     Finiquito.salarioBase=salarioBase;
     this.nombre=nombre;
     this.plusSalarial=plusSalarial;
     this.plusExtrasalarial=plusExtrasalarial;
     this.vacacionesDisfrutadas=vacacionesDisfrutadas;

 }

 public int getMesFinalizar() {
    return mesFinalizar;
}

public void setMesFinalizar(int mesFinalizar) {
    this.mesFinalizar = mesFinalizar;
}

public int getMesInicio() {
    return mesInicio;
}

public void setMesInicio(int mesInicio) {
    this.mesInicio = mesInicio;
}

public int getDiaInicio() {
    return diaInicio;
}

public void setDiaInicio(int diaInicio) {
    this.diaInicio = diaInicio;
}

public int getDiaFinalizar() {
    return diaFinalizar;
}

public void setDiaFinalizar(int diaFinalizar) {
    this.diaFinalizar = diaFinalizar;
}

public Finiquito(){

 }

 public static void setSalarioBase(int salarioBase){
    Finiquito.salarioBase=salarioBase;
}

public void setPlusSalarial(int plusSalarial){
    this.plusSalarial=plusSalarial;
    
}

public void setNombre(String nombre){
    this.nombre=nombre;
}

public void setPlusExtrasalarial(int plusExtrasalarial){
    this.plusExtrasalarial=plusExtrasalarial;
}

public void setVacacionesDisfrutadas( int vacacionesDisfrutadas){
    this.vacacionesDisfrutadas=vacacionesDisfrutadas;
}

public static int getSalarioBase(){
    return Finiquito.salarioBase;
}

public int getPlusSalarial(){
    return plusSalarial;
}

public int getPlusExtrasalarial(){
    return plusExtrasalarial;
}

public int getVacacionesDisfrutadas(){
    return vacacionesDisfrutadas;
}

public String getNombre(){
    return nombre;
}

public double getSalarioMes(){
    double funcion= salarioBase+plusSalarial+plusExtrasalarial;
    return funcion;
    }

public double getSalarioMesCurso(){
    double funcion=getSalarioDia()*diaFinalizar;
    return funcion;
}

public double getSalarioDia(){
    double funcion= getSalarioMes()/30;
    return funcion;
}

public double getSalarioDiaSinExtrasalarial(){
    double funcion= (getSalarioMes()-plusExtrasalarial)/30;
    return funcion;
}



public double getVacacionesCurso(){
    double funcion=((((((getMesFinalizar()-1)*30)+getDiaFinalizar())*30)/365)-vacacionesDisfrutadas)*getSalarioDiaSinExtrasalarial();
    return funcion;
}












    
}

