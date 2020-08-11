package com.cjw.demo.ioUtil;

import java.io.File;

public class IO1 {

    public static void main(String[] args)throws Exception{
        //File file = new File("C:\\Users\\yangle\\Desktop\\frpClient");
        File file1 = new File("test.data");//直接写文件夹的话就是在本项目中添加
       // File file2 = new File("rers");//直接写文件夹的话就是在本项目中添加
        //boolean newFile1 = file.createNewFile();//创建新文件
        //boolean mkdir = file1.mkdir();//最后一层目录下一层文件夹可以不存在
        //boolean newFile = file1.mkdirs();//可以创建不存在的目录的文件夹
        //boolean delete = file1.delete();
        //boolean b = file1.renameTo(file2);//对文件改名
        //boolean exists = file.exists();
        //boolean b1 = file.canRead();//是否可读
        //boolean b2 = file.canWrite();//是否可写
        //File absoluteFile = file.getAbsoluteFile();//绝对路径，从盘符开始
        //file.list();获取该文件下所有文件
        //file.listFiles获取改文件夹下的所有文件属性

//        File[] f = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory()?true:false;
//            }
//        });

//        File[] files = file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return ("frpc.log".equals(name))?false:true;
//            }
//        });
//        for (File fd:f){
//            System.out.println(fd.getName());
//        }
        System.out.println(file1.createNewFile());
    }
}
