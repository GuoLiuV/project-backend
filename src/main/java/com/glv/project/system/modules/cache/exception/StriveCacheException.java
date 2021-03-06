package com.glv.project.system.modules.cache.exception;

import com.glv.project.system.modules.exception.StriveException;

/**
 * @author ZHOUXIANG
 */
@SuppressWarnings("unused")
public class StriveCacheException extends StriveException {

    public StriveCacheException() {
        super("缓存配置异常");
    }

    public StriveCacheException(String message) {
        super(message);
    }
}
