
package serializacion;

import java.io.*;

public class ClaseAnhadirObjetosFichero extends ObjectOutputStream{
    
  //bloque que sobreescribe el metodo writeStreamHeader para que no vuelva a 
        //escribir la cabecera del fichero cada vez qeu abramos el fichero para 
        //añadir. Sobreescribirmos el método writeStremHeader con reset() y asi
        //no pone nueva cabecera al nuevo bloque de registros que escribamos
   public ClaseAnhadirObjetosFichero(OutputStream out) throws IOException {
            super(out);
        }
        @Override
        protected void writeStreamHeader() throws IOException {
		reset();
            }
    }
