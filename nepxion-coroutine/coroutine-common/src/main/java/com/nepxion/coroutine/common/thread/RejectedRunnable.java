package com.nepxion.coroutine.common.thread;

/**
 * <p>Title: Nepxion Coroutine</p>
 * <p>Description: Nepxion Coroutine For Distribution</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

public interface RejectedRunnable extends Runnable {
    // 如果任务被拒绝，用户自行处理
    void rejected();
}