package synergyj;

import org.junit.*;
import static org.junit.Assert.*;

public class StereoTest {

  @Test
  public void alIniciarElStereoDebeReproducir() {
    Stereo stereo = new Stereo();
    assertTrue(stereo.estaReproduciendo());
  }

  @Test
  public void alDetenerLaCancionCambiaEstado() {
    Stereo stereo = new Stereo();

    stereo.detener();
    assertFalse(stereo.estaReproduciendo());
  }

  @Test
  public void alReanudarLaCancionElEstadoDebeCambiar() {
    Stereo stereo = new Stereo();

    stereo.detener();
    assertFalse(stereo.estaReproduciendo());
    
    stereo.reproducir();
    assertTrue(stereo.estaReproduciendo());
  }

}
