package fcu.selab.training;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		// System.out.println( "Hello World!" );

		try {
			String string = new String();
			
			//�}��
			FileReader file = new FileReader("E:\\Git\\Seeme_HW\\input.txt");

			//Ū���e
			int r = file.read();

			while (r != -1) {
				string = string + (char) r;
				r = file.read();
			}

			//�����U��r
			String[] token = string.split(",");

			//�Ƨ�
			Arrays.sort(token);

			//�g��
			FileWriter fw = new FileWriter("E:\\Git\\Seeme_HW\\output.txt");
			
			for (int i = 0; i < token.length; i++) {
				fw.write(token[i].substring(0,1).toLowerCase() + ". "+token[i] + " ");
			}
			
			System.out.println("Sucess!");
			file.close();
			fw.close();
		}
		
		catch (IOException e) {
			System.out.println("Fail to open the file.");
		}
	}

}
