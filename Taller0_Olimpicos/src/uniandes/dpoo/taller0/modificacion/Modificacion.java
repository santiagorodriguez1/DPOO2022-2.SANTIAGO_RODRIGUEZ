package uniandes.dpoo.taller0.modificacion;
import java.io.FileNotFoundException;
import java.io.IOException;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;



public class Modificacion {
	public static void main(String[]args) throws FileNotFoundException, IOException
	{
		CalculadoraEstadisticas cal=LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(cal.paisConMasMedallistas());
				
	}


}


