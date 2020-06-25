import org.testng.annotations.Test;

public class SimpleTestNG {
@Test(groups = { "sanity","regression" })
public void FirstTest()
{
	System.out.println("First Test");

}
@Test(groups = { "regression","sanity" })
public void SecondTest()
{
	System.out.println("Second Test");

}
}
