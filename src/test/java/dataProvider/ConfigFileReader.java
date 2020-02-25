package dataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";
	
	public ConfigFileReader() {
		
		BufferedReader reader;
		
		try 
		{
			reader = new BufferedReader(new FileReader (propertyFilePath));
			properties = new Properties();
			properties.load(reader);
			reader.close();}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}}
	
			
		public String getDriverPath(){
			 String driverPath = properties.getProperty("driverPath");
			 if(driverPath!= null) return driverPath;
			 else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
			 }
		
		public long getImplicitlyWait() {
			String wait = properties.getProperty("ImplicitlyWait");
			
			if(wait!=null)return Long. parseLong(wait);
			else throw new RuntimeException("Implicitly wait is not specified in config file");
		}
		
		public String getURL() {
			
			String URL=properties.getProperty("URL");
			if(URL!=null) return URL;
			else throw new RuntimeException("URL is not specified in config file");
		}
		
		public String getReportConfigPath() {
			String reportConfigPath=properties.getProperty("reportConfigPath");
			if(reportConfigPath!=null)return reportConfigPath;
			else throw new RuntimeException("Report config path is not specified");
			
			
		}
			
	

}
