/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagen;

/**
 *
 * @author Estudiantes
 */
public class Imagen {
     Pixel miPixel[][]= new Pixel [5][5];
     
    public Imagen() {
        
      Imagen miImag= new Imagen();
      miImag.ingresardatos(0, 0, 0, 0, 0);
      miImag.ingresardatos(1, 1, 0, 0, 0);
      miImag.ingresardatos(2, 2, 0, 0, 0);
      miImag.ingresardatos(3, 3, 0, 0, 0);
      miImag.ingresardatos(4, 4, 0, 0, 0);
      miImag.ingresardatos(1, 0, 255, 0, 0);
      miImag.ingresardatos(2, 0, 255, 0, 0);
      miImag.ingresardatos(3, 0, 255, 0, 0);
      miImag.ingresardatos(4, 0, 255, 0, 0);
      miImag.ingresardatos(1, 0, 255, 0, 0);
      miImag.ingresardatos(1, 2, 0, 0, 255);
      miImag.ingresardatos(1, 3, 25, 0, 1);
      miImag.ingresardatos(1, 4, 250, 0, 250);
      miImag.ingresardatos(2, 0, 8, 16, 32);
      miImag.ingresardatos(2, 1, 8, 24, 6);
      miImag.ingresardatos(2, 3, 18, 18, 0);
      miImag.ingresardatos(2, 4, 15, 24, 18);
      miImag.ingresardatos(3, 0, 9, 18, 32);
      miImag.ingresardatos(3, 1, 16, 32, 0);
      miImag.ingresardatos(3, 2, 10, 10, 10);
      miImag.ingresardatos(3, 4, 32, 32, 0);
      miImag.ingresardatos(4, 0, 223, 8, 1);
      miImag.ingresardatos(4, 1, 219, 6, 3);
      miImag.ingresardatos(4, 2, 210, 9, 9);
      miImag.ingresardatos(4, 3, 210, 18, 32);
    }

    void ingresardatos(int x,int y,int R,int G,int B)
    {
        this.miPixel[x][y].setRojo(R);
        this.miPixel[x][y].setRojo(G);
        this.miPixel[x][y].setRojo(B);
    }
}
