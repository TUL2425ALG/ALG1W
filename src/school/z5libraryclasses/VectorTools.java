package school.z5libraryclasses;

public class VectorTools {

    /*
 * Zlata Smidova
     */
/**
*
* @param ux is specified number
* @param uy is specified number
* @param uz is specified number
* @param vx is specified number
* @param vy is specified number
* @param vz is specified number
* @return length of a cross product
*/

    public static double crossProductLength(double ux, double uy, double uz, double vx, double vy, double vz) {
        double vectorProductx = (uy * vz - uz * vx);     //u x v   prvni souradnice 
        double vectorProdcuty = (uz * vx - ux * vz);             //druha souradnice
        double vectorProductz = (ux * vy - uy * vx);             //treti souradnice
        double productLength = Math.sqrt(Math.pow(vectorProductx, 2) + Math.pow(vectorProdcuty, 2) + Math.pow(vectorProductz, 2));
        return productLength;
    }
}
