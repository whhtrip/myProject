package com.packageTool;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取所有的class文件
 */
public class ScanPackage {
    //需要扫描的包名
    String basePackage ="com";
    //存储路径
    List<String> classPahts = new ArrayList<String>();

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public List<String> getClassPahts() {
        return classPahts;
    }

    public void setClassPahts(List<String> classPahts) {
        this.classPahts = classPahts;
    }

    /**
     * 获取包下所有的类
     */
    public void searchClass() {
        String path = ScanPackage.class.getResource("/").getPath();
        System.out.println("当前路径为：" + path);

        //将包名转换为路径
        String routPath = path.replace(".", File.separator);

        String packagePath = routPath + basePackage;
        System.out.println("转换之后的路径为："+packagePath);
        doPath(new File(packagePath));
        for (String s : classPahts
        ) {
            System.out.println("路径为：" + s);
        }
    }

    /**
     * 获取所有类，将类的路径写到ClassPath中
     * @param file
     */
    private void doPath(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f: files
                 ) {
                doPath(f);
            }
        }else{
            if(file.getName().endsWith(".class")){
                classPahts.add(file.getPath());
            }
        }
    }

    /**
     * 实例化所有类名
     * @param list
     */
    public void instance(){
        for (String classPath:classPahts
             ) {
            System.out.println(classPath);
            //单个.注意
            classPath = classPath.split("\\.")[0].replace("\\",".").split("classes.")[1];
            //System.out.println(classPaths.length);
            //classPath = classPaths[0].replace("\\",".");
            System.out.println("当前类名为："+classPath);
            try {
                Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass(classPath);
                //Class<?> forName = Class.forName(classPath);
                Object instance = loadClass.newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ScanPackage scanPackage = new ScanPackage();
        scanPackage.searchClass();
        scanPackage.instance();
    }
}
