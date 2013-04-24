package synergyj;

import java.util.*;

public class Ordenamiento {

  public List<Integer> ordenarElementosPorBurbuja(List<Integer> elementosDesordenados) {
    List<Integer> elementosAOrdenar = elementosDesordenados;
    int tamanio = elementosAOrdenar.size();

    for (int pass=1; pass < tamanio; pass++) { 
      for (int i=0; i < tamanio-pass; i++) {
        if (elementosAOrdenar.get(i) > elementosAOrdenar.get(i+1)) {
          int temp = elementosAOrdenar.get(i);
          elementosAOrdenar.set(i, elementosAOrdenar.get(i+1));
          elementosAOrdenar.set(i+1, temp);
        }
      }
    }
    return elementosAOrdenar;
  }

  public List<Integer> ordenarElementosPorQuickSort (List <Integer> elementosDesordenados, int first, int last) {
    int g = first, h = last;

    int midIndex = (first + last) / 2;
    Integer dividingValue = elementosDesordenados.get(midIndex);
    do {
      while (elementosDesordenados.get(g).compareTo(dividingValue) < 0) g++;
      while (elementosDesordenados.get(h).compareTo(dividingValue) > 0) h--;
      if (g <= h) {
        swap(elementosDesordenados,g,h);
        g++;
        h--;
      } 
    } while (g < h);

    if (h > first) ordenarElementosPorQuickSort (elementosDesordenados,first,h);
    if (g < last) ordenarElementosPorQuickSort (elementosDesordenados,g,last);
    return elementosDesordenados;
  }

  public static void swap (List <Integer> list, int g, int h) {
    Integer temp = list.get(g);
    list.set(g, list.get(h));
    list.set(h, temp); 
  }

}