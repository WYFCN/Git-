interface A{
   void a();
}
interface B{
    void b();
}
class BIml implements B{

    @Override
    public void b() {
        System.out.println("我是B。。。。。。。。。");
    }
}
class Adapter extends BIml implements A{

    @Override
    public void a() {
        b();
    }
}
public class Test01{
    public static void main(String[] args) {
        A aa = new Adapter();
        aa.a();
    }
}