package top.lilong.Exception_;

public class ExceptionTest {
//    public static void main(String[] args) {
////        try{
////            Class.forName("test");
////        }catch (ClassNotFoundException e){
////            e.printStackTrace();
////        }finally {
////            //最后必须执行的部分
////        }
//    }
    private boolean test01(){
        boolean ret=true;
        try{
            ret=test02();
        }catch (Exception e){
            System.out.println("test01 error:" + e.getMessage());
            ret=false;
        }finally {
            System.out.println("test01,finally,return ->" +ret);
            return  ret;
        }
    }
    private boolean test02(){
        boolean ret =true;
        try{
            test03();
            System.out.println("因为test03报错，我不该执行。");
            return ret;
        }catch (Exception e){
            System.out.println("test02 finally,return->"+ret);
            return ret;
        }
    }
    private boolean test03(){
        boolean ret = true;
        try{
            System.out.println("即将发生异常");
            int a=1/0;
            System.out.println("发生异常后，还会执行我吗");
            return true;
        }catch (Exception e){
            System.out.println("test03 error:"+e.getMessage());
            ret = false;
            throw  e;
        }finally {
            System.out.println("test03 finally,return->" + ret);
            return  ret;
        }
    }

    public static void main(String[] args) {
        ExceptionTest main=new ExceptionTest();
        try{
            boolean b =main.test01();
            System.out.println(b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
