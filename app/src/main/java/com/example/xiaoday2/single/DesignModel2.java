package com.example.xiaoday2.single;
//懒汉单例模式 ，只有用到对象才创建
public class DesignModel2 {
    private String name;
    private static DesignModel2 designModel2;

    private DesignModel2(String name) {
        this.name = name;
    }
    /**
     * 调用此方法时才懒懒的创建对象
     * @return
     * synchronized  加锁，把创建方法锁起来，保证同一时期只有一个线程进入，保证创建对象的唯一性
     */
    public static synchronized DesignModel2 getInstance(){
        if (designModel2==null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            designModel2=new DesignModel2("mm");
        }
        return designModel2;
    }
}
