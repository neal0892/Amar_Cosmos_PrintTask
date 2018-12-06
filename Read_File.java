import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Read_File {
	
	private static Scanner x;
	
public static void main(String args[]) {
	
	ListFileName lfn = new ListFileName();  
	
     final String directory ="D://Print_File"; //entered name of directory which contains all files to be print
     try {
		lfn.list_file(directory);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
    
}



}
