package synergyj;

public class Auto {

  public boolean encendido;

  public Stereo stereo;

  public void encender() {
    encendido = true;
  }

  public boolean estaEncendido() {
    return encendido;
  }

  public boolean estaElStereoEncendido() {
    return stereo != null ? stereo.estaReproduciendo() : false;
  }

  public void encenderElStereo(Stereo stereo) {
    this.stereo = stereo;
  }

}
