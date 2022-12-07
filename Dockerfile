FROM openjdk:19 as builder
COPY src/ /src/
RUN javac /src/com/xamma/*.java -d /app

FROM openjdk:19
COPY --from=builder /app /app
WORKDIR /app

CMD ["java", "com.xamma.Main"]