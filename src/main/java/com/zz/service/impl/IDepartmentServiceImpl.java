package com.zz.service.impl;

import com.zz.dao.IDepartmentMapper;
import com.zz.entity.Department;
import com.zz.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Zhou Wenzhe
 * @date 2018/6/25
 */
@Service
@Transactional
public class IDepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private IDepartmentMapper iDepartmentDao;

    @Override
    public List<Department> getDepts() {
        return iDepartmentDao.getDepts();
    }
}
