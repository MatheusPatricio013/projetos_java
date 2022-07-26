package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDAO {
    void insert(Department obj);

    void update(Department objs);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();
}