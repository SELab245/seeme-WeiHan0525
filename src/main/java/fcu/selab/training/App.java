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

			//�L�X
			for (int i = 0; i < token.length; i++) {
				System.out.println(token[i].substring(0,1).toLowerCase()+"."+token[i]);
			}
		}
		
		catch (IOException e) {
			System.out.println(e);
		}
	}

}
