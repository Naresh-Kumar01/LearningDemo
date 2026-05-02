
FROM eclipse-temurin:17

# Maven install karo
RUN apt-get update && apt-get install -y maven

WORKDIR /app

# Pehle pom.xml copy karo (dependencies cache ke liye)
COPY pom.xml .

# Dependencies download karo
RUN mvn dependency:go-offline -B

# Baaki saara code copy karo
COPY . .

# Tests run karo
CMD ["mvn", "test"]