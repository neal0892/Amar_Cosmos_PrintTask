
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;

import org.apache.pdfbox.pdmodel.PDDocument; 

public class ListFileName {


	public void list_file(String directoryName) throws FileNotFoundException {
		
		File directory = new File(directoryName);
		File[] flist = directory.listFiles();
		
		for(File file : flist) {
			if(file.isFile())
				{
				String filename = file.getName();
				//System.out.println(filename.toString());
			//	File f = new File(filename);
			
				 try (PDDocument document = PDDocument.load(file)){
					 Printing p = new Printing();
					 p.print(document);
					 
					 
				 }catch(Exception e){//will catch 
					 e.printStackTrace();
				 }
				//System.out.println(protocol_name(filename));
				 
				 
				create_directory(filename);
				move_file(filename);
				
				}
				
				}
			
		
	}
	
		public void create_directory(String filename) {
			try {
				File Dir = new File("D://protocol//"+protocol_name(filename));
				if(!Dir.exists()) {
					Dir.mkdir();
				}
				}
			catch(Exception e) {
					System.out.println(e);
					
				}
			
		}
		
		public void move_file(String filename)  {
			try {
			Files.move(Paths.get("D:\\Print_File\\"+filename), Paths.get("D:\\protocol\\"+protocol_name(filename)+"\\"+filename));
			}
			catch(FileAlreadyExistsException e)
			{
				System.out.println("Amar");
			}
			catch(Exception e) {
				System.out.println("exception case ");
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	
	
		public String protocol_name(String filename){
			int i,p=0,s1=0,s2=0;
			char ch;
			int len= filename.length();
			for(i=0; i<len; i++) {
				 ch = filename.charAt(i);
				if(ch=='-') {
					p=i;
					break;
					
				}
			}
				for(i=p; i>0; i--) {
					ch = filename.charAt(i);
					if(ch==' ') {
						s1=i;
						break;
						
					}
				}
				for(i=p; i<len; i++) {
					ch = filename.charAt(i);
					if(ch==' ') {
						s2=i;
						break;
						
					}
				}
				
				return filename.substring(s1+1,s2);
		}
	
	
	
	
}
