# java-containerization
What we have here is a Basic Java Web Application. It serves one endpoint `http://localhost:8080/welcome`
Which prints out a welcome message -> _Hey there! Welcome to the world of containers._

We have a Dockerfile which packages this JAR into a container. One functionality that the application has
is that if we have an Environment Variable with the Key 'NAME' with the value 'Rohit'. The Welcome message 
changes to -> _Hey *Rohit*! Welcome to the world of containers._ 
