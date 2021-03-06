package com.experiment.dataServiceImp;

import java.util.ArrayList;

import com.experiment.dao.DepartmentDao;
import com.experiment.daoImp.DepartmentDaoImp;
import com.experiment.dataService.DepartmentDataService;
import com.experiment.servlet.DepartmentInfo;

public class DepartmentDataServiceImp implements DepartmentDataService {
    DepartmentDao dd = new DepartmentDaoImp();
    @Override
    public ArrayList<DepartmentInfo> getDepartmentInfoService(String info) {
        return dd.getDepartmentInfo(info);
    }
}
