package cn.tedu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.tedu.dao.IDeptDao;
import cn.tedu.entity.Dept;

public class TestIUserDao {
	//1) ���������ļ�SqlMapConfig������SqlSessionFactory����
	private SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
			.build(TestIUserDao.class.getResourceAsStream("/SqlMapConfig.xml"));
	
	@Test
	public void testInsertDept() {
		//2) ����SqlSessionFatory��������SqlSession����
		SqlSession session = ssf.openSession();
		//3) ����SqlSession��getMapper�������ɲ���ȡָ���ӿ�ʵ����Ķ���
	 	IDeptDao dao = session.getMapper(IDeptDao.class);
	 	//4) �������ɵ�ָ���ӿ�ʵ����Ķ���ĸ��ַ�������ɶ����ݿ���ĸ��ֲ���
	 	Dept dept = new Dept();
	 	dept.setDeptName("����һ��");
	 	dept.setAddress("�żҸ�");
	 	dao.insertDept(dept);
	 	session.commit();//�ύ����
	 	//5) �ر�SqlSession�Ự
	 	session.close();
	}
	
	@Test
	public void testDeleteDept() {
		SqlSession session = ssf.openSession();
		IDeptDao dao = session.getMapper(IDeptDao.class);
		dao.deleteByID(1);
		session.commit();
		session.close();
	}
	
	@Test
	public void testUpdateDept() {
		SqlSession session = ssf.openSession();
		IDeptDao dao = session.getMapper(IDeptDao.class);
		Dept dept = new Dept();
		dept.setDeptName("��������");
		dept.setAddress("����");
		dept.setId(2);
		dao.updateDept(dept);
		session.commit();
		session.close();
	}
	
	@Test
	public void testSelectById() {
		SqlSession session = ssf.openSession();
		IDeptDao dao = session.getMapper(IDeptDao.class);
		Dept dept = dao.selectById(9);
		System.out.println(dept);
		session.close();
	}
	
	@Test
	public void testSelectAll() {
		SqlSession session = ssf.openSession();
		IDeptDao dao = session.getMapper(IDeptDao.class);
		List<Dept> list = dao.selectAll();
		for (Dept dept:list) {
			System.out.println(dept);
		}
		session.close();
	}
	
}




