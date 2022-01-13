package com.EcomAmazon.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
public String getApplicationURL() {
	String url = pro.getProperty("baseURL");
	return url;
}

public String getChromePath() {
	String chromePath=pro.getProperty("chromepath");
	return chromePath;
}

}
