package pages;

import org.openqa.selenium.By;

import control.CheckBox;
import control.Control;
import control.TextBox;

public class SignUpModal {
	public TextBox fullNameTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
	public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
	public TextBox passwordTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
	public CheckBox terminosCheckBox = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
	
	public Control enviarInformation = new Control(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}
