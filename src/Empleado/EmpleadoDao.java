package Empleado;

import java.util.List;

public interface EmpleadoDao {
    public void insertar(EmpleadoBean empleado);
    public void actualizar(EmpleadoBean empleado);
    public void eliminar(EmpleadoBean empleado);
    public List<EmpleadoBean> seleccionar(EmpleadoBean empleado);
    public EmpleadoBean seleccionarById(int id);
      
}
