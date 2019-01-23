package com.qnxy;


import com.qnxy.support.Sequence;

/**
 * 生成唯一主键
 *
 * @author QianNianXiaoYao
 * @serial 2018/12/25
 */
public class IdWorker {

    /**
     * 主机和进程的机器码
     */
    private static final Sequence worker = new Sequence();

    public static long getId() {
        return worker.nextId();
    }

    public static String getIdStr() {
        return String.valueOf(worker.nextId());
    }

}