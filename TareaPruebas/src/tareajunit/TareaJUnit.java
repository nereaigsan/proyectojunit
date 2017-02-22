package tareajunit;

/**
 *
 * @author alumno
 */
public class TareaJUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BRException {
        CalcularSalario calcular = new CalcularSalario();
        float salarioBruto = calcular.calculaSalarioBruto("encargado", 1, 0);
        float salarioNeto = calcular.calcularSalarioNeto(salarioBruto);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Salario Neto: " + salarioNeto);
    }

}
