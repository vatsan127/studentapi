School management app using Streams | JDBC | Spring Data Jpa | MySql

URI paths :
Admin details : http://localhost:8000/api/v1/admin/
Get Student : http://localhost:8000/api/v1/students/1
Get All Students : http://localhost:8000/api/v1/students/
Add new Student : http://localhost:8000/api/v1/students/create
Delete student : http://localhost:8000/api/v1/students/delete/1

Sample Input Request:
{
    "name": "SRIVATSAN",
    "age": 22,
    "degree": "B.Tech",
    "branch": "ECE"
}

Sample Input Response:
[
    {
        "id": 2,
        "name": "SRIVATSAN",
        "age": 22,
        "degree": "B.Tech",
        "branch": "ECE"
    }
]