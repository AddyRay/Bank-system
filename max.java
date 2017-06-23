class max
{
    int a,b,c;
    
    void getdata(int i,int j,int k)
    {
        a=i;
        b=j;
        c=k;
    }
    void printdata()
    {
        System.out.println("a =" + a +" "+"b =" + b +" "+ "c =" + c);
    }
    public static void main(String args[])
    {
        max m1=new max();
        m1.getdata(10,8,-3);
        m1.printdata();
        if(m1.a>m1.b && m1.a>m1.c)
            System.out.println("largest is" + m1.a);
        else if(m1.b>m1.a && m1.b>m1.c)
            System.out.println("largest is" + m1.b);
        else
            System.out.println("largest is" + m1.c);
    }
}
        
