package com.wj.uid.controller;


import com.wj.uid.service.WorkerNodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * <p>
 *  生成批量id接口
 * </p>
 *
 * @author huzhiting
 * @since 2020-04-20
 */
@RestController
@RequestMapping("/seq")
public class IdGeneratorController {


    @Resource
    private WorkerNodeService workerNodeService;
   
    @GetMapping("/uid")
    public long baiduUid(){
        long uid = workerNodeService.genUid();
        return uid;
    }
}
