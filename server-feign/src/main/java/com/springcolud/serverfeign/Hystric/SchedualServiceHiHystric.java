package com.springcolud.serverfeign.Hystric;
import com.springcolud.serverfeign.remote.HelloRemote123;
import org.springframework.stereotype.Component;

/**
 * @author haochen
 * @date 2019/9/16 14:32
 */
@Component
public class SchedualServiceHiHystric implements HelloRemote123 {
    @Override
    public String hello(String name) {
        return "【hello1】sorry " + name;
    }

    @Override
    public String hello1(String name) {
        return "【hello1】sorry " + name;
    }

    @Override
    public String oidGetNidList(String id) {
        return "【oidGetNidList】sorry " + id;
    }
}
