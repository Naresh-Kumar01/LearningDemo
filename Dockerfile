
FROM openjdk:17

WORKDIR /app

COPY . /app

RUN echo "Build Complete"

CMD ["echo", "App is Running!"]

