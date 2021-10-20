package org.acess;
import java .io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
public class FileHandling {
public static void main(String[] args)throws Throwable {
File f = new File("E:\\Demo");
boolean b = f.mkdir();
System.out.println(b);

//File f = new File("F:\\Demo\\Details\\Java\\Data.txt");
//boolean d = f.mkdirs();
//System.out.println(d);
//boolean w = f.canWrite();
//System.out.println(w);


String[] l = f.list();
for(String x:l)
{
	System.out.println(x);
}
File[]ff = f.listFiles();
for(File y:ff)
{
	System.out.println(y);
}
FileUtils.write(f,"Java");
System.out.println("Done");
		
}}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


	


