# Используем базовый образ с Java
FROM eclipse-temurin:21.0.2_13-jre

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем JAR-файл приложения в контейнер
COPY build/libs/app*.jar /app/app.jar

# Определяем порт, который будет открыт в контейнере
EXPOSE 8081

# Команда для запуска приложения
CMD ["java", "-jar", "app.jar"]