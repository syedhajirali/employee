FROM mysql:latest
# Add a database
ENV MYSQL_DATABASE=employeeDB
ENV MYSQL_ROOT_PASSWORD=password
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=root
ENV MYSQL_HOST=127.0.0.1
EXPOSE 3306
# Add the content of the sql-scripts/ directory to your image
# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
COPY ./sql-scripts/ /docker-entrypoint-initdb.d/
