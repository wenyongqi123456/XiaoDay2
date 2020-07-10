package com.example.xiaoday2.single;

// * 关键点:
//         *     (1).私有构造函数;
//         *     (2).通过一个静态方法或者枚举返回单例类对象;
//         *     (3).确保单例类的对象有且只有一个,尤其是多线程环境下;
//         *     (4).确保単例类对象在反序列化时不会重新构建对象.
//         *
//         *     饿汉模式
public class DesignModel {
    private String name;
    private static DesignModel cao = new DesignModel("号");

    private DesignModel(String name) {
        this.name = name;
    }

    public static DesignModel getInstance() {
        return cao;
    }

}
