
package herencia1;

public class EstudiantePresencial extends Estudiante{
    /*1.  Declarar
        numeroCreditos: Entero 
        costoCredito: Real 
        matriculaPresencial: Real */
    private int numeroCreditos;
    private double costoCredito;
    private double matriculaPresencial;
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("Nombres: %s\nApellidos: %s\n"
                + "Identificacion: %s\nEdad: %d\nCosto Matricula Distancia: %.2f",
                obtenerNombresEstudiante(), apellidosEstudiante, 
                identificacionEstudiante, edadEstudiante, matriculaPresencial);
        
        /*
        Cuando tenemos una subclase, nosotros podemos llamar a los atributos los
        cuales ha heredado ya sea mediante el nombre del atributo (en el caso
        del toString llamamos directamente a nombresEstudiante de la superclase)
        o con sus metodos obtener
        */
        return reporte;
    }
    
}
