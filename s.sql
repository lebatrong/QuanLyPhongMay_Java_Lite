﻿/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     11/9/2017 7:47:33 PM                         */
/*==============================================================*/

create database qlpm;

use qlpm;

drop table if exists GIANGDAY;

drop table if exists GIAOVIEN;

drop table if exists MAYTINH;

drop table if exists PHONGMAY;

/*==============================================================*/
/* Table: GIANGDAY                                              */
/*==============================================================*/

create table GIANGDAY
(
   TAIKHOAN             varchar(15) not null,
   MAPHONG              varchar(10) not null,
   NGAY                 date,
   TIET                 int,
   primary key (TAIKHOAN, MAPHONG)
);

/*==============================================================*/
/* Table: GIAOVIEN                                              */
/*==============================================================*/
create table GIAOVIEN
(
   TAIKHOAN             varchar(15) not null,
   MAPHONG              varchar(10),
   HOTEN                nvarchar(50),
   GIOITINH             nvarchar(4),
   NGAYSINH             date,
   HOCVI                nvarchar(100),
   SDT                  varchar(15),
   EMAIL                nvarchar(100),
   NOISINH              text,
   PASS                 varchar(20),
   QUYEN                int,
   primary key (TAIKHOAN)
);

/*==============================================================*/
/* Table: MAYTINH                                               */
/*==============================================================*/
create table MAYTINH
(
   MAMAY                varchar(15) not null,
   MAPHONG              varchar(10) not null,
   TINHTRANG            nvarchar(200),
   GHICHU               nvarchar(200),
   primary key (MAMAY)
);

/*==============================================================*/
/* Table: PHONGMAY                                              */
/*==============================================================*/
create table PHONGMAY
(
   MAPHONG              varchar(10) not null,
   TAIKHOAN             varchar(15),
   TENPHONG             nvarchar(50),
   VITRI                nvarchar(200),
   primary key (MAPHONG)
);

alter table GIANGDAY add constraint FK_GIANGDAY foreign key (TAIKHOAN)
      references GIAOVIEN (TAIKHOAN) on delete restrict on update restrict;

alter table GIANGDAY add constraint FK_GIANGDAY2 foreign key (MAPHONG)
      references PHONGMAY (MAPHONG) on delete restrict on update restrict;

alter table MAYTINH add constraint FK_THUOC foreign key (MAPHONG)
      references PHONGMAY (MAPHONG) on delete restrict on update restrict;



delimiter //

create procedure sp_Update_GiaoVien 

(
	
	in tk varchar(50),
	
	in ht nvarchar(50), 
	
	in gt nvarchar(10),
	
	in ns varchar(50),
	
	in hv nvarchar(50),
	
	in sdt varchar(20),
	
	in email varchar(200),
	
	in noisinh nvarchar(200)

)

begin
	
	UPDATE `qlpm`.`giaovien`
	
	SET
		
		`HOTEN` = ht,
		
		`GIOITINH` = gt,
		
		`NGAYSINH` = convert(ns,date),
		
		`HOCVI` = hv,
		
		`SDT` = sdt,
		
		`EMAIL` = email,
		
		`NOISINH` = noisinh
	
	WHERE `TAIKHOAN` = tk;

end //

delimiter ;

delimiter //

create procedure sp_BaoCaoTinhTrang
(
	in mm varchar(15),
    in mp varchar(10),
    in tt nvarchar(200),
    in gc nvarchar(200)
)
begin
	if not exists (select MAMAY from maytinh where MAMAY=mm)
    then
		INSERT INTO `qlpm`.`maytinh` (`MAMAY`,`MAPHONG`,`TINHTRANG`,`GHICHU`) 
        VALUES (mm,mp,tt,gc);
	else
		UPDATE `qlpm`.`maytinh`
		SET
		`TINHTRANG` = tt,
		`GHICHU` = gc
		WHERE `MAMAY` = mm;
	end if;
		
end //

delimiter ;

INSERT INTO `qlpm`.`phongmay` (`MAPHONG`,`TENPHONG`,`TAIKHOAN`)
VALUES ('A201',N'Phòng máy 1',''),
	('A202',N'Phòng máy 2',''),
        ('A203',N'Phòng máy 3',''),
        ('A204',N'Phòng máy 4',''),
        ('A205',N'Phòng máy 5',''),
        ('A206',N'Phòng máy 6','');
--
INSERT INTO `qlpm`.`giaovien`(`TAIKHOAN`,`HOTEN`,`GIOITINH`,`NGAYSINH`,`HOCVI`,`SDT`,`EMAIL`,`NOISINH`,`PASS`,`QUYEN`)
VALUES ('admin','Lê Bá Trọng','Nam','1997-09-27','Giáo Sư','0985350434','15004116@student.vlute.edu.vn','Vĩnh Long','1',0);



