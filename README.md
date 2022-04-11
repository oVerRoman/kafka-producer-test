# kafka-producer-test
Run docker-compose from project folder.

Send POST-request to URL http://localhost:8089/{key_id} with body:

{
"name":"employee_name",
"lastname": "employee_lastname",
"age": 25,
"position": {
"name": "Java-dev",
"experience": 2.5,
"hireDate": "18.01.2021"
}
}