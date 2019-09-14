package exceptions;


import java.io.*; 

public class TestExceptions {
	
	public TestExceptions() { }
	
	private static void processFile(String fileName) throws FileNotFoundException, IOException { 
		  File file = new File(fileName); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
		  
		  br.close();
	} 
		
	
	private static void processFile2(String fileName) {	
		  File file = new File(fileName); 
		  try {
			  BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			  while ((st = br.readLine()) != null) 
			    System.out.println(st);  
			  br.close();
		  } catch(FileNotFoundException e) {
			  System.out.println("Error al obrir el fitxer");
		  } catch (IOException e) {
			  System.out.println("Error en la lectura");
		}
	}
	
	private static void processFile3(String fileName) throws MyException { 
		  File file = new File(fileName); 
		  try {
			  BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			  while ((st = br.readLine()) != null) 
			    System.out.println(st);  
			  br.close();
		  } catch(Exception e) {
			  MyException ex = new MyException(e);
			  throw ex;
			  }
	}
	
	private static void processFile4(String fileName) {
		  File file = new File(fileName); 
		  try {
			  BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			  while ((st = br.readLine()) != null) 
			    System.out.println(st);  
			  br.close();
		  } catch(FileNotFoundException e) {
			  System.out.println("Error al obrir el fitxer");
		  } catch (IOException e) {
			  System.out.println("Error en la lectura");
		} finally {
			System.out.println("Thank you for using our tool");
		}
	}
	
	public static void main(String[] args) {
		try {
			processFile("aa.txt");
		} catch (FileNotFoundException e) {
			System.out.println("processFile FileNotFoundExcepction");
		} catch (IOException e) {
			System.out.println("processFile IOException");
		}
		processFile2("aa.txt");
		try {
			processFile3("aa.txt");
		} catch (MyException e) {
			System.out.println("processFile3 MyException");
		}
		processFile4("aa.txt");
		
	}
				
}
