/** Construye un nuevo proyecto Java denominado Ud5_EjercClases3. En el proyecto debe aparecer
un paquete, que no puede ser el paquete por defecto, ponle el nombre que creas oportuno. Dentro de
dicho paquete:
• Crea una clase denominada Fecha. Esta clase no debe contener método main.
• Declara en el fichero de la clase un tipo enumerado, denominado EnumMes, para los meses del
año.
• La clase debe contener un atributo para el día, otro para mes (del tipo enumerado declarado) y un
tercero para el año.
• Implementa un constructor que inicialice el mes al valor recibido por parámetro y los demás
atributos a 0. Observa su cabecera en el siguiente código:
Fecha (EnumMes mes){
• Declara otro constructor que inicialice todos los atributos de la clase. Su cabecera podría ser la
siguiente:
Fecha (int dia, EnumMes mes, int anio){
• Implementa los métodos que permitan acceder y modificar cada uno de los atributos de la clase.
Los nombres de dichos métodos serán: getXXX () para obtener el valor del atributo XXX y
setXXX (v) para actualizar el atributo XXX con el valor v. Puedes observar la cabecera de algún
método en el siguiente código:
public int getDia() {
• Implementa un método que devuelva true si el valor contenido en la fecha es verano y false en
caso contrario. Observa su cabecera en el siguiente código:
public boolean isSummer(){
• Implementa un método que devuelva la diferencia en años con respecto a otra fecha pasada como
argumento. Este método se podría usar para calcular, por ejemplo, la edad de una persona. Su
cabecera sería la siguiente:
public int diferenciaEnAnios(Fecha fechaActual){
• Implementa un método que devuelva una cadena con la fecha en formato largo, por ejemplo, 15
de julio de 2020. Observa su cabecera:
public String toString (){
Ya tenemos nuestra clase Fecha implementada. Ahora vamos a probar su funcionalidad desde otra
clase, denominada Principal, que contendrá el método main. Esta clase la debes crear en el mismo
paquete que la clase Fecha. Dentro de dicha clase:
• Instancia un objeto de la clase Fecha denominado objFecha1 con el primer constructor.
• Actualiza los atributos dia y año para dicho objeto.
• Muestra la fecha por pantalla en formato largo.
• Muestra un mensaje por pantalla indicando si la fecha es verano.
• Muestra la diferencia en años respecto a la fecha actual.
• Instancia otro objeto de la clase Fecha denominado objFecha2 con el segundo constructor.
• Muestra el año de esta fecha por pantalla.
• Muestra la fecha en formato largo por pantalla.
• Muestra un mensaje por pantalla indicando si la fecha es verano o no.
• Muestra la diferencia en años respecto a la fecha actual.*/

package fecha;

public class Fecha {

    private int dia = 0;
    private EnumMes mes;
    private int anio = 0;

    public Fecha(EnumMes mes) {
        setMes(mes);
        dia = 0;
        anio = 0;
    }

    public Fecha(int dia, EnumMes mes, int anio) {

        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public void setMes(EnumMes mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public EnumMes getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public boolean esVerano() {
        boolean esVerano = false;
        if (mes == EnumMes.Agosto || mes == EnumMes.Julio || mes == EnumMes.Junio)
            esVerano = true;
        return esVerano;
    }

    public int diferenciaEnAnios(Fecha fechaActual) {
        int diferenciaAnios = 0;
        diferenciaAnios = fechaActual.anio - this.anio;
        return diferenciaAnios;
    }

    public String toString() {
        return dia + " de " + mes + " de " + anio;
    }

    public boolean esInvierno() {
        boolean esInvierno = false;
        if (mes == EnumMes.Enero || mes == EnumMes.Febrero || mes == EnumMes.Diciembre) {
            esInvierno = true;
        }
        return esInvierno;
    }
}