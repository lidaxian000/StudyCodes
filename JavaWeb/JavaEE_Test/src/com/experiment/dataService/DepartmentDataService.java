package com.experiment.dataService;

import java.util.ArrayList;

import com.experiment.servlet.DepartmentInfo;

public interface DepartmentDataService {
    ArrayList<DepartmentInfo> getDepartmentInfoService(String info);
}