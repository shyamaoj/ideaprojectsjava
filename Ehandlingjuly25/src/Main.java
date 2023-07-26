/*
import java.io.IOException;
class Main{
    void m()throws IOException{
        System.out.println("This is m method");
        throw new IOException("device error");//checked exception
    }
    void n()throws IOException{
        System.out.println("This is n metohd");
        m();
    }
    void p(){
        try{
            System.out.println("this is p metohd");
            n();
        }catch(Exception e){System.out.println("exception handled "+e);}
    }
    public static void main(String args[]){
        Main obj=new Main();
        obj.p();
        System.out.println("normal flow...");}}*/
import java.io.*;
import java.sql.SQLException;

class M{
    void method()throws IOException{
        System.out.println("This is m method");
        throw new IOException("device error");
    }

}
class N extends M{
    void show()throws SQLException
    {
        System.out.println("this is show");
        throw new SQLException("SQL ERROR");
    }
}
public class Main{
    public static void main(String args[]){
        try{
            M m=new M();
            m.method();
        }
        catch(Exception e){System.out.println("exception handled");}
        try {
            N n1=new N();
            n1.show();
        }
        catch (Exception e){
            System.out.println("exception handled 1");
        }
        System.out.println("normal flow...");
    }
}