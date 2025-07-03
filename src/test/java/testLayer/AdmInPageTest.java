package testLayer;

import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import pages.pimPage;

public class AdmInPageTest {

	public static void main(String[] args) {
		LoginPage login = new LoginPage();

		login.loginFunctionality("Admin", "admin234");

		HomePage home = new HomePage();

		home.validateLogo();

		pimPage pim = new pimPage();

		pim.clickOnPimLink();

		pim.addEmployee("Adiit", "abc");

		pim.searchEmployee();

		pim.deleteEmployee();

		AdminPage adminPage = new AdminPage();

		adminPage.createEmployeeCredentials();

	}
}
