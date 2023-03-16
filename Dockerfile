FROM openjdk:11
ADD build/libs/coupon-service-0.0.1-SNAPSHOT.jar coupon-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "coupon-service-0.0.1-SNAPSHOT.jar" ]