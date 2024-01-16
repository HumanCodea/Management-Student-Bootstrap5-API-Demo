Create table Student(
    id int IDENTITY(1,1) Primary key,
    name_student nvarchar(50),
    BirthDay varchar(50),
    Classes nvarchar(50),
    Majors nvarchar(50),
    JPAs varchar(50)
)

Insert into Student (name_student,BirthDay,Classes,Majors,JPAs) values
   (N'Nguyễn Quý Thân','12/02/2004',N'CNTT03', N'Công nghệ thông tin', '3.6')

create table MyStudent(
    id int Primary key,
    name_student nvarchar(50),
    BirthDay varchar(50),
    Classes nvarchar(50),
    Majors nvarchar(50),
    JPAs varchar(50)
    Foreign key (id) references Student(id)
	    on UPDATE cascade on delete cascade
)
