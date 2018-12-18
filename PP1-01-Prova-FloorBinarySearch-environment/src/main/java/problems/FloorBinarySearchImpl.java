package problems;

import util.Util;

public class FloorBinarySearchImpl implements Floor {

   @Override
   public Integer floor(Integer[] array, Integer x) {
      Integer saida = floorBinary(array, x, 0, array.length - 1);
      if (saida == -1000000000)
         return null;
      else
         return saida;
   }

   public Integer floorBinary(Integer[] array, Integer numero, Integer leftIndex, Integer rigthIndex) {
      if (leftIndex < rigthIndex) {
         int pivo = partition(array, leftIndex, rigthIndex);
         if (array[pivo] <= numero) {
            Integer possivelResposta = array[pivo];
            int aux = floorBinary(array, numero, pivo, rigthIndex);
            if (possivelResposta > aux)
               return possivelResposta;
            else
               return aux;
         } else if (array[pivo] > numero) {
            return floorBinary(array, numero, leftIndex, pivo - 1);
         }
      }
      return -1000000000; // para tratar também numeros negativos
   }

   public int partition(Integer[] array, int leftIndex, int rigthIndex) {
      int aux = leftIndex - 1;
      Integer pivo = array[rigthIndex];
      for (int i = leftIndex; i < rigthIndex; i++)
         if (array[i] < pivo)
            Util.swap(array, ++aux, i);
      Util.swap(array, ++aux, rigthIndex);
      return aux;
   }
}
