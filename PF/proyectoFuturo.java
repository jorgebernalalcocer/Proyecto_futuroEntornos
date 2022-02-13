

public class ProyectoFuturo {


    
    public static void main(String[] args) {

        Finiquito.setSalarioBase(1100);
        System.out.println(Finiquito.getSalarioBase());

        Finiquito finiquito1 = new Finiquito();
        
        finiquito1.setNombre("Jorge");
        finiquito1.setPlusSalarial(150);
        finiquito1.setPlusExtrasalarial(80);
        finiquito1.setVacacionesDisfrutadas(5);
        finiquito1.setDiaInicio(1);
        finiquito1.setDiaFinalizar(31);
        finiquito1.setMesInicio(10);
        finiquito1.setMesFinalizar(3);

        System.out.println("Nombre: "+finiquito1.getNombre());

        System.out.println("El salario del mes en curso es de: "+ finiquito1.getSalarioMesCurso()+" €");
        System.out.println("El salario del dia sin extrasalarial es de :"+finiquito1.getSalarioDiaSinExtrasalarial());
        System.out.println("Le corresponden "+finiquito1.getVacacionesCurso()+" € de vacaciones no disfrutadas");
        System.out.println("La paga extra de invierno es de: "+finiquito1.getPagaExtraInvierno());
        System.out.println("La paga extra de verano es de: "+finiquito1.getPagaExtraVerano());


    
}
}