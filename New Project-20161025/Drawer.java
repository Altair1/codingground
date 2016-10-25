class Drawer
{
    public void drawGameField()
    {
        for(int i =0; i < 2 * 10 + 1; ++i)
        System.out.print("_");
        System.out.print("\n");
        for(int i = 0 ; i < 10; ++i)
        {
            System.out.print("|");
            if(i != 9)
            {
                for(int j = 0; j < 10; ++j)
                    System.out.print(" |");
            }
            else
            {
                for(int j = 0; j < 10; ++j)
                    System.out.print("_|");
            }
            System.out.print("\n");
        }
        for(int i =0; i < 10; ++i)
        System.out.print("_");
            
    }
}