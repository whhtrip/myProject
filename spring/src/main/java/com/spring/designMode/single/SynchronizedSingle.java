package com.spring.designMode.single;

/**
 * 使用同步函数效率低，建议使用同步代码块
 */
public class SynchronizedSingle {
    private static SynchronizedSingle synchronizedSingle = null;

    private SynchronizedSingle() {
    }

    public static SynchronizedSingle getInstance() {
        if (synchronizedSingle == null) {
            synchronizedSingle = new SynchronizedSingle();
        }
        return synchronizedSingle;
    }
}

class SynchronizedCode {
    private static SynchronizedCode synchronizedCode = null;

    private SynchronizedCode() {
    }

    public static SynchronizedCode getInstance() {
        synchronized (SynchronizedCode.class) {
            if (synchronizedCode == null) {
                synchronizedCode = new SynchronizedCode();
            }
            return synchronizedCode;
        }
    }
}

/**
 * 解决效率问题的代码,在同步之前判断
 */
class SynchronizedFast {
    private static SynchronizedFast synchronizedFast = null;

    private SynchronizedFast() {
    }

    public static SynchronizedFast getInstance() {
        if (synchronizedFast == null) {
            synchronized (SynchronizedFast.class) {
                /*
                 *为什么内部还需要一个判空？如果内部没有判空在多线程情况下不是单例？
                 */
                if (synchronizedFast == null) {
                    synchronizedFast = new SynchronizedFast();
                    return synchronizedFast;
                }
            }
        }
        return synchronizedFast;
    }
}
