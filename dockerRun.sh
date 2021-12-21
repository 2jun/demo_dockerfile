# demo-docker docker打包的image名
docker build -t demo-docker .
docker stop demo-docker
docker rm demo-docker
docker run -p 8080:8080 --name demo-docker -d demo-docker