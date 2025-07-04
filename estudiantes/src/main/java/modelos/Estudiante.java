package modelos;

public class Estudiante {
    private String nombre;
    private String asignatura;
    private double promedio;

    public Estudiante() {
    }

    public Estudiante(String nombre, String asignatura, double promedio) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estudiante{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", asignatura='").append(asignatura).append('\'');
        sb.append(", promedio=").append(promedio);
        sb.append('}');
        return sb.toString();
    }
}
