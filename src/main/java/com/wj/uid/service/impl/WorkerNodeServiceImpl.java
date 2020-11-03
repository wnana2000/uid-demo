package com.wj.uid.service.impl;

import com.baidu.fsg.uid.UidGenerator;
import com.wj.uid.service.WorkerNodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WorkerNodeServiceImpl implements WorkerNodeService {

    @Resource
    private UidGenerator uidGenerator;

    @Override
    public long genUid() {
        return uidGenerator.getUID();
    }
}
