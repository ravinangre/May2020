import org.testng.annotations.Test;

public class InheritedDependencyTest extends Superclass {
	@Test(dependsOnMethods = { "OpenBrowser" })
    public void LogIn() {
        System.out.println("Logged In");
    }
}
