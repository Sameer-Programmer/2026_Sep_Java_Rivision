package TestNgFolder.Test002Annotations;

import org.testng.annotations.*;

public class Test001 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }
}
/*
```

        ### Execution hierarchy

```text
@BeforeSuite
      ↓
@BeforeTest
      ↓
@BeforeClass
      ↓
@BeforeMethod
      ↓
@Test test1
      ↓
@AfterMethod
      ↓
@BeforeMethod
      ↓
@Test test2
      ↓
@AfterMethod
      ↓
@AfterClass
      ↓
@AfterTest
      ↓
@AfterSuite
```

This is a good basic class for revising the **TestNG annotation hierarchy**.

 */
