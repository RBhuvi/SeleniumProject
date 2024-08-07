package hookks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import project1.BaseClasss;

public class HookClasss extends BaseClasss{
@Before(order=3)
public void beforeScenario()
{
	System.out.println("Thanos collecting infinity stones");
}
@Before(order=-3)
public void beforeScenario1()
{
	System.out.println("Thanos has born");
}
@After(order=3)
public void afterScenario()
{
	System.out.println("After killing everyone,taking rest in garden");
}
@After(order=-3)
public void afterScenario1()
{
	System.out.println("Atlast he also dead");
}
}

