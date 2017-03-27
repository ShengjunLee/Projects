 package lab22;
 
  import org.junit.Test;
  import org.openqa.selenium.By;
  import static org.junit.Assert.*;
  import java.io.BufferedReader;  
  import java.io.FileReader; 
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.firefox.FirefoxDriver;
  import java.util.ArrayList;
  
  public class test {
	 
  		public String[] getStudNum(){
		   String[] studNum =new String[118];
		  try{
				BufferedReader reader = new BufferedReader(new FileReader("d:\\Downloads\\inputgit.csv"));//��������ļ��� 
	            reader.readLine();//��һ����Ϣ��Ϊ������Ϣ������,�����Ҫ��ע�͵� 
	            String line = null;  
	            int m = 0;
	            while((line=reader.readLine())!=null){  
	                String item[] = line.split(",");//CSV��ʽ�ļ�Ϊ���ŷָ����ļ���������ݶ����з� 
	                String num = item[0];//last������github��ַ
	                studNum[m]  = num;
	                m++;               
	            }  
	            reader.close();
			} catch (Exception e) {  
	            e.printStackTrace();  
	        }  
		  
		  return studNum;
	  }  
  		public String[] getStudPwd(){
		   String[] studpwd =new String[118];
	    	try{
				BufferedReader reader = new BufferedReader(new FileReader("d:\\Downloads\\inputgit.csv"));//��������ļ��� 
	            reader.readLine();//��һ����Ϣ��Ϊ������Ϣ������,�����Ҫ��ע�͵� 
	            String line = null;  
	            int m = 0;
	            while((line=reader.readLine())!=null){  
	                String item[] = line.split(",");//CSV��ʽ�ļ�Ϊ���ŷָ����ļ���������ݶ����з� 
	                String num = item[0];//last������github��ַ
	                String pwd = num.substring(4, 10);
	                studpwd[m] = pwd;
	                m++;               
	            }  
			} catch (Exception e) {  
	            e.printStackTrace();  
	        } 
		  return studpwd;
	  }
  		public String[] getStudAdd(){
		   String[] studadd =new String[118];
			try{
				BufferedReader reader = new BufferedReader(new FileReader("d:\\Downloads\\inputgit.csv"));//��������ļ��� 
	            reader.readLine();//��һ����Ϣ��Ϊ������Ϣ������,�����Ҫ��ע�͵� 
	            String line = null;  
	            int m = 0;
	            while((line=reader.readLine())!=null){  
	                String item[] = line.split(",");//CSV��ʽ�ļ�Ϊ���ŷָ����ļ���������ݶ����з�                   
	                String last = item[2];//last������github��ַ
	                studadd[m] = last;
	                m++;               
	            }  
			} catch (Exception e) {  
	            e.printStackTrace();  
	        }  
		  return studadd;
	  }
  
    
    	
  		public int equals(String num, String pwdd,String add) {    		
			    		 //�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
			             //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe"); 
			    		 System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Firefox\\firefox.exe");
			             WebDriver driver = new FirefoxDriver();
			             driver.get("http://121.193.130.195:8080/");          
			             driver.manage().window().maximize();         
			              WebElement name = driver.findElement(By.id("name"));
			              name.sendKeys(num); 
			              
			              WebElement pwd = driver.findElement(By.id("pwd"));
			              pwd.sendKeys(pwdd); 
			       
			              WebElement btn = driver.findElement(By.id("submit"));
			              btn.click();
			              
			              String conten = driver.findElement(By.id("table-main")).findElement(By.xpath("//tr[3]")).findElement(By.xpath("td[2]")).getText();		              	             
			              driver.close();			            		              
			            	  if(add.equals(conten)){
				            	  System.out.println("ѧ��"+" "+num+"       "+"CSV�ļ�������GITHUB��ַ��֤��ͬ");
				            	  return 1;
				              }else
				            	  return 0;
			              	    	
    				}
  	}
			    
    
  
 