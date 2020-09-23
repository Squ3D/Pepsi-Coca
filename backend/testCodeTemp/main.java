package grepImg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class main {
	
	
	


    public static void main(String[]args) throws IOException {

        try {
        	List <String> tab = new ArrayList<>();*

            File f = new File("/Applications/MAMP/htdocs/ProjetWeb/a.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine;
            
            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
                tab.add(readLine);
                i++;
                
                
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}