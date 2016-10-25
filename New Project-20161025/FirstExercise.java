class FirstExercise extends Exercise
{
    FirstExercise()
    {
        super("FirstExercise", 1);
    }
    public void run()
    {
       char escCode = 0x1B;
       int row = 10; int column = 10;
       System.out.print(String.format("%c[%d;%df",escCode,row,column));
       System.out.print("Run first exercisessssss");
    }
}