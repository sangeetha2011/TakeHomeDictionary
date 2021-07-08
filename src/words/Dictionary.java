package words;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Dictionary {
	static String path;

	public static void main(String[] args) throws IOException {
		filedoesexist(".\\data\\names.properties");

	}

	public static void filedoesexist(String filepath) throws IOException {

		
		try {

			path = filepath;
			Properties prop = new Properties();
			FileInputStream fi = new FileInputStream(path);
			prop.load(fi);

			for (Object key : prop.keySet()) {
				
				System.out.println("word: " + key + "\r\n" + prop.getProperty(key.toString())
						.replaceAll(",", "\r\n meaning 2:").replace("-", " meaning 1 :"));

			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

	}

}
