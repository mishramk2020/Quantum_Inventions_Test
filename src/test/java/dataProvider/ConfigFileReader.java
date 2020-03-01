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
		
		public String getfirefoxDriverPath(){
			 String driverPath = properties.getProperty("firefoxDriverPath");
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
		
		public String getexcelPath() {
		String excelPath = properties.getProperty("excelPath");
		if(excelPath!=null)return excelPath;
		else throw new RuntimeException("Excelpath is not specified");
		}
		
		public String getexcelFilename() {
		String excelFilename =properties.getProperty("excelFileName");
		if(excelFilename!=null)return excelFilename;
		else throw new RuntimeException("Excel file name is not specified");
		}
		
		public String getsheetName() {
			String sheetName = properties.getProperty("sheetName");
			if(sheetName!=null) return sheetName;
			else throw new RuntimeException("Sheet name is not specified");
		}
		
		public String getBrowser1() {
			 String browserName = properties.getProperty("browser1");
			 if(browserName == null || browserName.equals("chrome")) return "CHROME";
			 else if(browserName.equalsIgnoreCase("firefox")) return "FIREFOX";
			 else if(browserName.equals("iexplorer")) return "INTERNETEXPLORER";
			 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
			 }
		
		public String getBrowser2() {
			 String browserName = properties.getProperty("browser2");
			 if(browserName == null || browserName.equals("chrome")) return "CHROME";
			 else if(browserName.equalsIgnoreCase("firefox")) return "FIREFOX";
			 else if(browserName.equals("iexplorer")) return "INTERNETEXPLORER";
			 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
			 }
		
		
			
	

}
