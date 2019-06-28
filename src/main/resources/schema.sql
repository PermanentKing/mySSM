-- create database shiro default character set utf8;

drop table if exists sys_users;
drop table if exists sys_roles;
drop table if exists sys_permissions;
drop table if exists sys_users_roles;
drop table if exists sys_roles_permissions;

create table sys_users (
  id bigint auto_increment comment '编号',
  username varchar(100) comment '用户名',
  password varchar(100) comment '密码',
  salt varchar(100) comment '盐值',
  role_id varchar(50) comment '角色列表',
  locked bool default false comment '是否锁定',
  constraint pk_sys_users primary key(id)
) charset=utf8 ENGINE=InnoDB;
create unique index idx_sys_users_username on sys_users(username);

create table sys_roles (
  id bigint auto_increment comment '角色编号',
  role varchar(100) comment '角色名称',
  description varchar(100) comment '角色描述',
  pid bigint comment '父节点',
  available bool default false comment '是否锁定',
  constraint pk_sys_roles primary key(id)
) charset=utf8 ENGINE=InnoDB;
create unique index idx_sys_roles_role on sys_roles(role);

create table sys_permissions (
  id bigint auto_increment comment '编号',
  permission varchar(100) comment '权限编号',
  description varchar(100) comment '权限描述',
  rid bigint comment '此权限关联角色的id',
  available bool default false comment '是否锁定',
  constraint pk_sys_permissions primary key(id)
) charset=utf8 ENGINE=InnoDB;
create unique index idx_sys_permissions_permission on sys_permissions(permission);

create table sys_users_roles (
  id  bigint auto_increment comment '编号',
  user_id bigint comment '用户编号',
  role_id bigint comment '角色编号',
  constraint pk_sys_users_roles primary key(id)
) charset=utf8 ENGINE=InnoDB;

create table sys_roles_permissions (
  id bigint auto_increment comment '编号',
  role_id bigint comment '角色编号',
  permission_id bigint comment '权限编号',
  constraint pk_sys_roles_permissions primary key(id)
) charset=utf8 ENGINE=InnoDB;



-- userinfo table
CREATE TABLE userInfo
(
    id bigint(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    uuid varchar(255) DEFAULT NULL ,
    username varchar(255) DEFAULT NULL ,
    password varchar(255) DEFAULT NULL ,
    nickname varchar(255) DEFAULT NULL ,
    sex tinyint(3) DEFAULT '0',
    phone varchar(255) DEFAULT NULL ,
    email varchar(255) DEFAULT NULL ,
    iconPath varchar(255) DEFAULT NULL ,
);
CREATE UNIQUE INDEX table_name_id_uindex ON table_name (id);
CREATE UNIQUE INDEX table_name_username_uindex ON table_name (username);
CREATE UNIQUE INDEX table_name_nickname_uindex ON table_name (nickname);
CREATE UNIQUE INDEX table_name_uuid_uindex ON table_name (uuid);
ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息'

-- comment table
CREATE TABLE comments
(
    id bigint(20) PRIMARY KEY AUTO_INCREMENT,
    groupid varchar(255),
    username varchar(255),
    comment_detail varchar(255),
    comment_time DATETIME
);
CREATE UNIQUE INDEX comments_id_uindex ON comments (id);