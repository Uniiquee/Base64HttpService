# Base64HttpService
A sample [Micronaut](https://micronaut.io/) application which provides base64 convert functionality at the endpoint POST /convertToBase64 . 
Set the input which should be converted as a request body. The media type of the request body must be application/octet-stream.

# Docker

Use docker-compose up to get an instance of the serivce. The endpoints are exposed on port 8080 but this can be changed inside the docker-compose.yml file.
