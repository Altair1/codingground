public abstract class Exercise
{
    private int num = -1;
    private String name = "";
    
    Exercise(String inName, int inNum)
    {
        num = inNum;
        name = inName;
    }
    public abstract void run();
    
    public void showInfo()
    {
        System.out.println("Name = " + name + " Num = " + num);
    }
}