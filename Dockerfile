# Usa una imagen base con JDK para compilar
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Copia el código fuente
WORKDIR /app
COPY . .

# Compila y empaqueta el proyecto
RUN mvn clean package -DskipTests

# Usa una imagen más ligera solo con JRE para ejecutar
FROM eclipse-temurin:17-jre

# Copia el JAR generado desde la etapa de build
COPY --from=build /app/target/*.jar app.jar

# Expone el puerto dinámico que Render asigna
ENV PORT=8080
EXPOSE 8080

# Comando de inicio
ENTRYPOINT ["java","-jar","app.jar"]
