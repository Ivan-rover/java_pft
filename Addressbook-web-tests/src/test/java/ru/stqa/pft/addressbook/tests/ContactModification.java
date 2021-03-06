package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;


public class ContactModification extends TestBase {
    @Test
    public void testContactModification() {
		app.getNavigationHelper().gotoHome();
		if (!app.getContactHelper().isThereAContact()) {
			app.getContactHelper().createContact(new ContactData("la","dada", "ul", "gtg"));
		}
		      List<ContactData> before = app.getContactHelper().getContactList();
		        app.getNavigationHelper().gotoHome();

		        app.getContactHelper().selectContact(before.size()-1);
		        app.getContactHelper().clickContactModification();
		       ContactData contact = new ContactData(before.get(before.size()-1).getId(), "bj","fgv", "fgv", null);
		        app.getContactHelper().fillContactForm(contact, false);
				app.getContactHelper().submitContactModification();
				app.getNavigationHelper().gotoHome();
		        List<ContactData> after = app.getContactHelper().getContactList();
		        Assert.assertEquals(after.size(), before.size());

		        before.remove(before.size()-1);
		        before.add(contact);
		        Comparator<? super ContactData> byId = (a1, a2) -> Integer.compare(a1.getId(), a2.getId());
		        before.sort(byId);
		        after.sort(byId);
		       Assert.assertEquals(before, after);
	}
}

//		if (!app.getContactHelper().isThereAContact()) {
//			app.getContactHelper().initContactCreation();
//			app.getContactHelper().fillContactForm(new ContactData("la", "dada", "ul", "test1"), true);
//			app.getContactHelper().submitContactCreation();
//
//		}
//		app.getNavigationHelper().gotoHome();
//		app.getContactHelper().selectContact();
//		app.getContactHelper().submitContactModification();
//		app.getNavigationHelper().gotoHome();
//	}
//}

	//	new WebDriverWait(wd, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("searchstring")));
		       /* app.getContactHelper().selectContact();
		        app.getContactHelper().fillContactForm(new ContactData("la","dada", "ul","null"), false);
		        app.getContactHelper().submitContactModification();
		        app.getNavigationHelper().gotoHome();
*/

