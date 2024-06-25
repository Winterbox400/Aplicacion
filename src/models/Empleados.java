/**Descripcion
 * Esta sera la clase que contendra los atributos, constructores y metodos de
 * nuestro objeto principal, los empleados.
 */
package models;

/**Autor
 * @Justin Steven Detrinidad Sandigo
 * @author WINTERBOX400
 */
public class Empleados {
    //Variables de Instanciacion
    private int id;
    private String nombre;
    private String apellido;
    private String cargo;
    private double salario;

    //Constructores de la clase
    public Empleados() {//Constructor sin parametros
    }

    public Empleados(int id, String nombre, String apellido, String cargo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    //Metodos de la clase
    public int getId() {//Muestra el valor en Id
        return id;
    }

    public void setId(int id) {//Almacena el Valor en Id
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double Aumento(){
        double incremento;//Variable local
        
        if(this.salario <= 12000){
        incremento = this.salario * 0.20;
        this.salario += incremento;
            return this.salario;
        }else{
        return 0.00;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();//Salida con clase StingBuilder
        sb.append("ID: ").append(id);
        sb.append(" | ").append(nombre);
        sb.append(" ").append(apellido);
        sb.append("  |  ").append(cargo);
        sb.append("  |  ").append(salario);
        sb.append("  |");
        return sb.toString();
    }
    
    
    
}
