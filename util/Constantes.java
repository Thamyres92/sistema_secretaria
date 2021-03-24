package sistema_secretaria.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Constantes {
	public final static String SISTEMA_SECRETARIA_DATABASE_PORT;
	public final static String SISTEMA_SECRETARIA_DATABASE_IP;
	public final static String SISTEMA_SECRETARIA_DATABASE_NAME;
	
	private static Properties prop;
	private static FileInputStream fis;
	
	static {
		
		try {
			prop = new Properties();
			fis = new FileInputStream("propriedades");
			prop.load(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		SISTEMA_SECRETARIA_DATABASE_PORT = prop.getProperty("sistema_secretaria_database_port");
		SISTEMA_SECRETARIA_DATABASE_IP = prop.getProperty("sistema_secretaria_database_ip");
		SISTEMA_SECRETARIA_DATABASE_NAME = prop.getProperty("sistema_secretaria_database_name");
	}

}
