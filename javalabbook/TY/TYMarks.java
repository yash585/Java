package TY;
public class TYMarks
{
    public int theory,practicals;
    public TYMarks(int theory,int practicals)
    {
        this.theory=theory;
        this.practicals=practicals;
    }

    public void disp()
    {
        System.out.println(theory+"\t"+practicals);
    }
    

}
