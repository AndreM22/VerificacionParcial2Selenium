package pages;

import org.openqa.selenium.By;

import control.Image;

public class PaginaInicio {
	public Image signUpFreeImage = new Image(By.xpath("//img[@src=\"/Images/design/pagesignup.png\"]"));
	
	public Image loginImage = new Image(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
}
