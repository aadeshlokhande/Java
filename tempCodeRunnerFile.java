blic class PatternAlpha
{
    public static void main(String[] args)
    {
        String alpha[][] = {
            {"   ###    ","  ## ##   "," ##   ##  ","##     ## ","######### ","##     ## ","##     ## "},
            {"########  ","##     ## ","##     ## ","########  ","##     ## ","##     ## ","########  "}
        };
        
        for(int i = 0; i<7; i++)
        {
            System.out.println(alpha[1][i]);
        }
    }
}