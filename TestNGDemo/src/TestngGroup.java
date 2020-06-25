import org.testng.annotations.Test;

public class TestngGroup {

	
	@Test(groups = { "sanity" })
	public void Car()
	{
		System.out.println("Belongs to the Car Type");
	}
	@Test(groups = { "regression" })
	public void Bike()
	{
		System.out.println("Belongs to the Bike Type");
	}
	@Test(groups = { "regression" })
	public void RacingCar()
	{
		System.out.println("Belongs to the Rcing Car Type");
	}
	@Test(groups = { "regression" })
	public void FamilyCar()
	{
		System.out.println("Belongs to the Family Car Type");
	}
}
