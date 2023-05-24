import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {
    private Woman woman;

    @Test(description = "Check if a woman is not retired")
    public void testIsNotRetired(){
        woman = new Woman("Anna", "Last", 31, "Name", false,"LastNameOriginal");
        Assert.assertFalse(woman.isRetired());
    }

    @Test(description = "Check if a woman is retired")
    public void testIsRetired(){
        woman = new Woman("Bella", "LastName", 60, "LastName", false,"LastNameOriginal");
        Assert.assertTrue(woman.isRetired());
    }

    @Test(description = "Check if a woman is married")
    public void testRegisterPartnershipYes(){
        woman = new Woman("Bella", "LastName", 60, "LastName", false,"LastNameOriginal");
        Assert.assertEquals(woman.getLastName(), woman.getPartner());
    }

    @Test(description = "Check if a woman is not married")
    public void testRegisterPartnershipNo(){
        woman = new Woman("Anna", "Last", 31, "Name", false,"LastNameOriginal");
        Assert.assertNotEquals(woman.getLastName(), woman.getPartner());
    }

    @Test(description = "Check if a woman doesn't have a partner (register partnership)")
    public void testRegisterPartnershipNotMarried(){
        woman = new Woman("Lisa", "Yong", 60, null, false, "Yong");
        Assert.assertNull(woman.getPartner());
    }

    @Test(description = "Check if a woman is divorced")
    public void testDeregisterPartnershipYes(){
        woman = new Woman("Bella", "LastName", 60, "LastName", false,"LastNameOriginal");
        Assert.assertNotEquals(woman.getLastName(), woman.getLastNameOriginal());
    }

    @Test(description = "Check if a woman is not divorced")
    public void testDeregisterPartnershipNo(){
        woman = new Woman("Lisa", "Yong", 60, null, false, "Yong");
        Assert.assertEquals(woman.getLastName(), woman.getLastNameOriginal());
    }

    @Test(description = "Check if a woman doesn't have a partner (deregister partnership)")
    public void testDeregisterPartnershipNotMarried(){
        woman = new Woman("Lisa", "Yong", 60, null, false, "Yong");
        Assert.assertNull(woman.getPartner());
    }

    @Test(description = "Check if a woman has getLastNameOriginal()")
    public void testGetLastNameOriginal(){
        woman = new Woman("Lisa", "Yong", 60, null, false, "Yong");
        Assert.assertEquals(woman.getLastNameOriginal(), woman.getLastNameOriginal());
    }

    @Test(description = "Check if a woman has getLastNameOriginal() not NULL")
    public void testGetLastNameOriginalNotNull(){
        woman = new Woman("Lisa", "Yong", 60, null, false, "Yong");
        Assert.assertNotNull(woman.getLastNameOriginal());
    }

    @Test(description = "Check if a woman has setLastNameOriginal()")
    public void testSetLastNameOriginal(){
        woman = new Woman("Lisa", "Yong", 60, null, false, "Yong");
        String lastName = "";
        woman.setLastNameOriginal(lastName);
        Assert.assertEquals(woman.getLastNameOriginal(), lastName);
    }

    @Test(description = "Check if a woman has setLastNameOriginal() not NULL")
    public void testSetLastNameOriginalNotNull(){
        woman = new Woman("Lisa", "Yong", 60, null, false, "Yong");
        String lastName = "";
        woman.setLastNameOriginal(lastName);
        Assert.assertNotNull(woman.getLastNameOriginal());
    }

}
