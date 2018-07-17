init-da.sql:
create table Cellphone(
      c_id integer primary key,--序列号
      c_brand varchar2(20),--品牌
      c_model varchar2(30),--型号
      c_os integer references os(o_id),--操作系统
      c_cpuBrand varchar2(10),--cpu品牌
      c_ram varchar2(20),--内存
      c_storage varchar2(20),--存储容量
      c_color varchar2(20),--颜色
      c_description varchar2(128),--描述
      c_price varchar2(128)--价格
)
create sequence cellphone_seq
select * from cellphone

insert into Cellphone values(
       cellphone_seq.nextval,
       '华为',
       '华为荣耀V10',
       3,
       '联发科',
       '6GB',
       '128GB',
       '黑色',
       '一个从未见过的全新版本',
       '278000'
)
insert into Cellphone values(
       cellphone_seq.nextval,
       'iPhone',
       'iPhone6',
       2,
       '联发科',
       '3GB',
       '16GB',
       '土豪金',
       '当时买还可以',
       '400000'
)
create table os(
       o_id integer primary key,
       o_name varchar2(20)
)
create sequence os_seq
insert into os values(
       os_seq.nextval,
       'IOS'
)
insert into os values(
       os_seq.nextval,
       'Android'
)
insert into os values(
       os_seq.nextval,
       'WindowsPhone'
)
select * from os