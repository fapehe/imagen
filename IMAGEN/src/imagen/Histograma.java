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
public class Histograma {
    
    Imagen miImagen =new Imagen();
    int R[]=new int[256];
    int G[]=new int[256];
    int B[]=new int[256];
    
    void crearHistograma (int canal)
    { 
        for (int fila=0;fila<5;fila++)
        {
            for (int columna=0;columna<5;columna++)
            {
                R[miImagen.miPixel[fila][columna].getRojo()]++;
            }
        }
    }
    void imprimir(int canal)
    {
        for (int i=0;i<256;i++)
        {
            System.out.println(R[i]);
        }
    }
    
}
