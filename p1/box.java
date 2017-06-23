package p;  
public class box
{
    int l,w,h;
    box(int ln,int wd,int ht)
    {
        l=ln;w=wd;h=ht;
    }
    public void print()
    {
        System.out.println("the volume ="+l*w*h);
    }
}
