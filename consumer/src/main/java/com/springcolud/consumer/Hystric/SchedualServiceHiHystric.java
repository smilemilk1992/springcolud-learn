package com.springcolud.consumer.Hystric;

import com.springcolud.consumer.remote.HelloRemote1;
import org.springframework.stereotype.Component;

/**
 * @author haochen
 * @date 2019/9/16 14:32
 */
@Component
public class SchedualServiceHiHystric implements HelloRemote1 {
    @Override
    public String hello1(String name) {
        return "【hello1】sorry "+name;
    }

    @Override
    public String oidGetNidList(String id) {
        return "【oidGetNidList】sorry "+id;
    }
}
