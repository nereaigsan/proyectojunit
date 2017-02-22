package tareajunit;

/**
 *
 * @author alumno
 */
public class CalcularSalario {

    float salarioBase = 0.0f;
    float salarioNeto = 0.0f;
    double retencion1 = 0.16;
    double retencion2 = 0.18;

    public float calculaSalarioBruto(String tipo, float ventasMes, float horasExtra) throws BRException {
        if (tipo.equals("empleado")) {
            salarioBase = 1000f;
        } else if (tipo.equals("encargado")) {
            salarioBase = 1500f;
        } else if (tipo == null || tipo.equals("")) {
            throw new BRException("Tipo no puede ser null ni vacío.");
        } else if (tipo != "encargado" || tipo != "empleado") {
            throw new BRException("Tipo debe tomar un valor entre 'empleado' y 'encargado'.");
        }

        if (ventasMes >= 1000) {
            salarioBase += 100;
        } else if (ventasMes >= 1500) {
            salarioBase += 200;
        } else if (ventasMes < 0) {
            throw new BRException("VentasMes no puede ser un valor negativo.");
        }

        if (horasExtra >= 0) {
            salarioBase = salarioBase + (horasExtra * 20);
        } else {
            throw new BRException("HorasExtra no puede ser un valor negativo.");
        }
        return salarioBase;
    }

    public float calcularSalarioNeto(float salarioBruto) throws BRException {
        if (salarioBase >= 1000 && salarioBase < 1500) {
            salarioNeto = (float) (salarioBruto * (1 - retencion1));
        } else if (salarioBase > 1500) {
            salarioNeto = (float) (salarioBruto * (1 - retencion2));
        } else if (salarioBase < 0) {
            throw new BRException("Salario menor que 0.");
        }
        return salarioNeto;
    }

}
