package SY;
public class SYMarks
{
    public int comp_tot,math_tot,elc_tot;

    public SYMarks(int comp_tot,int math_tot,int elc_tot)
    {
        this.comp_tot=comp_tot;
        this.math_tot=math_tot;
        this.elc_tot=elc_tot;
    }
    public void disp()
    {
        System.out.println(comp_tot+"\t"+math_tot+"\t"+elc_tot);
    }
}