public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio Propuesto #12");
        System.out.println(
                "Un empleado trabaja 48 horas en la semana a raz\u00F3n de $5.000 hora. El porcentaje de retenci\u00F3n en la fuente es del 12,5% del salario bruto.");
        System.out.println();

        /*
         * Definimos las variables de tipo double para el número de horas y la razón de
         * hora
         */
        double horas = 48, razon = 5000;

        /*
         * Definimos las operaciones para obtener salario bruto = hora * razón,
         * retención en la fuente = salario bruo * 12.5 y salario neto semanal = salario
         * bruto - retención en la fuente
         */
        System.out.println("Salario bruto semanal: $" + (horas * razon));
        System.out.println("Retención en la fuente: $" + ((horas * razon) / 100) * 12.5);
        System.out.println("Salario neto semanal: $" + ((horas * razon) - (((horas * razon) / 100) * 12.5)));

        System.out.println();

        /*
         * Entiendo un mes como el periodo de 4 semanas, multiplicamos las operaciones
         * previas * 4 para determinar los valores a una escala mensual
         */
        System.out.println("Salario bruto mensual: $" + 4 * ((horas * razon)));
        System.out.println("Retención en la fuente: $" + 4 * (((horas * razon) / 100) * 12.5));
        System.out.println("Salario neto mensual: $" + 4 * (((horas * razon) - (((horas * razon) / 100) * 12.5))));

    }
}
