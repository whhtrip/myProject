package com.dynamicdatasource.mybatisConfig;

import javax.sql.DataSource;
import java.util.Stack;

public class MultiDataSourceManager {
    private static ThreadLocal<MultiDataSourceManager> threadLocal = new ThreadLocal<>();
    private Stack<DataSource> stack = new Stack<>();

    public static MultiDataSourceManager getManager() {
        MultiDataSourceManager multiDataSourceManager = threadLocal.get();
        if (null == multiDataSourceManager) {
            threadLocal.set(new MultiDataSourceManager());
        }
        return threadLocal.get();
    }
    public DataSource peek(){
        return stack.peek();
    }
    public DataSource pop(){
        return stack.peek();
    }
}
