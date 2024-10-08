package buses;

public class EnMatricula implements Criterio{
    private String dato;
    public EnMatricula(String d){
        dato = d;
    }
    //el autobus sera seleccionable si la matricula bus esta contenida en el dato.
    @Override
    public boolean esSeleccionable(Bus bus) {
        return bus.getMatricula().contains(dato);
    }
}
