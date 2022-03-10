package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pages.LoginModal;
import pages.MenuSection;
import pages.PaginaInicio;
import pages.SignUpModal;
import singleton.Session;

public class VerificarLoginConSignUp extends BaseTodoLy {

	PaginaInicio paginaInicio = new PaginaInicio();
	SignUpModal signUpModal = new SignUpModal();
	MenuSection menuSection = new MenuSection();
	LoginModal loginModal = new LoginModal();

	@Test
	public void verifyLoginWithRegister() throws InterruptedException {
		paginaInicio.signUpFreeImage.click();
		
		signUpModal.fullNameTextBox.setText("Andre Machicao");
		signUpModal.emailTextBox.setText("PruebaAndre4@gmail.com");
		signUpModal.passwordTextBox.setText("12345");
		signUpModal.terminosCheckBox.click();
		
		signUpModal.enviarInformation.click();
		
		Thread.sleep(2000);
		
		Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");
	}
	


}
