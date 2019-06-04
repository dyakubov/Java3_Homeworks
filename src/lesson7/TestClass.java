package lesson7;

public class TestClass {

    public TestClass(){

    }


    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1 completed");
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("Test 2 completed");
    }

    @Test(priority = 3)
    public void test3(){
        System.out.println("Test 3 completed");
    }

    @Test(priority = 9)
    public void test4(){
        System.out.println("Test 4 completed");
    }

    @Test(priority = 5)
    public void test5(){
        System.out.println("Test 5 completed");
    }

    @Test(priority = 6)
    public void test6(){
        System.out.println("Test 6 completed");
    }

    @Test(priority = 7)
    public void test7(){
        System.out.println("Test 7 completed");
    }

    @Test(priority = 8)
    public void test8(){
        System.out.println("Test 8 completed");
    }

    @Test(priority = 9)
    public void test9(){
        System.out.println("Test 9 completed");
    }

    @Test(priority = 10)
    public void test10(){
        System.out.println("Test 10 completed");
    }

    @BeforeSuite
    public void before(){
        System.out.println("Before method completed");
    }

    @BeforeSuite
    public void before2(){
        System.out.println("Before2 method completed");
    }

    @AfterSuite
    public void after(){
        System.out.println("After method completed");
    }



}
