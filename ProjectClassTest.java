public class ProjectClassTest {
    public static void main(String[] args)  {
        ProjectClass test1 = new ProjectClass("Cristo Sparks", "Master RAM destroyer. Keeper of the Recursion Loops", 50000.00);
        System.out.println(test1.elevatorPitch());
        System.out.println("End of Test 1");
        test1.setName("Mr.Sparks");
        test1.setDescription("Computer Programmer");
        test1.setCost(45000.00);
        System.out.println(test1.elevatorPitch());
        System.out.println("End of Test 2");
    }
}
