package synergyj;

public class Stereo {

  private boolean estaReproduciendo = true;

  public void reproducir() {
    estaReproduciendo = true;
  }

  public void detener() {
    estaReproduciendo = false;
  }

  public boolean estaReproduciendo() {
    // agregar unhappy path... en el cual se arroje una excepcion
    return estaReproduciendo;
  }
}
