class rectangle
{
    
    int length,width;
    void accept(int l,int w)
    {
        length= l;
        width= w;
    }
    void display()
    {
        System.out.println("Length is "+length);
        System.out.println("Width is "+width);
    }
    void area()
    {
        int arr = length*width;
        System.out.println("Area is "+arr);
    }
    public static void main (String[] args) {
        rectangle r = new rectangle();
        r.accept(10,20);
        r.display();
        r.area();
    }
}