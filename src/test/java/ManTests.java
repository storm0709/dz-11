import org.example.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {
    private Man man;

    @Test(description = "Check if a man is not retired")
    public void testIsNotRetired(){
        man = new Man("Bob", "Last", 31, "Name", false);
        Assert.assertFalse(man.isRetired());
    }

    @Test(description = "Check if a man is retired")
    public void testIsRetired(){
        man = new Man("John", "LastName", 65, "LastName", false);
        Assert.assertTrue(man.isRetired());
    }

    @Test(description = "Check if a man is married")
    public void testRegisterPartnershipYes(){
        man = new Man("John", "LastName", 60, "LastName", false);
        Assert.assertEquals(man.getLastName(), man.getPartner());
    }

    @Test(description = "Check if a man is not married")
    public void testRegisterPartnershipNo(){
        man = new Man("Bob", "Last", 31, "Name", false);
        Assert.assertNotEquals(man.getLastName(), man.getPartner());
    }

    @Test(description = "Check if a man doesn't have a partner (register partnership)")
    public void testRegisterPartnershipNotMarried(){
        man = new Man("John", "Yong", 60, null, false);
        Assert.assertNull(man.getPartner());
    }

    @Test(description = "Check if a man is divorced")
    public void testDeregisterPartnershipYes(){
        man = new Man("John", "LastName", 60, "LastName", false);
        Assert.assertFalse(man.isDevorced());
    }

    @Test(description = "Check if a man is not divorced")
    public void testDeregisterPartnershipNo(){
        man = new Man("Bob", "Yong", 60, null, true);
        Assert.assertTrue(man.isDevorced());
    }

    @Test(description = "Check if a man doesn't have a partner (deregister partnership)")
    public void testDeregisterPartnershipNotMarried(){
        man = new Man("Bob", "Yong", 60, null, false);
        Assert.assertNull(man.getPartner());
    }
}

