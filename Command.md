Docker run CMD

Consul

MySQL
docker run --name mysql -p 3306:3306 --network="host" -e MYSQL_ROOT_PASSWORD=password -d mysql:8.3.0