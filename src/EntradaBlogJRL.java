/**Clase para manejar las entradas de un blog.
 * @author James Lomax
 * @since 22/02/2021
 * @version 2.3
 */

public class EntradaBlogJRL {

		/**separador es el carácter que separa ENTRADA DE del nombre del autor
		*/
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		/**Constructor de la clase.   
		*@param id número de entrada
		*@param autor el nombre del autor de la entrada
		*@param texto el texto que contiene la entrada
		*@throws IllegalArgumentException Si el número de entrada es negativo, lanza una excepción.
		*/
		public EntradaBlogJRL(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		
		/**
		 * 
		 * @return cad
		 */
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * @return this.id el número de la entrada
		 */
		public int getId(){
			return this.id;
		}
		
		/**
		 *@return this.texto devuelve el texto completo de la entrada
		 */
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 *@return this.autor.toUpperCase(); el nombre del autor de la entrada en mayúsculas
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * @return this.autor; el nombre del autor. Ya no se usa. Mejor ver getAutor
		 */
		public String devuelveAutor(){
			return this.autor;
		}
		
		/**
		 * @param args No tiene porqué tener argumentos.
		 */
		public static void main(String[] args) {
			
			EntradaBlogJRL e1= new EntradaBlogJRL (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
	}

}
