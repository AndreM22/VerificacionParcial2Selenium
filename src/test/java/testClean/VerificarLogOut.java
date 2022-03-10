package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pages.LoginModal;
import pages.MenuSection;
import pages.PaginaInicio;
import pages.SignUpModal;
import singleton.Session;

public class VerificarLogOut extends BaseTodoLy {

	PaginaInicio paginaInicio = new PaginaInicio();
	SignUpModal signUpModal = new SignUpModal();
	MenuSection menuSection = new MenuSection();
	LoginModal loginModal = new LoginModal();
	
	@Test
	public void verifyLogOut() throws InterruptedException {
		paginaInicio.loginImage.click();
        loginModal.emailTxtBox.setText("fabian.machicao@gmail.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        
        menuSection.logoutButton.click();
        
        Thread.sleep(2000);
        
        Assertions.assertTrue(paginaInicio.loginImage.isControlDisplayed(),
                "ERROR no se pudo hacer el login");
	}
}
