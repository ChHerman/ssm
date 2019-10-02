DROP TABLE employee;
CREATE TABLE employee(
  `emp_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '员工ID',
  `emp_name` VARCHAR(30) NOT NULL COMMENT '员工名称',
  PRIMARY KEY(emp_id) COMMENT '主键'
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '员工信息表';

INSERT INTO employee(emp_name)
VALUES
  ('Jack'),
  ('Mark'),
  ('Bob'),
  ('July');