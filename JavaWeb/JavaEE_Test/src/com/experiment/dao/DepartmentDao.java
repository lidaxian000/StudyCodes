package com.experiment.dao;

import java.util.ArrayList;

import com.experiment.servlet.DepartmentInfo;

public interface DepartmentDao {
	ArrayList<DepartmentInfo> getDepartmentInfo(String info);
}
