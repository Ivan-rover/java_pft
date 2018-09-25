package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;


public class DeleteContact extends TestBase {
	@Test
	public void testDeleteContact() {
		app.getNavigationHelper().gotoHome();
		if (!app.getContactHelper().isThereAContact()) {
			app.getContactHelper().createContact(new ContactData("la", "dada", "ul", "gtg"));
		}
		List<ContactData> before = app.getContactHelper().getContactList();
		app.getNavigationHelper().gotoHome();
		app.getContactHelper().selectContact(before.size() - 1);
		app.getContactHelper().deleteContact();
		app.getNavigationHelper().gotoHome();

		List<ContactData> after = app.getContactHelper().getContactList();
		Assert.assertEquals(after.size(), before.size() - 1);

		before.remove(before.size() - 1);
		Assert.assertEquals(before, after);
	}
}
	  // app.getContactHelper().initContactCreation();
//		   app.getContactHelper().fillContactForm(new ContactData("la","dada", "ul", "test1"),true);
//		   app.getContactHelper().submitContactCreation();
//		   app.getContactHelper().selectContact();
	  // app.getNavigationHelper().gotoHome();

		       //app.getContactHelper().selectContact();
//		       app.getContactHelper().deleteContact();


