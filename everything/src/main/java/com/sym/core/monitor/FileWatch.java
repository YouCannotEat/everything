package com.sym.core.monitor;

import com.sym.core.model.HandlePath;

public interface FileWatch {
    //监听启动
    void start();
    //监听停止
    void stop();
    //监听目录
    void monitor(HandlePath handlePath);
}
