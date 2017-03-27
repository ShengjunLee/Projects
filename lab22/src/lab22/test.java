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
				BufferedReader reader = new BufferedReader(new FileReader("d:\\Downloads\\inputgit.csv"));//换成你的文件名 
	            reader.readLine();//第一行信息，为标题信息，不用,如果需要，注释掉 
	            String line = null;  
	            int m = 0;
	            while((line=reader.readLine())!=null){  
	                String item[] = line.split(",");//CSV格式文件为逗号分隔符文件，这里根据逗号切分 
	                String num = item[0];//last代表了github地址
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
				BufferedReader reader = new BufferedReader(new FileReader("d:\\Downloads\\inputgit.csv"));//换成你的文件名 
	            reader.readLine();//第一行信息，为标题信息，不用,如果需要，注释掉 
	            String line = null;  
	            int m = 0;
	            while((line=reader.readLine())!=null){  
	                String item[] = line.split(",");//CSV格式文件为逗号分隔符文件，这里根据逗号切分 
	                String num = item[0];//last代表了github地址
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
				BufferedReader reader = new BufferedReader(new FileReader("d:\\Downloads\\inputgit.csv"));//换成你的文件名 
	            reader.readLine();//第一行信息，为标题信息，不用,如果需要，注释掉 
	            String line = null;  
	            int m = 0;
	            while((line=reader.readLine())!=null){  
	                String item[] = line.split(",");//CSV格式文件为逗号分隔符文件，这里根据逗号切分                   
	                String last = item[2];//last代表了github地址
	                studadd[m] = last;
	                m++;               
	            }  
			} catch (Exception e) {  
	            e.printStackTrace();  
	        }  
		  return studadd;
	  }
  
    
    	
  		public int equals(String num, String pwdd,String add) {    		
			    		 //如果火狐浏览器没有默认安装在C盘，需要制定其路径
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
				            	  System.out.println("学号"+" "+num+"       "+"CSV文件和网络GITHUB地址验证相同");
				            	  return 1;
				              }else
				            	  return 0;
			              	    	
    				}
  	}
			    
    
  
 